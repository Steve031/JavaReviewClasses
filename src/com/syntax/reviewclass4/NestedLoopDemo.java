package com.syntax.reviewclass4;

public class NestedLoopDemo {

	public static void main(String[] args) {

		
		
for(int x=1; x<=2; x++)	{
	System.out.println(x);
}	
		
for(int x=1; x<=2; x++)	{
	System.out.println(x);
}			
		
for(int x=1; x<=2; x++)	{
	System.out.println(x);
}			

System.out.println("-----------------");		
		
for(int y=1; y<=3; y++)	{     //will make the inner loop repeat 3 times
	for(int x=1; x<=2; x++)	   //same thing as code above
		System.out.println(x);
}	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
