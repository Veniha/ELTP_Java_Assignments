package com.psl.training.college;

public abstract class Faculty implements IPerson {
	
	public int id;
	public String name;
	public Faculty(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a faculty..");

	}
	int experience;
	abstract void facultyDetails(int id, String name);

}
