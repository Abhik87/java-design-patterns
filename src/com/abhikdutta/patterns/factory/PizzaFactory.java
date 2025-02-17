package com.abhikdutta.patterns.factory;

public class PizzaFactory {
	
	public static Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("Cheese".equalsIgnoreCase(type)) {
			pizza = new CheesePizza();
		} else if ("Chicken".equalsIgnoreCase(type)) {
			pizza = new ChickenPizza();
		} else if ("Veg".equalsIgnoreCase(type)) {
			pizza = new VegPizza();
		}
		return pizza;
	}
}
