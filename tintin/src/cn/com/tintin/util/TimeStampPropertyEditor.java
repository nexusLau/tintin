package cn.com.tintin.util;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;

import com.alibaba.druid.util.StringUtils;

/**
 * Springmvc数据绑定时间戳的通用方法
 * @author LiuMaoyang
 *
 */
public class TimeStampPropertyEditor extends PropertyEditorSupport {
	
	 private String pattern = "yyyy-MM-dd HH:mm:ss.S";
	 
	 private String[] formater_pattern = new String[] { "yyyy-MM-dd HH:mm:ss.S",
	            "yyyy-MM-dd HH:mm:ss" };
	 
	 public TimeStampPropertyEditor() {
	        // TODO Auto-generated constructor stub
	    }
	 
    public TimeStampPropertyEditor(String pattern) {
        // TODO Auto-generated constructor stub
        this.pattern = pattern;
    }
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.isEmpty(text)) {
            setValue(null);
        } else {
            try {
                 Date date = DateUtils.parseDate(text, formater_pattern);
                Timestamp timestamp = new Timestamp(date.getTime());
                //              设置转换完的值
                setValue(timestamp);
            } catch (ParseException e) {
                e.printStackTrace();
                setValue(null);
            }
        }
 
    }
 
    /*
     * (non-Javadoc)
     * 
     * @see java.beans.PropertyEditorSupport#getAsText()
     */
    @Override
    public String getAsText() {
        //  获取model的值
        Timestamp value = (Timestamp) getValue();
        if (value == null) {
            return "";
        } else {
            try {
                Date date = new Date(value.getTime());
                String str = DateFormatUtils.format(date, pattern);
                return str;
            } catch (Exception e) {
                return "";
            }
        }
 
    }
}
