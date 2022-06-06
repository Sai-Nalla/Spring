package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.ProfessionalCricketer;



public class InnerBeanTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		ProfessionalCricketer cricketer1=null,cricketer2=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean class obj
		cricketer1=factory.getBean("kohli",ProfessionalCricketer.class);
		System.out.println(cricketer1);
		
		cricketer2=factory.getBean("Dhoni",ProfessionalCricketer.class);
		System.out.println(cricketer2);
		
		
	}

}
