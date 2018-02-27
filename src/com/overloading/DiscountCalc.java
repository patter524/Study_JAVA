
package com.overloading;

public class DiscountCalc {
	public static float discount(float amount) {
		return amount * 0.05f;
	}

	public static float discount(float amount, float pctDiscount) {
		return amount * pctDiscount;
	}

	public static float discount(float amount, String customerType) {
		float pctDiscount = 0.0f;
		switch (customerType.toUpperCase()) { // .toUpperCase ไม่สามารถใช้ได้กับ  java sdk ที่ต่ำกว่า 1.8  **ถ้าต่ำกว่านี้ จะใช้ได้แค่ byte character และ int
		case "VIP":
			pctDiscount = 0.2f;
			break;
		case "GOLD":
			pctDiscount = 0.1f;
			break;
		default:
			pctDiscount = 0.05f;

			break;
		}

		return discount(amount,pctDiscount);
	}
}