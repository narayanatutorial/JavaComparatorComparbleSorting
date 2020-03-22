package com.narayanatutorial.Comparator.SortByTwoFileds;

import java.util.Collections;
import java.util.List;

public class ComparatorSorterByMultipleFieldsByJava18Feature {

	public static void main(String args[]) {
		StudentDataCreate sdc = new StudentDataCreate();

		List<StudentVo> list = sdc.getStudentData();

		System.out.println("Before First Name and Last Name Sort \n***********************************");
		System.out.println("FirstName # LastName # City\n***********************************");
		list.forEach(x -> System.out
				.println(x.getStudentFirstName() + " # " + x.getStudentLastName() + " # " + x.getStudentCity()));

		Collections.sort(list, new StudentFirstNameSorter().thenComparing(new StudentLastNameSorter()));

		System.out.println("\nAfter First Name and Last Name Sort \n***********************************");

		System.out.println("FirstName # LastName # City\n***********************************");

		list.forEach(x -> System.out
				.println(x.getStudentFirstName() + " # " + x.getStudentLastName() + " # " + x.getStudentCity()));

	}
}
