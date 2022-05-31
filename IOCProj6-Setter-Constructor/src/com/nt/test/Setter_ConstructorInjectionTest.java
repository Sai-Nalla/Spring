package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Student;

public class Setter_ConstructorInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Student st=null;
	//Load Spring Bean Configuratin File and create Bean factory
		factory=new XmlBeanFactory(new  ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		st=factory.getBean("st",Student.class);
		System.out.println(st);

	}

}
