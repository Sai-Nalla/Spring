package com.nt.Test;

import com.nt.Factory.FlipkartFactory;
import com.nt.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart fp=null;
		fp=FlipkartFactory.getInstance();
		System.out.println(fp.Shopping(new String [] {"raincoat","umberalla","tablets"},
				new float [] {5000,2000,5000}));

	}

}
