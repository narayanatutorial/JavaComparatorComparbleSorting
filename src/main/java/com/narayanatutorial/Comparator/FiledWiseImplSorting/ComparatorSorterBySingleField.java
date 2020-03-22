package com.narayanatutorial.Comparator.FiledWiseImplSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorterBySingleField {
	public static void main(String args[]) {
		StudentDataCreate sdc=new StudentDataCreate();
		
		List<StudentVo> list=sdc.getStudentData();
		System.out.println("Before First Name Sort \n***********************************");
		System.out.println("FirstName # LastName # City\n***********************************");
		list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()));
		
		Collections.sort(list, new Comparator<StudentVo>() {

			@Override
			public int compare(StudentVo o1, StudentVo o2) {		
				return o1.getStudentFirstName().compareTo(o2.getStudentFirstName());
			}
			
		});
	    
	    System.out.println("\nAfter First Name Sort \n***********************************");
	    
		System.out.println("FirstName # LastName # City\n***********************************");
		
	    list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()));
		
		
	}
}
