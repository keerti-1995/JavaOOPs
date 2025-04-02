package ControlStatements;

public class Control {
	public int score;
	public final int passingScore = 35;
	
	public Control(int score) {
		this.score = score;
	}
	
	
	public String getResult() {
		String temp;
		if(this.score > this.passingScore) {
			temp = "Pass";
			
		}else {
			temp = "Fail";
		}
		return temp;
	}
	
	public void getResultPrint() {
		String temp;
		if(this.score > this.passingScore & this.score > 60) {
			temp = "First Class";
			
		}else if(this.score > this.passingScore ){
			temp = "Pass";
		}else {
			temp = "Fail";
		}
		System.out.println("You Scored "+ this.score +" marks and Result: " + temp);
	}

}
