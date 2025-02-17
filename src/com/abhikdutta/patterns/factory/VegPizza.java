package com.abhikdutta.patterns.factory;

public class VegPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing Veg Pizza.");
	}

	public void bake() {
		System.out.println("Baking Veg Pizza.");
	}

	public void cut() {
		System.out.println("Cutting Veg Pizza.");
	}

}
