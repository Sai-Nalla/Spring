package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	Courier courier=null;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	 public String  Shopping(String[] items,float[] prices) {
		 float Billamount=0.0f;
		 String msg=null;
		 for(float f:prices)
			 Billamount+=f;
		 Random r=new Random();
		 int oid=r.nextInt(1000);
		msg= courier.deliver(oid);
		return Arrays.toString(items)+"Items are Purchased Having Prices"+Arrays.toString(prices)+"with the total Bill amount"+Billamount+"using"+msg;
		 
	 }

}
