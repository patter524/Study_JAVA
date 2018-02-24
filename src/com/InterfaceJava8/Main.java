package com.InterfaceJava8;

public class Main {
	public static void main(String[] args) {
		Camera camera = new Camera();
		camera.takePhoto();
		camera.changeAperture();
		camera.takeHdrPhoto();
		camera.shootVideo();

		System.out.println(ICamera.currentLocalDateTime());
	}



}
