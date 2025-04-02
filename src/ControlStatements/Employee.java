package ControlStatements;

public class Employee
{
	public String ename;
	 public int salary;
	
	public void display()
	{
		if(salary>50000)
		{
			System.out.println("Employee is manager");
		}
		else
		{
			System.out.println("Employee is associate");
			
		}
	}

}
