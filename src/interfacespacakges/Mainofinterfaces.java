package interfacespacakges;

public class Mainofinterfaces implements Demo1{

	public static void main(String[] args) {
		
		Demo1 m=new Mainofinterfaces();//this line means:
		                               //*we are creating object for mainofunterfaces to extract the class 
		                               //*but implementing Demo1 class methods
		m.display();
		m.name();

	}
	//if we use implement the class  then we shuold use those methods in main class
	//if we didnt use methods it will throw an error
	//we cant skip one methods aslo,must use all methods

	@Override
	public void display() {
		System.out.println("first abstract metod");
		
	}

	@Override
	public void name() {
		System.out.println("second abstract mathod");
		
	}

}
