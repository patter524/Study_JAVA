package com.CompareToDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareString("apple", "coconut");
		compareString("apple", "apple");
		compareString("coconut", "apple");
		
		
		compareIntegerObject(5, 7);
		compareIntegerObject(5, 5);
		compareIntegerObject(7, 5);
		
		compareIntegerPrimitive(5, 7);
		compareIntegerPrimitive(5, 5);
		compareIntegerPrimitive(7, 5);
		
		compareIntegerPrimitive1(5, 7);
		compareIntegerPrimitive1(5, 5);
		compareIntegerPrimitive1(7, 5);
		
		compareFloatPrimitive(5f, 7f);
		compareFloatPrimitive(5f, 5f);
		compareFloatPrimitive(7f, 5f);
	}
	
	public static void compareString(String a,String b) {
		System.out.printf("a = %s ,b= %s , a.compareTo(b) = %d\n",a,b,a.compareTo(b));
	}
	
	public static void compareIntegerObject(Integer a,Integer b) { //Integer เป็น Wrapper class เพื่อนแปลงค่า int(primitive) ให้เป็น Integer Object
		System.out.printf("a = %d ,b= %d , a.compareTo(b) = %d\n",a,b,a.compareTo(b));  //compareTo จะ return ค่าออกมาเป็น int
	}

	
	public static void compareIntegerPrimitive(int a,int b) { 
		System.out.printf("a = %d ,b= %d , a.compareTo(b) = %d\n",a,b,Integer.valueOf(a).compareTo(Integer.valueOf(b)));
	}
	
	public static void compareIntegerPrimitive1(int a,int b) { //ถ้าเป็นตัวเลขสามารถเอามาลบกันก็ได้
		System.out.printf("a = %d ,b= %d , a-b = %d\n",a,b,a-b);
	}
	
	public static void compareFloatPrimitive(float a,float b) { 
		System.out.printf("a = %.2f ,b= %.2f , a.compareTo(b) = %d\n",a,b,Float.valueOf(a).compareTo(Float.valueOf(b)));//compareTo จะ return ค่าออกมาเป็น int
	}
	
}
