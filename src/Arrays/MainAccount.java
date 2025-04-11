package Arrays;

import java.util.ArrayList;

import Account.Account;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Account> acc = new ArrayList<Account>();
		Account a1 = new Account(1, "Vishva");
		Account a2 = new Account(2, "Anvika");
		Account a3 = new Account(3, "Parvathi");
		
		acc.add(a1);
		acc.add(a2);
		acc.add(a3);
		acc.add(new Account(4, "Appa"));
		
		
		//acc.get();

//		System.out.println("account name and number is:" );
//		a1.printDetails();
//		a2.printDetails();
//		a3.printDetails();
		
		for(int i=0;i<acc.size();i++)
		{
			//h.set(i, h.get(i) +" Hiremath");	
			
			System.out.println(acc.get(i).getName());
			System.out.println(acc.get(i).getaccountNumber());
//			acc.get(i).setName(acc.get(i).getName() + " Hiremath");
//				acc.get(i).printDetails();
		
//acc.set(i, +"hiremath").
	}
	}
}
