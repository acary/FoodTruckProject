package com.skilldistillery.foodtruck;

public class FoodTruck {
	static FoodTruck[] allTrucks = new FoodTruck[5];
	static int nextTruckId = 0;
	static int numTrucks = 0;
	private int uniqueId;
	private String name;
	private String foodType;
	private double rating;

	public FoodTruck() {
	}

	public FoodTruck(String name, String foodType, double rating) {
		this.uniqueId = ++nextTruckId;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		numTrucks++;
	}

	public int getNextTruckId() {
		return nextTruckId;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNumTrucks() {
		return numTrucks;
	}

	public void addTruck(FoodTruck ft) {
		for (int i = 0; i < allTrucks.length; i++) {
			if (allTrucks[i] == null) {
				allTrucks[i] = ft;
				break;
			}
		}
	}

	public String toString() {
		String output = "";
		output += "" + uniqueId + ": ";
		output += name + " (" + foodType + ")";
		output += " - Rating: " + rating;
		return output;
	}

	public void displayTruck() {
		String truckData = toString();
		System.out.println(truckData);
	}

	public FoodTruck[] getTrucks() {
		FoodTruck[] availableTrucks = new FoodTruck[numTrucks];
		for (int i = 0; i < allTrucks.length; i++) {
			if (allTrucks[i] != null) {
				availableTrucks[i] = allTrucks[i];
			}
		}
		return availableTrucks;
	}
}
