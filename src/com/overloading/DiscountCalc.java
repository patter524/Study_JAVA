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
		switch (customerType.toUpperCase()) { // .toUpperCase �������ö����Ѻ  java sdk ����ӡ��� 1.8  **��ҵ�ӡ��ҹ�� �������� byte character ��� int
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
