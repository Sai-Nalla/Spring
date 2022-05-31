package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Marks;

public class ResolvingConstructorParamTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Marks mk=null;
	//Load Spring Bean Configuratin File and create Bean factory
		factory=new XmlBeanFactory(new  ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);

	}

}
