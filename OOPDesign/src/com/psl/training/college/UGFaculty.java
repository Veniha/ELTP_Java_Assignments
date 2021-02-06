package com.psl.training.college;

public class UGFaculty extends Faculty implements IPerson, ITemporary, ISalaried{
	
	public int contract = ITemporary.years;
	public int id;
	public String name;
	public UGFaculty(int id, String name) {
		// TODO Auto-generated constructor stub
		super(id,name);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a Under Graduate faculty..");
		System.out.println("I am working for "+ contract +" years.");
	}

	@Override
	void facultyDetails(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("id : "+id);
		System.out.println("id : "+name);
		
	}

}
