package com.skilldistillery.foodtruck;

public class FoodTruck {
	static int nextTruckId = 0;
	private int uniqueId;
	private String name;
	private String foodType;
	private double rating;
	
	public FoodTruck() {
		this.uniqueId = ++nextTruckId;
	}
	
	public String toString() {
		String output = "";
		output += "" + uniqueId + ": ";
		output += name + " (" + foodType + ")";
		output += " - Rating: " + rating;
		System.out.println(output);
		return output;
	}

	public int getNextTruckId() {
		return nextTruckId;
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
}
