package com.narayanatutorial.ComparableSorting;

import java.util.ArrayList;
import java.util.List;

public class StudentDataCreate {
	private List<StudentVo> list;

	public List<StudentVo> getStudentData() {

		list = new ArrayList<StudentVo>();
		StudentVo st = null;
		st = new StudentVo();
		st.setStudentCity("Bangalore");
		st.setStudentFirstName("Narayana1");
		st.setStudentLastName("Ragi1");
		st.setAge(50);
		list.add(st);

		st = new StudentVo();
		st.setStudentCity("Bangalore");
		st.setStudentFirstName("Chandra");
		st.setStudentLastName("Sekhar");
		st.setAge(20);
		list.add(st);

		st = new StudentVo();
		st.setStudentCity("Chennai");
		st.setStudentFirstName("Ravi");
		st.setStudentLastName("Kumar2");
		st.setAge(70);
		list.add(st);

		st = new StudentVo();
		st.setStudentCity("Mumbai");
		st.setStudentFirstName("Ravi");
		st.setStudentLastName("Kumar1");
		st.setAge(37);
		list.add(st);

		return list;
	}
}
