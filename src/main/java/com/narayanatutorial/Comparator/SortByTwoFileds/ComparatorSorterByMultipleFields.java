package com.narayanatutorial.Comparator.SortByTwoFileds;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorterByMultipleFields {
	public static void main(String args[]) {
		StudentDataCreate sdc=new StudentDataCreate();
		
		List<StudentVo> list=sdc.getStudentData();
		
		System.out.println("Before First Name and Last Name Sort \n***********************************");
		System.out.println("FirstName # LastName # City\n***********************************");
		list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()));
		

		Collections.sort(list, new Comparator<StudentVo>() {
			@Override
			public int compare(StudentVo o1, StudentVo o2) {
				//By Ascending Order 
				int i=o1.getStudentFirstName().compareTo(o2.getStudentFirstName());
				
				//By Descending Order 
				//int i=o2.getStudentFirstName().compareTo(o1.getStudentFirstName());
				
				System.out.println("i:"+i);
				if(i != 0) {
					return i;
				}
				//By Ascending Order
				return o1.getStudentLastName().compareTo(o2.getStudentLastName());
				
				//By Descending Order
				//return o2.getStudentLastName().compareTo(o1.getStudentLastName());
			}
			
		});
		
		
	    System.out.println("\nAfter First Name and Last Name Sort \n***********************************");
	    
		System.out.println("FirstName # LastName # City\n***********************************");
		
	    list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()));
		
		
	}
}
