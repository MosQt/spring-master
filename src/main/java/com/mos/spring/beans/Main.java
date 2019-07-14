package com.mos.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("MosQ");
		//1,创建spring的IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2,从IOC容器中创建Beans实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//3，调用hello方法
		helloWorld.hello();
	}
}
