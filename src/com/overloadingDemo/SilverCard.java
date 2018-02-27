package com.overloadingDemo;

public class SilverCard  extends MemberCard{

	@Override
	public float discount(float amount) {
		
		if (amount > 2000f) {
			return amount * .03f;
		}else {
			return 0f;
		}
		// TODO Auto-generated method stub
		// return super.discount(amount);
	}

	@Override
	public float rewardXPoint() {
		// TODO Auto-generated method stub
		return 1f;
	}

}