package com.narayanatutorial.ComparableSorting;

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
		// return this.age-compareAge;

		// descending order
		return compareAge - this.age;
	}
}
