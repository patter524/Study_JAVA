package com.overloadingDemo;

public class PlatinumCard extends MemberCard {
	//annotation คือ ส่วนหนึ่งของโค้ดที่บอกรายละเอียดบางอย่าง   อย่างเช่นบอกให้รู้ว่า  PlatinumCard ทำการ Override method ที่อยู่ใน Class MemberCard
	@Override
	public float discount(float amount) {
		
		return amount* 0.5f;
		
//		return super.discount(amount);
	}

}
