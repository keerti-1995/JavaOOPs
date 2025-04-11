package Arrays;

public class Arrayasdemo {

	public static void main(String[] args) {
		
		//intialising normal varaible
		int a;
		a=3;
		//creating array one way
		int a1[]=new int[5];//declaring array allocating memory for the values using new keyword
		
          a1[0]=2;
          a1[1]=8;
		  a1[2]=7;
		  a1[3]=4;
		  a1[4]=9;
		  
		  // second type Initializing array  one more type
		  int b[]= {2,3,4,5,6,9};
		  
		  
		  for(int i=0;i<a1.length;i++)
           {
        	  //System.out.println(a1[i]) ;//retriving values from the array
			  System.out.println(b[i]);
	        }
		  
		  
	}

}
