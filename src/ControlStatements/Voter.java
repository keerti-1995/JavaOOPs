package ControlStatements;

public class Voter {
	int voterage;
	
	public Voter(int voterage)
	{
	this.voterage=voterage;	
	}
	public void eligibility()
	{
		if(voterage>18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("not Eligible to vote");
		}

		
	}

}
