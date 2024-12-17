package com.test1;

public class CoreJavaBrushUp1 {

	public static void main(String args[]) {

		int num = 17;
		String name = "DAVID WARNER";
		char letter = 'a';
		double value = 5.99;
		boolean myCard = true;
		System.out.println(num + name + letter + value + myCard);

		// Arrays
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// arr[5]=60;//lava.lang.ArrayIndexOutOfBoundsException
		System.out.println(arr[4]);
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(arr2[3]);

		// for loop
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		String[] names = { "john", "warner", "david" };
		for (int i = 0; i <= names.length - 1; i++) {
			System.out.println(names[i]);
		}
		// converting string to array using split
		String name1 = "my name is sumeeth";
		String[] arr3 = name1.split(" "); // Split by space to get words in the sentence

		// Check if name1 is a String
		// The instanceof operator is the primary way to check an object's type in Java.
		// It checks if an object is an instance of a specific class or interface.
		if (name1 instanceof String) {
			System.out.println("name1 is a string: " + name1);
		}

		// Print each word in the array
		for (String names1 : arr3) {
			System.out.println("Array element: " + names1);
		}

		// Check if arr3 is an array and print it in reverse
		if (arr3.getClass().isArray()) {
			System.out.println("arr3 is an array.");
			System.out.println("Reversed array:");

			// Print arr3 in reverse order
			for (int i = arr3.length - 1; i >= 0; i--) {
				System.out.println("Reversed element: " + arr3[i]);
			}
		} else {
			System.out.println("arr3 is not an array.");
		}
		
	}

}
