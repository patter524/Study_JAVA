package com.overloading;

public class SimpleAdd {

	public static double add(double n1, double n2) {
		return n1 + n2;
	}
//	
//	public static float add(double n1, double n2) {  จะใช้แบบแนี้ไม่ได้เนื่องจาก ตัว signature  มันซ้ำ เนื่องจากใช้ parameter ซ้ำกับตัวอื่น *** ชื่อเหหมือนกันได้ แต่ parameter ห้ามซ้ำเด็ดขาด
//		return (float)(n1+n2);
//	}
	
	public static float	 add(float n1, float n2) {
		return (n1+n2);
		
	}
	
	public static double add(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
}
