package com.InterfaceJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public interface ICamera {
	// public
	void takePhoto();

	void changeAperture();

	// public
	default void takeHdrPhoto() {
		System.out.println("take 3 photo with different apertures and combine them together");
	}

	default void shootVideo() {
		System.out.println("Video");
	}

	// �����������ҧ utility function/method �ͧ Interface
	// static �������� Interface �ж������� public by default
	static LocalDateTime currentLocalDateTime() {
		return LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
	}
}
