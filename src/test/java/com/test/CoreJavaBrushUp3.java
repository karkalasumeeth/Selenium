package com.test;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {

		// String is an Object // String literal
		String s = "DAVID WARNER";
		String s1 = "DAVID WARNER";
		System.out.println(s);

		// New
		String s2 = new String("JAVA");
		System.out.println(s2);
		
		String s3="String is an object";
		String[] splittedString=s3.split("is");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
		//System.out.println(splittedString[2]);
	//	System.out.println(splittedString[3]);
		
		for(int i=0;i<=s3.length()-1;i++) {
			System.out.println(s3.charAt(i));
		}
		for(int i=s3.length()-1;i>=0;i--){
			System.out.println(s3.charAt(i));
		}
	}

}
