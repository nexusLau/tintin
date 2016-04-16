package cn.com.tintin.listener;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import cn.com.tintin.thread.CycleJobThread;

/**
 * Application Lifecycle Listener implementation class CycleListener
 *
 */
@WebListener
public class CycleListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public CycleListener() {
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    	executor.scheduleWithFixedDelay( new CycleJobThread(), 0, 100, TimeUnit.SECONDS);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    }
	
}
