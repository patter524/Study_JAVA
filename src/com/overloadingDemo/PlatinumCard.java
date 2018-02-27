package com.overloadingDemo;

public class PlatinumCard extends MemberCard {
	// annotation คือ ส่วนหนึ่งของโค้ดที่บอกรายละเอียดบางอย่าง อย่างเช่นบอกให้รู้ว่า
	// PlatinumCard ทำการ Override method ที่อยู่ใน Class MemberCard
	@Override
	public float discount(float amount) {

		return amount * 0.05f;

		// return super.discount(amount);
	}

	@Override
	public float rewardXPoint() {
		// TODO Auto-generated method stub
		return 3f;
	}
//	@Override
//	public  int calcPoint(float amount) {//สร้าง method ที่ไม่อนุญาติให้ class ลูก Overide ได้
//		return (int)((amount/ 20)* rewardXPoint());
//	}

}