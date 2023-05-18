package com.driver;

public class DeluxePizza extends Pizza {
	String deluxeBill;
	int price;
	
	public DeluxePizza(Boolean isVeg) {
		super(isVeg);
		super.addExtraCheese();
		super.addExtraToppings();
//		deleuxeBill += (super.addExtraCheese() + super.addExtraToppings());
	}
}
