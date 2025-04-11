package ControlStatements;

public class Starpattern {
	
	

	public static void main(String[] args) {
		
		//right traingle star pattern
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<1+i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//inverted right traingle star pattern
		for(int i=1;i<5;i++)
		{
			for(int j=5;j>5-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
