package cn.com.tintin.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import cn.com.tintin.util.TimeStampPropertyEditor;

public class BaseController {
	
	
	  private static final DateFormat DATE_FORMAT = new SimpleDateFormat(
	            "yyyy-MM-dd");
	  private static final String TIME_FORMAT="yyyy-MM-dd HH:mm:ss";
	  
	    @InitBinder
	    protected void initBinder(final WebDataBinder binder) {
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(
	                DATE_FORMAT, true));
	        binder.registerCustomEditor(Timestamp.class,
	                new TimeStampPropertyEditor(TIME_FORMAT));
	    }


}
