package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Car;


public class BeanInheriteceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
	
		Car Rajacar1=null,rajacar2=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean class obj
		Rajacar1=factory.getBean("RajaCar1",Car.class);
		System.out.println(Rajacar1);
		System.out.println("-----------------------------");
		rajacar2=factory.getBean("RajaCar2",Car.class);
		System.out.println(rajacar2);
	
	}

}
