package com.zsw.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cspring {
	
	/**
	 * 使用该静态方法换回一个ApplicationContext
	 * */
	public static ApplicationContext ac() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		return ac;
	}
}
