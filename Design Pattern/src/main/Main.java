package main;

import solid_principles.encapsulation.OrderClass;

/**
 * This class is to test hypothesis.
 * It will be replaced by unit testing framework later on.
 * 
 * 
 * @author kuldip
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		OrderClass order = new OrderClass();
		
		double tax = order.order("US", 100);
		
		System.out.println(tax);
	}
}
