package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.College;
import com.nt.comp.ContactsInfo;
import com.nt.comp.Fruits;
import com.nt.comp.MarksInfo;
import com.nt.comp.UniversityInfo;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MarksInfo info=null;
		College cg=null;
		ContactsInfo ci=null;
		UniversityInfo ui=null;
		Fruits fruits=null;
		//create IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get bean class obj
	//	info=factory.getBean("mk",MarksInfo.class);
		cg=factory.getBean("cg",College.class);
		ci=factory.getBean("ci",ContactsInfo.class);
		ui=factory.getBean("Ui",UniversityInfo.class);
		fruits=factory.getBean("fi",Fruits.class);
		System.out.println(cg);
		System.out.println(ui);
		System.out.println(fruits);

	}

}
