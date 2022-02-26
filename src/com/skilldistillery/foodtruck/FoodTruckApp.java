package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Food Truck Rodeo!");
		boolean attending = true;

		do {
			String name, foodType;
			Double rating;

			System.out.println("Enter a food truck name:");
			name = sc.next();

			if (name.equals("quit")) {
				attending = false;
				break;
			}

			System.out.println("Enter a food type:");
			foodType = sc.next();
			foodType = foodType.trim();

			System.out.println("Enter a rating:");
			rating = sc.nextDouble();

			FoodTruck ft = new FoodTruck(name, foodType, rating);
			ft.addTruck(ft);

		} while (attending);

		do {
			for (;;) {
				// PRINT MENU
				System.out.println();
				System.out.println("******************************");
				System.out.println("Please make a selection:");

				System.out.println();
				System.out.println("1: Display all food trucks");
				System.out.println("2: Display average rating");
				System.out.println("3: Display winning food truck");
				System.out.println("Q: Quit");
				System.out.println("******************************");
				
				// GET SELECTION
				String selection = sc.next();
				switch (selection) {
				case "1":
					System.out.println("\nATTENDING FOOD TRUCKS:\n");
					FoodTruck ft = new FoodTruck();
					FoodTruck[] foodTruckRodeo = ft.getTrucks();
					for (FoodTruck current : foodTruckRodeo) {
						System.out.println(current.toString());
					}
					break;
				case "2":
					System.out.println();
					System.out.println("Average rating: TBD");
					break;
				case "3":
					System.out.println();
					System.out.println("Winning food truck: TBD");
					break;
				case "Q":
				case "q":
				case "quit":
				case "QUIT":
					System.out.println("Thanks for visiting!");
					System.out.println();
					System.exit(0);
				}
			}
		} while (attending);
	}
}
