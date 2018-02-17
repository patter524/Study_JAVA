package com.overloading;

public class Main {
	public static void main(String[] args) {
		String string = "sunflower";
		System.out.println(string.substring(3));
		System.out.println(string.substring(3, 7));
		
		System.out.println(SimpleAdd.add(1.2, 3));//add double
		System.out.println(SimpleAdd.add(1.2f, 3.3f));
		System.out.println(SimpleAdd.add(1.2f, 3.3));
		System.out.println(SimpleAdd.add(1.2f, 3.3,5));
//DiscountCalc discountCalc = new DiscountCalc();
//	System.out.println(discountCalc.discount(100, "VIP"));
//	System.out.println(discountCalc.discount(100f));
		System.out.println(DiscountCalc.discount(100f));
		System.out.println(DiscountCalc.discount(100f,.1f));
		System.out.println(DiscountCalc.discount(100f,"VIP"));
	}
}
