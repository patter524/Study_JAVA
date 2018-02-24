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

	// คล้ายๆการสร้าง utility function/method ของ Interface
	// static ที่อยู่ใน Interface จะถือว่าเป็น public by default
	static LocalDateTime currentLocalDateTime() {
		return LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
	}
}
