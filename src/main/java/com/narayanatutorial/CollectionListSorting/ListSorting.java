package com.narayanatutorial.CollectionListSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {
	public static void main(String args[]) {
		String[] studentNames = new String[] {"narayana","siva", "kumar", "chandra"}; 
		System.out.println("\nBefore Sort \n***********************************");
		
		List<String> studentList=Arrays.asList(studentNames);
	
		for(String studentName:studentList) {
			System.out.println("Student Name: "+studentName);
		}
		
		Collections.sort(studentList);
		
		System.out.println("\nAfter Sort \n***********************************");
		for(String studentName:studentList) {
			System.out.println("Student Name: "+studentName);
		}
	}
}
