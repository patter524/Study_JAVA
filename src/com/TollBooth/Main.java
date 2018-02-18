package com.TollBooth;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		demo2();
	}

	public static void demo1() {
		Sedan sedan = new Sedan();
		System.out.println(sedan.cashRate());

		Vehicle vehicle = new Sedan(); // using an interface as a type //����ö���¡���� // instance vehicle
										// �١���ҧ�Ҩҡ Class Sedan ����ա�� implement Vehicle
		System.out.println(vehicle.ePassRate());

	}

	public static void demo2() {
		Vehicle vehicle = null;
		for (int i = 0; i < 20; i++) {
			int r = randomBetween(0, 2);
			switch (r) {
			case 0:
				vehicle = new Sedan();
				break;
			case 1:
				vehicle = new Truck();
				break;
			case 2:
				vehicle = new Bus();
				break;
			default:
				vehicle = new Sedan();
				break;
			}
			int paymenType = randomBetween(0, 1);
			int rate =0 ;
			if(paymenType ==0) {
				rate = vehicle.cashRate();
				System.out.printf("Vehicle type = %20s, rate(cash)  =  %3d\n",vehicle.getClass().getName(),rate);
			}else {
				rate = vehicle.ePassRate();
				System.out.printf("Vehicle type = %20s, rate(ePass) =  %3d\n",vehicle.getClass().getName(),rate);
			}
		}
	}
	
	public static void demo3() {
		List<String> coffees = new ArrayList<String>();// ��ʹբͧ��� �� Interface ������ѹ�֧�����ҡ����¹ ��Դ�ͧ�����š�����ö����¹��  ���ҧ�� �ҡ ArrayList >>>> LinkedList �� ���� ���ա�� implement interface List ��� ����͹�ѹ
		List<String> coffees1 = new LinkedList<String>();
	}

	public static int randomBetween(int fromNumber, int toNumber) {
		Random random = new Random();
		return random.nextInt(toNumber + 1 - fromNumber) + fromNumber;
	}
}
