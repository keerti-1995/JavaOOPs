package operators;

public class LogicalOperators {
	public void display(int maths,int science )
	{
		int score;
		int maths1 = 0,science1 = 0;
		if(science1>=70 && maths1>=80)
		{
			System.out.println("your have really good score ");
		}
		else
		{
			System.out.println("your score is bad ");
		}
		
		if (science1==35 || maths1==35)
		{
		System.out.println("you are pass");	
		}
		else
		{
			System.out.println("fail ");
		}
		
		if(maths1!=30)
		{
	      System.out.println("your will kick out from the  school ");

		}
		else
		{
			System.out.println("your are in the school");
		}
		}
}
	


