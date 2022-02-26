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

			System.out.println("Enter a rating:");
			rating = sc.nextDouble();

			FoodTruck ft = new FoodTruck(name, foodType, rating);
			ft.addTruck(ft);

		} while (attending);

		presentRodeo();

		sc.close();
	}

	public static void presentRodeo() {
		System.out.println("Presenting rodeo:");
		FoodTruck ft = new FoodTruck();
		FoodTruck[] foodTruckRodeo = ft.getTrucks();
		for (FoodTruck current : foodTruckRodeo) {
			System.out.println(current.toString());
		}

	}
}
