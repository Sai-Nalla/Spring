package com.nt.factory;

import com.nt.comp.ApolloTyres;
import com.nt.comp.CEATTyre;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.MRFTyres;
import com.nt.comp.OrdinaryCar;
import com.nt.comp.SportsCar;
import com.nt.comp.Tyre;

public class CarFactory {
	public static Car getInstance(String Type) {
	Tyre tyre=null;
	Car car=null;
	if(Type.equalsIgnoreCase("Luxory")) {
		tyre=new CEATTyre();
		car=new LuxoryCar(tyre);
	}
	else if(Type.equalsIgnoreCase("Sports")) {
		tyre=new MRFTyres();
	car=new SportsCar(tyre);
}
	else if(Type.equalsIgnoreCase("Ordinary")) {
		tyre=new ApolloTyres();
		car=new OrdinaryCar(tyre);

	}
	return car;
	}
}
