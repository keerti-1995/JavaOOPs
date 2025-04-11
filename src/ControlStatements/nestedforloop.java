package ControlStatements;

public class nestedforloop {
	public void display()
	{
	
	for(int i=1;i<=4;i++)
	{
	System.out.print(i+" ");
	
	}
	System.out.print("\n");
	for(int j=5;j<=7;j++)
	{
		System.out.print(j+" ");
	}
	System.out.print("\n");
	for(int k=8;k<=9;k++)
	{
		System.out.print(k+" ");
	}
	System.out.print("\n");
	 int l=10;
System.out.print(l);
	
	
	
	
	
	
	
	}
	
	


public static void main(String[] args)
{
	nestedforloop nlp=new nestedforloop();
	nlp.display();
	}
}
