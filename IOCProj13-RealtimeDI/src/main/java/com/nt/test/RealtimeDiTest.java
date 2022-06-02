package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Controller.MainController;
import com.nt.vo.CustomerVo;

public class RealtimeDiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController controller=null;
		CustomerVo vo=null;
		String name,addr=null;
		int pamt,rate,time=0;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		controller=factory.getBean("controller",MainController.class);
		Scanner sc=new Scanner(System.in);
		vo=new CustomerVo();
		System.out.println("Enter name:");
		name=sc.next();
		vo.setCname(name);
		System.out.println("Enter Addr:");
		addr=sc.next();
		vo.setAddr(addr);
		System.out.println("Enter Principal amount:");
		pamt=sc.nextInt();
		vo.setPamt(pamt);
		System.out.println("Enter Time");
		time=sc.nextInt();
		vo.setTime(time);
		System.out.println("Enter RAte of Intrest:");
		rate=sc.nextInt();
		vo.setRate(rate);
		try {
			System.out.println(controller.ProcessEmployeeDetails(vo));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
