package com.TreeMapDemo;

import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.omg.CORBA.portable.ValueBase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeMapDemo();

		System.out.println("------------");
		hashMapDemo();
		
		int score = 150;
		System.out.println("using if-----------------");
		System.out.println(gradeLetter(score));
		System.out.println("using treeMap----------");
		System.out.println(gradeLetterTreeMap(score));
	}

	public static void treeMapDemo() {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); // TreeMap จะเรียงลำดับให้โดย ใช้ Key ส่วนตัว
																			// HashMap จะไม่เรียงให้
		treeMap.put(1133, "สอบถามเลขหมายโทรศํพท์");
		treeMap.put(183, "สอบถามเลขหมายในภมูิภาค");
		treeMap.put(189, "รับร้องเรียนเรื่องโทรศัพท์");
		treeMap.put(1177, "แจ้งโทรศํพท์ขัดข้อง(กด 1177 ตามด้วยเลขหมายโทรศํพท์ที่ขัดข้อง)");
		for (Map.Entry<Integer, String> item : treeMap.entrySet()) {
			Integer key = item.getKey();
			String value = item.getValue();
			System.out.printf("%s => %s\n", key, value);
		}

	}

	public static void hashMapDemo() {
		HashMap<Integer, String> treeMap = new HashMap<Integer, String>(); // TreeMap จะเรียงลำดับให้โดย ใช้ Key ส่วนตัว
																			// HashMap จะไม่เรียงให้
		treeMap.put(1133, "สอบถามเลขหมายโทรศํพท์");
		treeMap.put(183, "สอบถามเลขหมายในภมูิภาค");
		treeMap.put(189, "รับร้องเรียนเรื่องโทรศัพท์");
		treeMap.put(1177, "แจ้งโทรศํพท์ขัดข้อง(กด 1177 ตามด้วยเลขหมายโทรศํพท์ที่ขัดข้อง)");
		for (Map.Entry<Integer, String> item : treeMap.entrySet()) {
			Integer key = item.getKey();
			String value = item.getValue();
			System.out.printf("%s => %s\n", key, value);
		}

	}

	public static String gradeLetter(int score) {
		/*
		 * 0-49 F 50-59 D 60-69 C 70-79 B 80-100 A
		 */
		String grade = "";
		if (score >= 80)
			grade = "A";
		else if (score >= 70)
			grade = "B";
		else if (score >= 60)
			grade = "C";
		else if (score >= 50)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
	
	
	public static String gradeLetterTreeMap(int score) {
		TreeMap<Integer, String> gradeMap = new TreeMap<Integer,String>();
		gradeMap.put(0, "F");
		gradeMap.put(50, "D");
		gradeMap.put(56, "D+");
		gradeMap.put(60, "C");
		gradeMap.put(66, "C+");
		gradeMap.put(70, "B");
		gradeMap.put(76, "B+");
		gradeMap.put(80, "A");
		gradeMap.put(86, "A+");
		
		return gradeMap.floorEntry(score).getValue(); //floorEntry จะรีเทิร์นค่าที่อยู่ล่าง ลงไป เช่น 65 >>> 60 -> C   90 >> 80 -> A
		
	}

}
