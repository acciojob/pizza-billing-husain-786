package com.driver;

public class Pizza {
	private int price;
	private Boolean isVeg;
	private String bill;

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public Boolean getIsVeg() {
		return isVeg;
	}

	public void setIsVeg(Boolean isVeg) {
		this.isVeg = isVeg;
	}
//
//	public void setBill(String bill) {
//		this.bill = bill;
//	}

	public String getBill() {
		bill += "Total Price: " + price + "\n";
		return this.bill;
	}

	private static int vegPizzaBasePrice = 300;
	private static int nonVegPizzaBasePrice = 400;
	private int extraCheesePrice = 80;
	private int toppingForVegPrice = 70;
	private int toppingForNonVegPrice = 120;
	private int paperBagPrice = 20;
	private boolean isExtraCheese;
	private boolean isTopping;
	private boolean takeAway;

	public Pizza(Boolean isVeg) {
		this.isVeg = isVeg;
		this.price = isVeg ? vegPizzaBasePrice : nonVegPizzaBasePrice;
		this.bill = "Base Price Of The Pizza: " + this.price + "\n";
		isExtraCheese = false;
		isTopping = false;
		takeAway = false;
		/*
		 * if (isVeg) { bill += "Base Price Of The Pizza: " + vegPizzaBasePrice + "\n";
		 * price += vegPizzaBasePrice; } else { bill += "Base Price Of The Pizza: " +
		 * nonVegPizzaBasePrice + "\n"; price += nonVegPizzaBasePrice; }
		 */
	}

	public void addExtraCheese() {
		if (!isExtraCheese) {
			price += extraCheesePrice;
			bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
			isExtraCheese = true;
		}
	}

	public void addExtraToppings() {
		if (!isTopping) {
			if (isVeg) {
				bill += "Extra Toppings Added: " + toppingForVegPrice + "\n";
				price += toppingForVegPrice;
			} else {
				bill += "Extra Toppings Added: " + toppingForNonVegPrice + "\n";
				price += toppingForNonVegPrice;
			}
			isTopping = true;
		}
	}

	public void addTakeaway() {
		if (!takeAway) {
			bill += "Paperbag Added: " + paperBagPrice + "\n";
			price += paperBagPrice;
			takeAway = true;
		}
	}
}
