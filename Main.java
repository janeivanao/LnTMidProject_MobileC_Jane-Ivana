package main;

import java.util.ArrayList;

public class Main {
	java.util.Scanner scan = new java.util.Scanner(System.in);
	ArrayList<String> Brand = new ArrayList<>();
	ArrayList<String> Category = new ArrayList<>();
	ArrayList<String> Name = new ArrayList<>();
	ArrayList<String> License = new ArrayList<>();
	ArrayList<String> Type = new ArrayList<>();
	ArrayList<Integer> Gas = new ArrayList<>();
	ArrayList<Integer> Speed = new ArrayList<>();
	ArrayList<Integer> Wheel = new ArrayList<>();
	ArrayList<Integer> Entertainment = new ArrayList<>();
	public Main() {
		Integer choose = 0;
		boolean menu = true;
		while (true) {
		do {
		System.out.println("PT Meksiko");
		System.out.println("1. Input");
		System.out.println("2. View menu");
		System.out.println(">>");
		choose = scan.nextInt(); scan.nextLine();
		} while (choose < 1 || choose > 2);
		switch (choose) {
		case 1:
			Input();
			break;
		case 2: 
			View();
			break;
		}
	}
}

	public void View() {
		int helm;
		for (int i = 0; i < Brand.size(); i++) {
			System.out.println(" Brand : " + Brand.get(i));
			System.out.println(" Name : " + Name.get(i));
			System.out.println("License Plate : " + License.get(i));
			System.out.println("Type : " + Type.get(i));
			System.out.println("Gas Capacity : " + Gas.get(i));
			System.out.println("Top Speed : " + Speed.get(i));
			System.out.println("Wheel(s) : " + Wheel.get(i));
			System.out.println("Entertainment System : " + Entertainment.get(i));
			System.out.println("Turning on entertainment system ...");
			if (Category.get(i) == "Car") {
				System.out.println("Boosting!");
			} if (Category.get(i) == "Motorcycle") {
				System.out.println(Name.get(i) + "is standing");
				System.out.println("Input helm price : ");
				helm = scan.nextInt(); scan.nextLine();
				System.out.println("Price : " + helm );
			}
		}
		
		
	}

	public void Input() {
		String typecat, brand, name, license, type = null;
		Integer speed, gas, wheel,ent = null;
		do {
			System.out.println("Input type [ Car | Motorcycle] : ");
			typecat = scan.nextLine();
		} while (!typecat.equals("Car") && !typecat.equals("Motorcycle"));
		
		do {
			System.out.println("Input brand [>=5] : ");
			brand = scan.nextLine();
		} while (brand.length() < 5);
		do {
			System.out.println("Input name [>=5] : ");
			name = scan.nextLine();
		} while (name.length() < 5);
		do {
			System.out.println("Input license : ");
			license = scan.nextLine();
		} while (!license.contains(" ") && !license.isEmpty());
		do {
			System.out.println("Input top speed [ 100 <= topSpeed <= 250] : ");
			speed = scan.nextInt(); scan.nextLine();
		} while (speed < 100 || speed > 250);
		do {
			System.out.println("Input gas capacity [ 30 <= gasCap <= 60] : ");
			gas = scan.nextInt(); scan.nextLine();
		} while (gas < 30 || gas > 60);
		do {
			System.out.println("Input wheel [ 4 <= gasCap <= 6] : ");
			wheel = scan.nextInt(); scan.nextLine();
		} while (wheel < 4 || wheel > 6);
		
		if (typecat == "Car") {
			do {
			System.out.println("Input type [SUV | Supercar | Minicar] : ");
			type = scan.nextLine();
			} while (!type.equals("SUV") || !type.equals("Supercar") || !type.equals("Minicar"));
			do {
				System.out.println("Input entertainment system amount [>= 1] : ");
				ent = scan.nextInt(); scan.nextLine();
			} while (ent < 1);
		} if (typecat == "Motorcycle") {
			do {
			System.out.println("Input type [Automatic | Manual] : ");
			type = scan.nextLine();
		} while (!type.equalsIgnoreCase("Automatic") && !type.equalsIgnoreCase("Manual"));
			do {
				System.out.println("Input helm amount [>= 1] : ");
				ent = scan.nextInt(); scan.nextLine();
			} while (ent < 1);
	}
		Category.add(typecat);
		Brand.add(brand);
		Name.add(name);
		License.add(license);
		Type.add(type);
		Gas.add(gas);
		Speed.add(speed);
		Wheel.add(wheel);
		Entertainment.add(ent);
		System.out.println("Enter to return");
		scan.nextLine();
	}
	

	public static void main(String[] args) {
		new Main();
	}

}
