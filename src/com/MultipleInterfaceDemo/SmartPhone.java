package com.MultipleInterfaceDemo;

public class SmartPhone implements IPhone,ICamera,IGps{

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeAperture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeShutterSpeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call(String phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hangup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSms(String phoneNumber, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float receiveLat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float receiveLon() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isGpsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
