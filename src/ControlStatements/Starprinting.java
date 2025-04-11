package ControlStatements;

public class Starprinting {

	public static void main(String[] args) {
		
		//right angle half angle traingle 
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1; j<i+1; j++) {
//				System.out.print(" "+"*");
//				
//			}
//			System.out.println();
//		}
		
		//print inverted half angle traingle
		
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=0;j<5-i;j++)
//			{
//				System.out.print(" "+"*");
//			}
//			System.out.println();
//		}
		
		//print  pyramid traingle
		
//		for(int i=0;i<=5;i++)
//		{
//			for(int k=0;k<=5-i-1;k++)
//			{
//				System.out.print(" ");
//				
//			}
//
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//traingle but star starts from 2 **
		
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=0;j<=5-i-1;j++)
//			{
//				System.out.print(" ");
//			}
//			for( int k=0;k<=2*i-1;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//print hollow traingle
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5-i;j++)
			{
				System.out.println(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				if(k==1||k==2*i-1||i==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		
		
		

	}

}
