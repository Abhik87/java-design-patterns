package com.abhikdutta.patterns.factory;

public class Test {
	
	public static void main(String []args) {
		PizzaStore ps = new PizzaStore();
		ps.orderPizza("Cheese");
		
		//ps.orderPizza("Veg");
		
		//ps.orderPizza("Chicken");
	}

}
