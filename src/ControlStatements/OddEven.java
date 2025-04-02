package ControlStatements;

public class OddEven {
	public static void sumofOddEven(int num)
	{
		
		int sum = 0;
		for(int i=1;i<num;i++)
		{
			if(i%2==0)
			{
			continue;
	
			}
			
			System.out.println("odd numbers is:"+ " "+i );
			//sum=sum+i;
			//System.out.println("The sum of odd number is:"+" "+sum);
			
			if(i%2==0)
			{
				System.out.println("Even numbers is:"+ " "+i );
				sum=sum+i;
				System.out.println("The sum of even number is:"+" "+sum);
				
			}
			if(i>100)
				break;
		}
		
	}

}
