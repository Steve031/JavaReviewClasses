package com.syntax.reviewclass6;

public class Student {


		
//define attributes/fields = variables
String name, lastName, address;

int studentId, age;

char grade;

//define behavior = methods
		
void study() {
	System.out.println(name+" student is studying");
}		
void doHomework() {
	System.out.println(name+" Student is doing homework");
}
//crate a method that wil return full name of a student in uppercase
		
String getFullName() {
	return name.toUpperCase()+" "+lastName.toUpperCase();
}		
		
	//create a method to display full info of a student (full name+age+id+address)

void printInfo() {
	System.out.println(name+" "+lastName+" is "+age+" and lives in "+address);
}
		
/*
 * create a method that will return whether student is
 * great, good, bad or average
 * based on the grade		
 */
		
String rating() {
	switch (grade) {
	
	case 'A':	
		return "great";

	case 'B':
		return "good";
		
	case 'C':
		return "average";
		
	default:
		return "bad";
	}
}	
	
void takeSubject(String subject) {
	System.out.println(name+" studies "+subject);
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


