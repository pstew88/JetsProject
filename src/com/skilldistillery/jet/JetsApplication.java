package com.skilldistillery.jet;

import java.util.Scanner;


public class JetsApplication {
	Scanner kb = new Scanner(System.in);
AirField af = new AirField();


	public AirField getAf() {
	return af;
}

public void setAf(AirField af) {
	this.af = af;
}

	public static void main(String[] args) {
		JetsApplication runJets = new JetsApplication();
		runJets.run();
		}

	private void run() {
		menu();
		
	}
	private void menu() {
		System.out.println("");
		System.out.println("  ***********************************");
		System.out.println("1 ********* List Jets ********");
		System.out.println("2 **** Fly Jets ****");
		System.out.println("3 **** View Fastest Jet ****");
		System.out.println("4 *************** View Jet With Longest Range **************");
		System.out.println("5 *************** Load Jets **************");
		System.out.println("6 *************** Fight Jets **************");
		System.out.println("7 *************** Add Jet **************");
		System.out.println("8 *************** Remove Jet **************");
		System.out.println("9 *************** Exit **************");
		System.out.println("  ***********************************");
		menuChoice();
	}

	private void menuChoice() {
			boolean repeat = true;
			int choice = kb.nextInt();
			while (repeat == true) {

				if (choice == 1) {
					System.out.println("");
					af.listJets();
					System.out.println("");

				} else if (choice == 2) {
					System.out.println("");
					af.flyJets();
					System.out.println("");
				} 
				else if (choice == 3) {
					System.out.println("");
					af.listFastest();
					System.out.println("");
				} else if (choice == 4) {
					System.out.println("");
					af.listDistance();
					System.out.println("");
				} else if (choice == 5) {
					System.out.println("");
					af.loadCargo();;
					System.out.println("");
				} else if (choice == 6) {
					System.out.println("");
					af.fight();
					System.out.println("");
				} else if (choice == 7) {
					System.out.println("");
					af.addJet();
					System.out.println("");
				} else if (choice == 8) {
					System.out.println("");
					af.rmvJet();
					System.out.println("");
				} else if (choice == 9) {
					System.out.println("");
					System.out.println("*****************");
					System.out.println("Have a Great Day!");
					System.out.println("*****************");
					repeat = false;
					break;

				} else {
					System.out.println("**************");
					System.out.println("Invalid Option");
					System.out.println("**************");
				}
				menu();
				break;
			}
		}
		
	}
