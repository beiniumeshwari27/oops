package com.codegnan.oopexamples;

public class CoffeeShop {

	public static void main(String[] args) {
		class Coffee {
		    String coffeeType;
		    String size;
		    boolean sugar;

		    // Constructor to initialize coffee order
		    Coffee(String coffeeType, String size, boolean sugar) {
		        this.coffeeType = coffeeType;
		        this.size = size;
		        this.sugar = sugar;
		    }

		    // Method to display order details
		    void displayOrder() {
		        System.out.println("Coffee Type: " + coffeeType);
		        System.out.println("Size       : " + size);
		        System.out.println("Sugar      : " + sugar + " spoon(s)");
		        System.out.println("----------------------------");
		    }
		}
          // Creating at least 3 coffee objects
		        Coffee c1 = new Coffee("Espresso", "Small",  true );
		        Coffee c2 = new Coffee("Latte", "Medium",false);
		        Coffee c3 = new Coffee("Cappuccino", "Large",true);

		        // Displaying all orders
		        c1.displayOrder();
		        c2.displayOrder();
		        c3.displayOrder();
		    }
		}


