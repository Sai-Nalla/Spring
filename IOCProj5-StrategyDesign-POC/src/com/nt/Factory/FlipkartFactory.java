package com.nt.Factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	
	private static Properties props;
	static {
		try {
			//Locating Properties File
			InputStream is=new FileInputStream("src/com/nt/commons/info.properties");
			props=new Properties();
			props.load(is);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Flipkart getInstance() {
		Courier courier=null;
		Flipkart fp=null;
		Class c=null;
		//get Dependent Class
		try {
		 c=Class.forName(props.getProperty("sdp.dependent"));
		//create Dependent Class Obj
		courier=(Courier)c.newInstance();
		//creating Target class obj
		fp=new Flipkart();
		//Assigning Dependent class Obj to Target
		fp.setCourier(courier);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return fp;
	}
	
	/*
	 * public static Flipkart getInstance(String type) { Flipkart flipkart=null;
	 * Courier courier=null; flipkart=new Flipkart();
	 * if(type.equalsIgnoreCase("BlueDart")){ courier=new BlueDart(); } else
	 * if(type.equalsIgnoreCase("DTDC")){ courier=new DTDC(); }
	 * flipkart.setCourier(courier); return flipkart; }
	 */

}
