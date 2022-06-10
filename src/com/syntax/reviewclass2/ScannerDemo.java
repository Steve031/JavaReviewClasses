package com.syntax.reviewclass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("please enter your age");
		int age=scanner.nextInt();
		
		String newLine=scanner.nextLine();//processes enter and spaces(launches next syso)
		
		System.out.println("please enter your name");
		String name=scanner.nextLine();
		
		
		
	
		
	System.out.println(age+name);
		
		
		
		
		
	 boolean isSunny;
     int temperature ;
     Scanner scanner=new Scanner(System.in);
     System.out.println("Is it sunny outside?");
      isSunny=scanner.nextBoolean();
      if(isSunny){
           System.out.println("It is a sunny day, I should go somewhere!");
           System.out.println("What is the temperature outside?");
           temperature=scanner.nextInt();
           if(temperature>85){
               System.out.println("I am going to the beach");
           }else {
               System.out.println("I am going to the park");
           }
       }else {
           System.out.println("I stay home and practice Java");
       }
   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
