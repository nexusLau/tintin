package cn.com.tintin.thread;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.SyslogOutputStream;

public class ScheduleJob  implements Runnable{

	@Override
	public void run() {
		System.out.println("这是通过Spring调用的周期任务");
	}

}
