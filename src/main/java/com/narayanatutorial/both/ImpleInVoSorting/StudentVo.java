package com.narayanatutorial.both.ImpleInVoSorting;

import java.util.Comparator;


public class StudentVo implements Comparable<StudentVo> {

	String studentFirstName;
	String studentLastName;
	String studentCity;
	private int age;

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(StudentVo o) {
		int compareAge = o.getAge();

		// ascending order
		// return this.age - compareAge;
		
		// descending order
		return compareAge - this.age;
	}

	public static Comparator<StudentVo> compareStudentFirstName() {
		return new Comparator<StudentVo>() {

			@Override
			public int compare(StudentVo o1, StudentVo o2) {
				
				return o2.getStudentFirstName().compareTo(o1.getStudentFirstName());
			}

		};
	}
	
	public static Comparator<StudentVo> sortByFirstNameAsc() {
		return new Comparator<StudentVo>() {

			@Override
			public int compare(StudentVo o1, StudentVo o2) {
				
				 return o1.getStudentFirstName().compareTo(o2.getStudentFirstName());
	}

		};
	}
	
	
	public static Comparator<StudentVo> sortByFirstNameDesc() {
		return new Comparator<StudentVo>() {

			@Override
			public int compare(StudentVo o1, StudentVo o2) {				
				return o2.getStudentFirstName().compareTo(o1.getStudentFirstName());
			}

		};
	}
	
	public static Comparator<StudentVo> sortByFirstNameLastNameDesc() {
		return new Comparator<StudentVo>() {

			@Override
			public int compare(StudentVo o1, StudentVo o2) {				
				int i=o1.getStudentFirstName().compareTo(o2.getStudentFirstName());
				if(i != 0) {
					return i;
				}
				return o1.getStudentLastName().compareTo(o2.getStudentLastName());
			}

		};
	}
}
