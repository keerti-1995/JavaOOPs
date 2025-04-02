package Account;

public class salarymain {
 
	public static void main(String[] args) {
		
		
		Salary slr=new Salary("Manoj",50000);
		Salary slr3=new Salary();
		slr.getname();
		slr.getsalary();
		slr3.setname("Karan");
		slr3.setsalary(20000);
		System.out.println(slr.getname()+" "+slr.getsalary());
		System.out.println(slr3.getname()+" "+slr3.getsalary());
		
		

}
}