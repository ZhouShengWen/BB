package com.zsw.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zsw.dao.bbdao;

public class Test {
	public static void main(String[] args) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		 bbdao bd = ac.getBean(bbdao.class);
		 bd.cha1();
	}
}
