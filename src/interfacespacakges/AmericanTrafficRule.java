package interfacespacakges;

public class AmericanTrafficRule implements CentralisedRules,IndianTrafficRules {
	/*A class can have multiple interfaces.just giving one comma and interface name
	 * An interface can define variable also but it should be public
	 * if we did't give public to variable in interface by default it takes as public.
	 * if we implement another interface to class we should create  new object for it.
	 * if any method implements inside the same class need to create object of that class,
		can't use the object which is linked with the interface
	 
	 * An interface can shared by more than one class
	 */

	public static void main(String[] args) {
		
		
		
		
		
		//below line says that creating object for AmericanTrafficRule this class but 
		//implementing methods which are present in this class CentralisedRules 
		
		CentralisedRules at=new AmericanTrafficRule();// CentralisedRules interfcae
		
		at.redStop();
		at.flashYellow();
		at.greenGO();
		
		
	AmericanTrafficRule atr=new AmericanTrafficRule();//local class object
		atr.flahingRed();
		
		
		IndianTrafficRules it=new AmericanTrafficRule();
		it.walking();
		

		}
		
	
	

	@Override
	public void redStop() {
	System.out.println("stop when red light is on");	
		
	}

	@Override
	public void greenGO() {
		System.out.println("you can move light turns into green");	
		
	}

	@Override
	public void flashYellow() {
		System.out.println("wait and go if flashing light is on");	
	}
	//local class method
	public void flahingRed()
	{
		System.out.println("stop ,watch all sides and go");
	}




	@Override
	public void walking() {
		System.out.println("if waliking symbol is on, you can walk");
		
	}

}
