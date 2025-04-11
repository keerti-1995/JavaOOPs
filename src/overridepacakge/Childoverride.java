package overridepacakge;


public class Childoverride extends parentoverride {
	//override is nothing but we can use same function name in parent and child but while excution which is in child that only executes.
	
	
	public void engine()
	{
		System.out.println(" child engine is ready");
	}
	
	public void audioSystem()
	{
		System.out.println("child audiosystem");
	}
	public void carcolor()
	
	{
		
		System.out.println(color);
	}

	public static void main(String[] args) {
		 
		Childoverride cc=new Childoverride();
        cc.carcolor();
        cc.breaks();
        cc.engine();
        cc.gear();
        cc.audioSystem();
	}





	}


