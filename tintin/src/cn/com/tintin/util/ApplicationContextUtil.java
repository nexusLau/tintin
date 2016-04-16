package cn.com.tintin.util;

import java.lang.annotation.Annotation;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 获取Spring的applicationContext以及相关的bean
 * @author LiuMaoyang
 *
 */
@Service
public class ApplicationContextUtil  implements ApplicationContextAware{
	
	private  static ApplicationContext applicationContext;
	
	/**
	 * 通过class获取beans
	 * @param requiredType
	 * @return
	 */
	public static <T> T getBean( Class<T> requiredType){
		return 	applicationContext.getBean(requiredType);
	}
	/**
	 * 通过beanName获取bean
	 * @param beanName
	 * @return
	 */
	public static<T> T getBean(final String beanName){
		return (T) applicationContext.getBean(beanName);
	}
	
	  /**
     * {@link ApplicationContext#getBean(Class)} 获取spring beans
     * 
     * @param <T>
     *            T
     * 
     * @param requiredType
     *            bean类型
     * @return 对应的bean
     * 
     */final
    public static <T> Map<String, T> getBeans( Class<T> requiredType) {
        return applicationContext.getBeansOfType(requiredType);
    }

    /**
     * 从annotation提取bean清单
     * 
     * @param annotationType
     *            annotation类型c
     * @return 标注了该annotation的beans
     */
    public static Map<String, Object> getBeansWithAnnotation(final Class<? extends Annotation> annotationType) {
        return applicationContext.getBeansWithAnnotation(annotationType);
    }
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		
	}
	


}

