package com.narayanatutorial.Comparator.FiledWiseImplSorting;

import java.util.Collections;
import java.util.List;

public class CompartorSorterBySingleFieldByFiledSorterClass {

	public static void main(String args[]) {
		StudentDataCreate sdc=new StudentDataCreate();
		
		List<StudentVo> list=sdc.getStudentData();
		System.out.println("Before First Name Sort \n***********************************");
		System.out.println("FirstName # LastName # City\n***********************************");
		list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()));
		
		Collections.sort(list, new StudentFirstNameSorter());
	    
	    System.out.println("\nAfter First Name Sort \n***********************************");
	    
		System.out.println("FirstName # LastName # City\n***********************************");
		
	    list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()));
		
		
	}
}
