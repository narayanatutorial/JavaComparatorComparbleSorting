package com.narayanatutorial.Comparator.SortBySingleFiled;

import java.util.Comparator;

public class StudentFirstNameSorter implements Comparator<StudentVo> {

	public int compare(StudentVo o1, StudentVo o2) {

		return o1.getStudentFirstName().compareTo(o2.studentFirstName);
	}

}
