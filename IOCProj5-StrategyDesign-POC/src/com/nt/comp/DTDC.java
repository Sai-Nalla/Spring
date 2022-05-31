package com.nt.comp;

public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
	
		return "Products are Delivered Using DTDC with "+oid+"Order Id";
	}

}
