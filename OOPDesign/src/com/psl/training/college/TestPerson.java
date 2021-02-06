package com.psl.training.college;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new UGStudent(14,"Veni");
		s1.studentDetails(12,"Veni");
		s1.display();
		Faculty f1=new GraduateFaculty(23,"Raj");
		f1.facultyDetails(23, "Raj");
		f1.display();
	}

}
