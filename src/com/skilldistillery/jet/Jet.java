package com.skilldistillery.jet;

public abstract class Jet {
	
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public double getSpeedInMach() {
		return speed/767.269;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public void fly(){
	int flyingDistance;
	flyingDistance=(int)speed/range;
	System.out.println("The "+model+"can fly for a distance of "+flyingDistance);
	}
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Jets [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	
}
