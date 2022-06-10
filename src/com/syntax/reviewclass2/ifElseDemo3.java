package com.syntax.reviewclass2;

import java.util.Scanner;

public class ifElseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scanner=new Scanner(System.in);
	System.out.println("please enter your account balance");
	double accountBalance=scanner.nextDouble(); //to import a double number
	System.out.println("please enter the amount that you want to lend to your friend");
	double amountToLend=scanner.nextDouble();
	
	if(accountBalance>=amountToLend) {
		System.out.println("yes i can help you");
	}else {
		System.out.println("sorry i dont have enough money to help you");
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
