package com.nt.comp;

import java.util.Properties;

public class Fruits {
	private Properties fruitinfo;

	public void setFruitinfo(Properties fruitinfo) {
		this.fruitinfo = fruitinfo;
	}

	@Override
	public String toString() {
		return "Fruits [fruitinfo=" + fruitinfo + "]";
	}
	

}
