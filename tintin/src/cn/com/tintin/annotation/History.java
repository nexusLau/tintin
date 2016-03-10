package cn.com.tintin.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 实现历史信息的自定义注解
 * @author LiuMaoyang
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface History {
	
	public String name();//产生映射的表名
	
}
