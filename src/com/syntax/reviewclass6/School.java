package com.syntax.reviewclass6;

public class School {

	public static void main(String[] args) {
		
	Student student1=new Student();
	//accessing variables of student class	
	student1.name="Steve";
	student1.lastName="Alba";
	student1.address="Virginia";

	student1.studentId=101;
	student1.age=19;
	student1.grade='A';

	/*subject cannot be resolved or is not
	 * 
	 * student.subject="Java";
	 */
	
	
	
	
	
	Student student2=new Student();
	student2.name="omid";
	student2.lastName="Mahmoodi";
	student2.studentId=102;
	student2.grade='A';
	//accessing methods of student class
	student2.study();
	student2.doHomework();

	System.out.println("-------------------------------");
	
	student1.study();
	student1.doHomework();
	
	String fullName=student1.getFullName();
	System.out.println(fullName);

	fullName=student2.getFullName();
	System.out.println(fullName);
	
	student1.printInfo();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
