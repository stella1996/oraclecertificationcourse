package com.inheritance;

class Inheritance{
	protected Integer rollno;
	protected String name;
	protected String collgename;
	
	Inheritance(Integer rollno, String name, String collegename){
		
		this.rollno=rollno;
		this.name=name;
		this.collgename=collegename;
		display(rollno, name, collegename);
		}
	public void display(Integer rollno,String name,String collegename){
		System.out.println("My RollNo:" +rollno);
		System.out.println("My Name:" +name);
        System.out.println("My CollegeName:" +collegename);

	}
	
	
	
}

public class InheritanceDemo extends Inheritance {

	InheritanceDemo(Integer rollno, String name, String collegename) {
		super(rollno, name, collegename);
	}

	public static void main(String[] args) {
		
		InheritanceDemo userdetail= new InheritanceDemo(1073,"stella","crescent");

	}

}
