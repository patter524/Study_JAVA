package com.overloadingDemo;

public class GoldCard extends MemberCard {

	@Override
	public float rewardXPoint() {
		// TODO Auto-generated method stub
		return 2f;
	}
	// annotation คือ ส่วนหนึ่งของโค้ดที่บอกรายละเอียดบางอย่าง อย่างเช่นบอกให้รู้ว่า
	// PlatinumCard ทำการ Override method ที่อยู่ใน Class MemberCard

	// @Override
	// public float discount(float amount) {
	// // TODO Auto-generated method stub
	// return super.discount(amount);
	// }

}
