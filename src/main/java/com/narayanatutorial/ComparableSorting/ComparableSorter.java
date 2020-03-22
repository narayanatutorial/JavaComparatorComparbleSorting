package com.narayanatutorial.ComparableSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableSorter {
	public static void main(String args[]) {
		StudentDataCreate sdc = new StudentDataCreate();

		List<StudentVo> list = sdc.getStudentData();
		System.out.println("Before Age Sort \n***********************************");
		System.out.println("FirstName # LastName # City # Age\n***********************************");
		list.forEach(x -> System.out.println(x.getStudentFirstName() + " # " + x.getStudentLastName() + " # "
				+ x.getStudentCity() + " # " + x.getAge()));

		Collections.sort(list);

		System.out.println("\nAfter Age Sort \n***********************************");

		System.out.println("FirstName # LastName # City # Age\n***********************************");

		list.forEach(x -> System.out.println(x.getStudentFirstName() + " # " + x.getStudentLastName() + " # "
				+ x.getStudentCity() + " # " + x.getAge()));

	}
}
