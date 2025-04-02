package ControlStatements;

public class School {
	 public String student1 ;
	 public int Maths;
	 public int Science;
	 public int English;
	 
	public int score;
	 
	 
	public School(int Maths,int Science,int English)
	{
		this.Maths=Maths;
		this.Science=Science;
		this.English=English;
		
	}
	public void Result()
	{
		
		if(this.Maths>=70 && this.Science>=70 && this.English>=70 )
		{
			System.out.println("you will get free seat for Science course");
		}
		else if(this.score<70)
		{
			System.out.println("you will not get free seat for Science course");
		}
		
		else
		{
			System.out.println("you will not get  seat for Science course");
		}
		}
	}
	
	


