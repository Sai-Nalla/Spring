package com.nt.comp;

public class OrdinaryCar implements Car {
private Tyre tyre;
	public OrdinaryCar(Tyre tyre) {
	System.out.println("OrdinaryCar.----OrdinaryCar()");
	this.tyre = tyre;
}
	@Override
	public void drive() {
		System.out.println("Driving with Ordinary CAr"+tyre.RoadGrip());

	}

}
