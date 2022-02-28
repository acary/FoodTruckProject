package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("*******  WELCOME TO THE FOOD TRUCK RODEO!  *******");
		System.out.println("* Enter up to 5 food trucks (`quit` to continue) *");
		System.out.println("**************************************************\n");
		boolean attending = true;
		int counter = 0;

		do {
			String name, foodType;
			Double rating;

			try {
				System.out.print("Enter a food truck name: ");
				name = sc.next();
				
			} catch (Exception e) {
				System.out.println("Check input type and try again.");
				continue;
			}

			if (name.equals("quit")) {
				break;
			}
			
			try {
				System.out.print("Enter a food type: ");
				foodType = sc.next();
				
			} catch (Exception e) {
				System.out.println("Check input type and try again.");
				continue;
			}

			try {
				System.out.print("Enter a rating: ");
				rating = sc.nextDouble();
			} catch (Exception e) {
				System.out.println("Check input type and try again.");
				sc.nextLine();
				continue;
			}

			if (name != null && foodType != null & rating != 0.0) {
				FoodTruck ft = new FoodTruck(name, foodType, rating);
				ft.addTruck(ft);
				counter++;
			}
			
			
		} while (counter < 5);

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
				FoodTruck ft = new FoodTruck();
				FoodTruck[] foodTruckRodeo = ft.getTrucks();
				switch (selection) {
				case "1":
					System.out.println("\nATTENDING FOOD TRUCKS:\n");
					for (FoodTruck current : foodTruckRodeo) {
						System.out.println(current.toString());
					}
					break;
				case "2":
					System.out.println();
					System.out.println("Average rating:");
					double sum = 0.0;
					double average = 0.0;
					for (int i = 0; i < foodTruckRodeo.length; i++) {
						sum += (int) foodTruckRodeo[i].getRating();
					}
					average = sum / foodTruckRodeo.length;
					System.out.println(average);
					break;
				case "3":
					System.out.println();
					System.out.println("Winning food truck:");
					int winningPos = 0;
					int winningRating = 0;
					winningRating = (int) foodTruckRodeo[0].getRating();
					for (int i = 0; i < foodTruckRodeo.length; i++) {
						int currentRating = (int) foodTruckRodeo[i].getRating();
						if (currentRating > winningRating) {
							winningPos = i;
							winningRating = currentRating;
						}
					}
					System.out.println(foodTruckRodeo[winningPos].toString());
					break;
				case "Q":
				case "q":
				case "quit":
				case "QUIT":
					System.out.println("Thanks for visiting!");
					System.out.println();
					attending = false;
					sc.close();
					System.exit(0);
				}
			}
		} while (attending);
	}
}
