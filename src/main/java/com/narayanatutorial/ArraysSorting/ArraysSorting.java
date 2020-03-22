package com.narayanatutorial.ArraysSorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSorting {
	public static void main(String args[]) {
		// String array
		String[] stringArray = new String[] { "narayana", "siva", "kumar", "chandra" };

		// int array
		// int[] intArray = new int[] { 102, 105, 97, 30 };

		// short array
		// short[] shortArray = new short[] { 102, 105, 97, 30 };

		// long array
		// long[] longArray = new long[] { 102, 105, 97, 30 };

		// double array
		// double[] doubleArray = new double[] { 1024332.22, 1052323.43, 9723232, 302321
		// };

		// float array
		// float[] floatArray = new float[] { 102.5f, 105.2f, 97.4f, 30.6f };

		// char array
		// char[] charArray=new char[]
		// {'N','A','R','A','Y','A','N','A','T','U','T','O','R','I','A','L'};

		System.out.println("\nBefore Sort \n***********************************");
		for (String value : stringArray) {
			System.out.println(value);
		}

		/* string array sorting */
		Arrays.sort(stringArray);
		// Arrays.parallelSort(stringArray);
		// Collections.sort(Arrays.asList(stringArray));

		/* int array sorting */
		// Arrays.sort(intArray);
		// Arrays.parallelSort(intArray);
		// Collections.sort(Arrays.asList(intArray));

		/* short array sorting */
		// Arrays.sort(shortArray);
		// Arrays.parallelSort(shortArray);
		// Collections.sort(Arrays.asList(shortArray));

		/* long array sorting */
		// Arrays.sort(longArray);
		// Arrays.parallelSort(longArray);
		// Collections.sort(Arrays.asList(longArray));

		/* double array sorting */
		// Arrays.sort(doubleArray);
		// Arrays.parallelSort(doubleArray);
		// Collections.sort(Arrays.asList(doubleArray));

		/* float array sorting */
		// Arrays.sort(floatArray);
		// Arrays.parallelSort(floatArray);
		// Collections.sort(Arrays.asList(floatArray));

		/* char array sorting */
		// Arrays.sort(charArray);
		// Arrays.parallelSort(charArray);
		// Collections.sort(Arrays.asList(charArray));

		System.out.println("\nAfter Sort \n***********************************");
		for (String value : stringArray) {
			System.out.println(value);
		}
	}
}
