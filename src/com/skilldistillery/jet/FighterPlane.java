package com.skilldistillery.jet;

public class FighterPlane extends Jet implements CombatReady {

//	private String enemy;

	public FighterPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
//		enemy=this.enemy;
	}
//	public String getEnemy() {
//		return enemy;
//	}
//
//	public void setEnemy(String enemy) {
//		this.enemy = enemy;
//	}

	public void fight() {

		System.out.println("The " + super.getModel() + " unloads its guns on the unsuspecting enemy");
	}

}
