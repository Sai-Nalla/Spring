package com.nt.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Flipkart fp=null;
	//Load Spring Bean Configuratin File and create Bean factory
		factory=new XmlBeanFactory(new  ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Spring bean Class Obj
		fp=factory.getBean("fpkt",Flipkart.class);
		System.out.println(fp.Shopping(new String [] {"raincoat","umberalla","tablets"},
				new float [] {5000,2000,5000}));
		
	}

}
