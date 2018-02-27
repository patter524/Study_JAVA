package com.overloadingDemo;

public class Main {
	
	public static void main(String[] args) {
//		demo1();
		demoCard();
	}
	
	public static void demoCard() {
		PlatinumCard platinumCard = new PlatinumCard();
		System.out.println("Platinum:"+platinumCard.discount(1000f));
		System.out.println("ได้แคะนแนนสะสมทั้งสิ้น  "+platinumCard.calcPoint(1000f));
		GoldCard goldCard = new GoldCard();
		System.out.println("Gold:"+goldCard.discount(2000f)); //เนื่องจากว่าใน Class Gold ไม่ได้มีการ Overide method ทำให้เมื่อเรียกใช้ method นี้ก็จะมาเรียกใช้ Method ใน Parent C
		SilverCard silverCard = new SilverCard();
		System.out.println("Silver:"+silverCard.discount(3000f));
	}
	
	
//	public static void demo1() {
//		MemberCard m1 = new MemberCard("Peter","Parker");
//		System.out.println(m1.toString());
//		
//		
//	}

}