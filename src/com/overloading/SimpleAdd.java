package com.overloading;

public class SimpleAdd {

	public static double add(double n1, double n2) {
		return n1 + n2;
	}
//	
//	public static float add(double n1, double n2) {  ����Ẻ�����������ͧ�ҡ ��� signature  �ѹ��� ���ͧ�ҡ�� parameter ��ӡѺ������ *** ���������͹�ѹ�� �� parameter ��������索Ҵ
//		return (float)(n1+n2);
//	}
	
	public static float	 add(float n1, float n2) {
		return (n1+n2);
		
	}
	
	public static double add(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
}
