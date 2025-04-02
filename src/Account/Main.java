package Account;

public class Main {

	public static void main(String[] args) {
		Account accObj1 = new Account(123456,"Akkamahadevi");
		Account accObj2 = new Account(6543211,"Vishva");
		accObj1.setName("Keerthi");
		
		accObj1.printDetails();
		accObj2.printDetails();
		//System.out.println("Obj1 Account Number is " + accObj1.getaccountNumber() +"  & Name is " + accObj1.getName());
		//System.out.println("Obj2 Account Number is " + accObj2.getaccountNumber() +"  & Name is " + accObj2.getName());
		
		
	}
}
