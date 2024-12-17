package com.test;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
		getData();
		getUserData();
		getUserData1();
		getUserData2();
		MethodsDemo1.getData1();
		MethodsDemo1.getUserId();
		MethodsDemo1.getUserSubject();
		//MethodsDemo1.getUserName(); --getUserName() is a private method which cannot be assessed in the other class,sub-class ,other package 
	}
	
	public static void getData(){
		System.out.println("hello world");
	}
	private static void getUserData() {
		
		System.out.println("Name:John");
	}
	protected static void getUserData1(){
		System.out.println("Subject:JAVA");
	}
	static void getUserData2() {
	System.out.println("ID:036");
	}
	}
	
