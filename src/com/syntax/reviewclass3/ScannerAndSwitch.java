package com.syntax.reviewclass3;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {

		
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the name of the country");	
	String country=scanner.nextLine();
	String capital;
	
	
	switch(country) {
	
	case "turkey":
		capital	="ankara";	
		break;
	case "USA":
		capital	="DC";	
		break;
	case "serbia":
		capital	="begrade";	
		break;
	case "albania":
		capital	="tirana";			
		break;
	case "afghanistan":
		capital ="kabul";
		break;
	case "pakistan":
		capital	="islamabad";		
		break;
	default:
		capital="either country name i included correct or its not a country";
	}
		
		
	System.out.println(capital);	
	scanner.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
