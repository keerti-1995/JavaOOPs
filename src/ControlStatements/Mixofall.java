package ControlStatements;

public class Mixofall {
	private String name;
	private int age;
	 
	public  String getname()
	{
		return this.name;
	}
	
	public void setname(String name)
	{
		if(this.name!=null && !this.name.isEmpty())
		{
			System.out.println("Name is invalid");
		}
		else
		{
			System.out.println("Name is:"+" "+name);
		}

	}
		
	public int getage()
	{
		return this.age;
	}
	public  void setage(int age)
	{
		if(this.age>=0 && this.age<=120  )
		{
			System.out.println(this.age=age);
		}
		else
		{
			System.out.println("Invalid age");
		}
	}
	

}
