package com.psl.training.college;

public abstract class Student implements IPerson{
	public int id;
	public String name;
	public Student(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a student..");
	}
	int years;
	abstract void studentDetails(int id, String name);
}
