package com.narayanatutorial.Comparator.SortBySingleFiled;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorterBySingleField {
	public static void main(String args[]) {
		StudentDataCreate sdc = new StudentDataCreate();

		List<StudentVo> list = sdc.getStudentData();
		System.out.println("Before First Name Sort \n***********************************");
		System.out.println("FirstName # LastName # City\n***********************************");
		list.forEach(x -> System.out
				.println(x.getStudentFirstName() + " # " + x.getStudentLastName() + " # " + x.getStudentCity()));

		// by using Comparator implemented class object
		// Collections.sort(list, new StudentFirstNameSorter());

		Collections.sort(list, new Comparator<StudentVo>() {
			@Override
			public int compare(StudentVo o1, StudentVo o2) {
				//By Ascending Order
				return o1.getStudentFirstName().compareTo(o2.getStudentFirstName());
				
				//By Descending Order
				//return o2.getStudentFirstName().compareTo(o1.getStudentFirstName());
			}
		});

		System.out.println("\nAfter First Name Sort \n***********************************");

		System.out.println("FirstName # LastName # City\n***********************************");

		list.forEach(x -> System.out
				.println(x.getStudentFirstName() + " # " + x.getStudentLastName() + " # " + x.getStudentCity()));

	}
}
