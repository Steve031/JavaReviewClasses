package com.syntax.reviewclass6;

public class College {

	public static void main(String[] args) {

Student stu=new Student();
stu.name="john";
stu.lastName="doe";
stu.address="new york";
stu.studentId=199;
stu.age=45;
stu.grade='B';

stu.study();
stu.doHomework();
System.out.println(stu.getFullName());

stu.printInfo();
String rating=stu.rating();

System.out.println(stu.name+" is "+rating+" student");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
