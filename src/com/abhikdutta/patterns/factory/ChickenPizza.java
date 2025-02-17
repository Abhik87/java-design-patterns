package com.abhikdutta.patterns.factory;

public class ChickenPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing Chicken Pizza");
	}

	public void bake() {
		System.out.println("Baking Chicken Pizza");
	}

	public void cut() {
		System.out.println("Cutting Chicken Pizza");
	}

}
