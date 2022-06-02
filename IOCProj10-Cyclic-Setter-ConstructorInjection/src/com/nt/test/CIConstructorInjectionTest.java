package com.nt.test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.A;
import com.nt.comp.B;

public class CIConstructorInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		A a=null;
		B b=null;
		//create IOc Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean class obj
		//a=factory.getBean("a1",A.class);
		b=factory.getBean("b1",B.class);
		System.out.println(b);
		

	}

}
