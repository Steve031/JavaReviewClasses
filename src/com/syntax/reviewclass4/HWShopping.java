package com.syntax.reviewclass4;

import java.util.Scanner;

public class HWShopping {

	public static void main(String[] args) {

		
		/*

		Write a program to ask a user to enter item they want to buy and the price of that item. 
		Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		If user give more money program should return a change. 
		Whenever a user done with payments program should say "Thank you for shopping!"

		*/		
double accumulatedAmount=0;
Scanner input = new Scanner(System.in);
double amountToPayOff = 0;


do {
	
	System.out.println("enter the item name that you want to buy");
	String itemName=input.next();
	System.out.println("enter the price of item");
	double itemPrice=input.nextDouble();
	accumulatedAmount=accumulatedAmount+itemPrice;
	System.out.println("please enter the money");
	double money=input.nextDouble();
	amountToPayOff=money-accumulatedAmount;
	if(amountToPayOff<0) {
		System.out.println("amount to pay off"+ (-1*amountToPayOff));
	}
	System.out.println("Amount to pay off"+ amountToPayOff);
}
while(amountToPayOff<0);
System.out.println("here is your change "+amountToPayOff+" thank you for shopping");
		
	
		
		
		
		
		
		
	}

}
