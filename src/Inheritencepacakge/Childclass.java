package Inheritencepacakge;

public class Childclass  extends Parentclass{
	
	public void engine()
	{
		System.out.println("engine is ready");
	}
	public void carcolor()
	
	{
		
		System.out.println(color);
	}

	public static void main(String[] args) {
		 
		Childclass cc=new Childclass();
        cc.carcolor();
        cc.breaks();
        cc.engine();
        cc.gear();
	}
	

}
