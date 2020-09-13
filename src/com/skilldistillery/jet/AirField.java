package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	List<Jet> jets = new ArrayList<>();
	Scanner kb = new Scanner(System.in);
	AirField(){
		createJet();
	}

	public String createJet() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jlist"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				if (fields[0].contentEquals("Cargo")) {
					Jet jet = new CargoPlane(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
							Long.parseLong(fields[3]));
					jets.add(jet);

				} else if (fields[0].contentEquals("Fighter")) {
					Jet jet = new FighterPlane(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
							Long.parseLong(fields[3]));
					jets.add(jet);

				} else if (fields[0].contentEquals("Jet")) {
					Jet jet = new JetImpl(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
							Long.parseLong(fields[3]));
					jets.add(jet);

				}

			}
		} catch (IOException e) {
			System.err.println(e);

		}
		return "jets";
	}

	public void addJet() {
		String jetType;
		String model;
		double speed;
		int range;
		long price;
		System.out.println("Please enter the details of your new Jet");
		System.out.println("Type of Jet to add: Cargo, Fighter, Jet");
		jetType = kb.next();
		System.out.println("Model: ");
		model = kb.next();
		System.out.println("Speed: ");
		speed = kb.nextDouble();
		System.out.println("Range: ");
		range = kb.nextInt();
		System.out.println("Price: ");
		price = kb.nextLong();
		System.out.println("Jet Added:");

			if (jetType.contentEquals("Cargo")) {
				Jet jet = new CargoPlane(model, speed, range, price);
				jets.add(jet);

			} else if (jetType.contentEquals("Fighter")) {
				Jet jet = new FighterPlane(model, speed, range, price);
				jets.add(jet);

			} else if (jetType.contentEquals("Jet")) {
				Jet jet = new JetImpl(model, speed, range, price);
				jets.add(jet);
			}
		}
	

	public void rmvJet() {
		int rmv;
		System.out.println("Please enter the number of the plane would you like to remove?");
		rmv = kb.nextInt();
		System.out.println("Plane Removed Model: "+jets.remove(rmv-1).getModel());
		System.out.println("");

	}

	public void loadCargo() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof CargoPlane) {
					System.out.println("The " + jet.getModel() + " loads its cargo and prepares for takeoff!");
					System.out.println("");
				}
			}
		}
	}

	public void fight() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof FighterPlane) {
					System.out.println("The " + jet.getModel() + " unloads its guns on the unsuspecting enemy");
					System.out.println("");
				}
			}
		}
	}

	public void flyJets() {
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println("Flying jet " + jet.getModel() + " which travel up to " + jet.getSpeed()
						+ "MPH, or Mach " + jet.getSpeedInMach() + " at a range of " + jet.getRange() + ".");
				System.out.println("");
			}
		}
	}

	public void listJets() {
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println(jet.toString());
			}
		}
	}

	public void listFastest() {
		double fastest = 0;
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet.getSpeed() > fastest) {

					fastest = jet.getSpeed();
				}
			}
		}

		int ties = 0;
		for (Jet jet : jets) {
			if (jet != null) {

				if (fastest == jet.getSpeed()) {
					ties++;
				}
			}
		}
		if (ties > 1) {
			System.out.println(ties + " Jets tie for the fasest planes:");
		} else {
			System.out.println("The fastest jet is:");
		}

		for (Jet jet : jets) {
			if (jet != null) {

				if (fastest == jet.getSpeed()) {
					System.out.println(jet.toString());
					break;
				}
			}
		}
	}

	public void listDistance() {
		double fastest = 0.0;
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet.getRange() > fastest) {

					fastest = jet.getRange();
				}
			}
		}

		int ties = 0;
		for (Jet jet : jets) {
			if (jet != null) {

				if (fastest == jet.getRange()) {
					ties++;
				}
			}
		}
		if (ties > 1) {
			System.out.println(ties + " Jets tie for the furthest distance:");
		} else {
			System.out.println("The jet is with the greatest distance is:");
		}

		for (Jet jet : jets) {
			if (jet != null) {

				if (fastest == jet.getRange()) {
					System.out.println(jet.toString());
				}
			}
		}
	}
}
