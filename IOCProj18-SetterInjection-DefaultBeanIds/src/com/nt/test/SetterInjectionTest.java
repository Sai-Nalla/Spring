package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null,generator1=null;
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//hold the resource obj
		factory=new XmlBeanFactory(res);
		//get bean class obj
		generator=(WishMessageGenerator)factory.getBean("com.nt.beans.WishMessageGenerator");
		//call generator class method
		System.out.println(generator.generateMessage("Sai"));
		generator1=(WishMessageGenerator)factory.getBean("com.nt.beans.WishMessageGenerator#1");
		//call generator class method
		System.out.println(generator.generateMessage("Vinay"));

	}

}
