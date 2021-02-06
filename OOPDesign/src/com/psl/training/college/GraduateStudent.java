package com.psl.training.college;

public class GraduateStudent extends Student implements IPerson {
	
	public int id;
	public String name;
	public GraduateStudent(int id, String name) {
		// TODO Auto-generated constructor stub
		super(id,name);
	}
	
	@Override
	void studentDetails(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("id : "+id);
		System.out.println("id : "+name);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a Graduate student..");
	}

}
