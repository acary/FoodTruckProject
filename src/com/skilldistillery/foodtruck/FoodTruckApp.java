package com.skilldistillery.foodtruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		
		FoodTruck ft1 = new FoodTruck();
		ft1.setName("Axle Grease");
		ft1.setFoodType("American");
		ft1.setRating(4.5);
		ft1.toString();
		
		FoodTruck ft2 = new FoodTruck();
		ft2.setName("Bok Choy Boy");
		ft2.setFoodType("Asian");
		ft2.setRating(4.3);
		ft2.toString();
		
		FoodTruck ft3 = new FoodTruck();
		ft3.setName("Classic Diner");
		ft3.setFoodType("Continental");
		ft3.setRating(3.5);
		ft3.toString();
	}
}
