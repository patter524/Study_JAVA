package com.overloadingDemo;

public class GoldCard extends MemberCard {

	@Override
	public float rewardXPoint() {
		// TODO Auto-generated method stub
		return 2f;
	}
	// annotation ��� ��ǹ˹�觢ͧ�鴷��͡��������´�ҧ���ҧ ���ҧ�蹺͡���������
	// PlatinumCard �ӡ�� Override method �������� Class MemberCard

	// @Override
	// public float discount(float amount) {
	// // TODO Auto-generated method stub
	// return super.discount(amount);
	// }

}
