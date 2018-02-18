package com.overloadingDemo;

public abstract class MemberCard { //การกำหมดให้เป็น abstract class จะส่งผลให้ไม่สามารถ สร้าง Instance Object จาก Class นั้นๆได้ โดยตรง
	private String firstName, lastName;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("firstName = %s,lastName = %s", firstName, lastName);
		// return super.toString();
	}

	public MemberCard(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public MemberCard() {
		// TODO Auto-generated constructor stub

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) {

	}
    /**
     * Overridable method
     * @param amount
     * @return
     */
	public float discount(float amount) {
		if (amount > 1000f) {
			return amount * .02f;
		} else {
			return 0f;
		}
	}
	
	//must implement this method in subclass
	//การที่จะมี abstract method ใน Class ได้ Class นั้นต้องเป็น abstract classs ด้วย
	public abstract float rewardXPoint(); // abstract method จะไม่มีการ imlement ก็คือไม่มี {}
	
	
	// subclass can't override this method
	public final int calcPoint(float amount) {//สร้าง method ที่ไม่อนุญาติให้ class ลูก Overide ได้
		return (int)((amount/ 20)* rewardXPoint());
	}

}
