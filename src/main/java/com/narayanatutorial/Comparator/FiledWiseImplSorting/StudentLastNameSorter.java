package com.narayanatutorial.Comparator.FiledWiseImplSorting;

import java.util.Comparator;

public class StudentLastNameSorter implements Comparator<StudentVo> {

	public int compare(StudentVo o1, StudentVo o2) {
		
		return o1.getStudentLastName().compareTo(o2.getStudentLastName());
	}

}
