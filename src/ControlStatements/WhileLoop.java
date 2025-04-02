package ControlStatements;

public class WhileLoop {
	
public void printWhileLoop(int num) {
	
	//main difference - var initialize, auto increment
	
	int i = 1;
	int sumFive=0;
	int sumTen=0;
	int sumRemaining=0;
	while(i<=num) {
		if(i % 10 == 0) {
			sumTen += i;
		}else if(i%5==0) {
			sumFive += i;
		}else {
			sumRemaining += i;
		}

		i++;
	}
	System.out.println("Multiples of 5 SUM: " + sumFive);
	System.out.println("Multiples of 10 SUM: " + sumTen);
	System.out.println("Remaining numbers SUM: " + sumRemaining);


	}
}

