package ControlStatements;

import java.util.ArrayList;

public class ForLoop {
	
	public static void printNumbers(int num) {
		//for loop syntax. 1. Start, 2. condition , 3 - increment/decrement
		

	
			for(int i=1; i <=num; i++ ) {
				
				if(i==5)
				continue;
				System.out.println("Number is "+ i);

			}		
		}
			
			
		//print 1 to 10 stop at 7
	public static void printValue(int num)
	{

	
		for(int i=0;i<=10;i++)
		{
			if(i==7)
				break;
			System.out.println("the number is"+i);
		}
		
	}
	
	//print 1 to 20 odd numbers and skip mulitiple of 5
	public static void printOdd()
	{
		for(int i=1;i<20;i++)
		{
			if(i%2==0) {
				continue;
			}
			if(i%5==0)
				continue;
			System.out.println("Odd numbers are" +" "+i);
		}
		
	}
		
		
		
		
		
		
		
		
		
		
	
	
		

		
	
		
	

		
		
	
	
	
	
	public static void printEvenOddArrayList(ArrayList a) {
		
		for(int i=0; i < a.size(); i++) {
			if((int)a.get(i) % 2 == 0) {
				System.out.println((int)a.get(i) + " - Even Number");	
			}
			else {
				System.out.println((int)a.get(i) + " - Odd Number");
				break;
				//continue;
			}
			System.out.println("Executing Loop - "+ i);
		}
	
	}


}
