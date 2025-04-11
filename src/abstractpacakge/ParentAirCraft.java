package abstractpacakge;

public abstract  class ParentAirCraft {
	
	
	public void globalrules()//non abstract methods
	{
		System.out.println("follow the rules");
     }
	public void safetyGuidelines()
	{
		System.out.println("Follow saftey guidelines");
	}
	
	public abstract void bodyColor(); //abstract method

}



