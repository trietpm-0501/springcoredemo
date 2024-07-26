package com.springaspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) throws Exception {
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Hello hello = (Hello) context.getBean("hello");
	    hello.method1();
	  
	    hello.method2();
	
	    hello.method3();
	  }
}
