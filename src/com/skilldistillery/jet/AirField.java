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

	public String createJet() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				if (fields[0] == "Cargo") {
					Jet jet = new CargoPlane(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
							Long.parseLong(fields[3]));
					jets.add(jet);

				} else if (fields[0] == "Fighter") {
					Jet jet = new FighterPlane(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
							Long.parseLong(fields[3]));
					jets.add(jet);

				} else if (fields[0] == "Jet") {
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

		while (jets != null) {
			if (jetType == "Cargo") {
				Jet jet = new CargoPlane(model, speed, range, price);
				jets.add(jet);

			} else if (jetType == "Fighter") {
				Jet jet = new FighterPlane(model, speed, range, price);
				jets.add(jet);

			} else if (jetType == "Jet") {
				Jet jet = new JetImpl(model, speed, range, price);
				jets.add(jet);

			}

		}
	}


//	public String rmvJet() 
//	{
//		
//	}
}

//}
