package abstractpacakge;

public class ChildAirCraft  extends ParentAirCraft{

	public static void main(String[] args) {
		
	
		
		
		ChildAirCraft c=new ChildAirCraft();//object of child class
		//if we use the class as abstract can't create the object for that class
		c.globalrules();
		c.safetyGuidelines();
		c.bodyColor();
		
		

	
	
	
	
	
	
	}
	@Override
	public void bodyColor() {
	System.out.println("Red color to the body");
		
	}

}
