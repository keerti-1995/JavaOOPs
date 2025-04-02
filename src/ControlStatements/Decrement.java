package ControlStatements;

public class Decrement {
	//print the values from 10 to 1
	public static void display()
	{
		int i=10;
		while(i>1)
		{
			System.out.println("The decremented number:" + i);
			i--;
		}
	}


//increment by 2
public static void incrementbytwo()
{
int i=1;
while(i<=20)
{
	
	System.out.println("The value is:"+i);
	i+=2;
	}
}
// Find factorial of 5
public static void factorial()
{
	//int n=5;
	int factorial=1;
	int i=1;
	while(i<=5)
	{
		factorial=factorial*i;
		System.out.println("the factorial of number 5 is:"+factorial);
		i++;
	}
	


}



	}
