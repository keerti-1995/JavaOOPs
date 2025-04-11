package interfacespacakges;

public class Temp implements CentralisedRules {

	
		public String light;
		public String red;

		public  Temp(String light)
		{
			 this.light=light;
		}

		public static void main(String[] args) {
			//below line says that creating object for AmericanTrafficRule this class but 
			//implementing methods which are present in this class CentralisedRules 
			
			
			String red=null,yellow=null,light=null;
			CentralisedRules at=new AmericanTrafficRule();
			
			at.redStop();
			at.flashYellow();
			at.greenGO();
			//if any method implements inside the same class need to create obj of that class,
			//cant use the obj which is linked with the interface
			
			AmericanTrafficRule atr=new AmericanTrafficRule();
			atr.flahingRed();
			
//				if(light==red)
//				{
//					System.out.print("at.redStop()");
//				}
//				else if(light==yellow)
//				{
//					System.out.print("at.flashYellow()");	
//				}
//				else 
//				{
//					System.out.print("at.greenGO();");
//				}
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
		public void flahingRed()
		{
			System.out.println("stop ,watch all sides and go");
		}

	}

	

	


