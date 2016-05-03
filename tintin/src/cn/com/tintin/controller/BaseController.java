package cn.com.tintin.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import cn.com.tintin.util.TimeStampPropertyEditor;

/**
 * 
 * 作者： liumaoyang
 *
 * 创建时间：2016-4-29 下午5:31:14
 * 
 * 实现功能：基础的baseController
 */
public class BaseController {
	
	  private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	  private static final String TIME_FORMAT="yyyy-MM-dd HH:mm:ss";
	  
	    /**
	     * 数据绑定的方法
	     * @param binder
	     */
	    @InitBinder
	    protected void initBinder(final WebDataBinder binder) {
	        binder.registerCustomEditor(Date.class, new CustomDateEditor( DATE_FORMAT, true));
	        binder.registerCustomEditor(Timestamp.class, new TimeStampPropertyEditor(TIME_FORMAT));
	    }
}
