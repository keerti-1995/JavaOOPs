package Account;

public class Salary {
	private int salary;
	private String name;
	
	
	public Salary( String name,int salary)
	{
		this.name=name;
		this.salary=salary;
		
	}
	public Salary()
	{
		this.salary=salary;
		this.name=name;
	}
	
	public String getname()
	{
		return name;

	}
	public int getsalary()
	{
		return salary;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}

}
