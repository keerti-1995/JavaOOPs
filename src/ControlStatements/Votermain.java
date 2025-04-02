package ControlStatements;

public class Votermain {

	public static void main(String[] args) {
		Voter vt=new Voter(25);
		vt.eligibility();
		
		Qualify qf=new Qualify("pass",6,"clear");
	    qf.result();
		

	}

}
