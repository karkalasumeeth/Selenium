package com.test1;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		String[] name = { "john", "david", "tie" };

		for (String s : name) {
			System.out.println(s);
		}
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 122, 12, 4, 123, 44, 46, 98, 600 };
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr1[i] % 2 == 0) {
				System.out.println(arr1[i] + " divisible by 2");
				break;
			} else {
				System.out.println(arr1[i] + " not divisible by 2");
			}
		}

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Selenium");
		a.add("Cypress");
		a.add("Cucumber");
		System.out.println(a.get(1));
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		
		for(int i=0;i<=a.size()-1;i++) {
			System.out.println(a.get(i));
		}
		System.out.println(a.contains("Cypress"));
		for(String val: a) {
			System.out.println("En loop  "+val);
		}
		
		
	}
}
