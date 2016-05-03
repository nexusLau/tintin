package cn.com.tintin.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.tintin.controller.LoginController;

import lombok.extern.java.Log;

public class UrlRewriterFilter implements Filter{
	
	private  Logger log = LoggerFactory.getLogger(UrlRewriterFilter.class);
	    /**
	     * 不处理的uri
	     */
	    private List<String> excludes = new ArrayList<String>();
	    /**
	     * 进行处理的url
	     */
	    private LinkedHashMap<String, String> includes = new LinkedHashMap<String, String>();
	

	@Override
	public void destroy() {
		   this.includes = null;
	       this.excludes = null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
        String uri = req.getRequestURI();
        uri = uri.replace(req.getContextPath(), "");
        // 判断是否在不包含的里面
        boolean exclude = false;
        for (String str : excludes) {
            exclude = uri.matches(str);
            if (exclude) {
                log.info("匹配：" + str);
                break;
            }
        }
        if (exclude) {
            log.info("非过虑选项：" + excludes + " 直接放行：" + uri);
            chain.doFilter(request, response);
        } else {
            String forward = null;
            for (Entry<String, String> en : this.includes.entrySet()) {
                if (uri.matches(en.getKey())) {
                    log.info("匹配：" + en.getKey() + " to " + en.getValue());
                    Pattern pattern = Pattern.compile(en.getKey());
                    Matcher matcher = pattern.matcher(uri);
                    boolean boo = matcher.matches();// 再次进行判断
                    if (boo) {
                        int count = matcher.groupCount();
                        matcher.reset();
                        forward = en.getValue();
                        if (matcher.find()) {// 是否有匹配项目
                            for (int i = 1; i <= count; i++) {
                                String replaceStr = matcher.group(i);
                                forward = forward.replace("$" + i, replaceStr);
                            }
                        }
                        break;
                    }
                }
            }
            if (forward != null) {
                log.info("替换以后的uri：" + forward);
                req.getRequestDispatcher(forward).forward(request, response);
            } else {
                log.info("没有匹配:/(.+)\\.htm直接放行:" + uri);
                chain.doFilter(request, response);
            }
        }
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		  // 判断是否在初始化配置中有exclude的配置
        String excludes = config.getInitParameter("excludes");
        if (excludes == null) {
            this.excludes.add(".*\\.css");
            this.excludes.add(".*\\.js");
            this.excludes.add(".*\\.png");
            this.excludes.add(".*\\.jpg");
            this.excludes.add("/static/.*");
            this.excludes.add("/");// 只匹配一个/即主页
            this.excludes.add("/index.html");// 直接匹配主页，不过虑
            log.info("默认excludes:" + this.excludes);
        } else {
            this.excludes.addAll(Arrays.asList(excludes.split(",")));
            log.info("配置excludes:" + this.excludes);
        }
 
        String includes = config.getInitParameter("includes");
        if (includes == null) {// 如果没有配置，则使用默认选项
            // 默认值将任意的转发到指定的目录
            this.includes.put("/(.*)\\.html", "/WEB-INF/jsps/$1.jsp");
        } else {
            // 去除里面所有的空格
            String[] strs = includes.replaceAll("\\s", "").split(",");
            for (String str : strs) {
                String[] ms = str.split(":");
                this.includes.put(ms[0], ms[1]);
            }
            log.info("配置的过虑信息：" + this.includes);
        }
		
	}

}
