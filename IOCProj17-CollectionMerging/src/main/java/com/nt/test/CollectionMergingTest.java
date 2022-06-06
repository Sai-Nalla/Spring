package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.EnggCourse;


public class CollectionMergingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
	EnggCourse cse=null,ece=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean class obj
		cse=factory.getBean("CSE",EnggCourse.class);
		System.out.println(cse);
		System.out.println("--------------------------------------");
		ece=factory.getBean("ECE",EnggCourse.class);
		System.out.println(ece);
	}

}
