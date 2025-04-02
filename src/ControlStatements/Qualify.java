package ControlStatements;

public class Qualify {
	public String entrance;
	public int height;
	
	public String interview;
	
	
	public Qualify(String entrance,int height,String interview)
	{
		this.entrance=entrance;
		this.height=height;
		this.interview=interview;
	}
	
	public void result()
	{
		if(this.entrance=="pass" & this.height>5 & this.interview=="clear")
		{
			System.out.println("you are qaulified");
		}
		else
		{
			System.out.println("you are dissqualified");
		}
	}

}
