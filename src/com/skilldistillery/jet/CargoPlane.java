package com.skilldistillery.jet;

public class CargoPlane extends Jet implements CargoCarrier{
	
	//private String cargo;

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	
	public void loadCargo() {
		System.out.println("The " + super.getModel() + " loads its cargo and prepares for takeoff!");
			
	}
	

//	public String getCargo() {
//		return cargo;
//	}
//
//	public void setCargo(String cargo) {
//		this.cargo = cargo;
//	}
	
}
