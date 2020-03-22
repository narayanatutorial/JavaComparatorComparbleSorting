package com.narayanatutorial.both.ImpleInVoSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BothSorter {
	public static void main(String args[]) {
		StudentDataCreate sdc=new StudentDataCreate();
		
		List<StudentVo> list=sdc.getStudentData();
		System.out.println("Before Age Sort \n***********************************");
		System.out.println("FirstName # LastName # City # Age\n***********************************");
		list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()+" # "+x.getAge()));
		
		//using comparable sorter
		Collections.sort(list);
	    
	    System.out.println("\nAfter Age Sort \n***********************************");
	    
		System.out.println("FirstName # LastName # City # Age\n***********************************");
		
	    list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()+" # "+x.getAge()));
		
	   //using comparator sorter
	    Collections.sort(list, StudentVo.compareStudentFirstName());
	    
	    System.out.println("\nAfter Student FirstName Sort \n***********************************");
	    
		System.out.println("FirstName # LastName # City # Age\n***********************************");
		
	    list.forEach(x -> System.out.println(x.getStudentFirstName()+" # "+x.getStudentLastName()+" # "+x.getStudentCity()+" # "+x.getAge()));
		
		
	}
}
