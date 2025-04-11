package Arrays;

public class Multidimentionalarray {
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		//multidimentional array :it is in matrix format x-axis and y=axis
		//2d array
		int[][] a = new int[3][4];
            a[0][0]=1;
            a[0][1]=2;
            a[0][2]=3;
            a[0][3]=4;
            a[1][0]=5;
            a[1][1]=6;
            a[1][2]=7;
            
 
            int sizeTotalArrays = a.length;
        	int sizeOthArray = a[0].length;
        	int size1thArray = a[1].length;
            
            
           // System.out.println(a[1][0]);
          // int b[][]= { {4,6,7}, {2,9,6}};
            //to print all the values
          
           for(int i=0;i<a.length;i++)     //outer loop for row
            {
            	int sizeInnerArray = a[i].length;
            
            	for(int j=0;j<a[i].length;j++) //inner for loop for column
            	{
            		System.out.println(a[i][j]);
            	}
            }
           
           // refer below loop for each syntax
//           for (int [] innerArray: a) {
//        	   for (int data: innerArray) {
//        		   System.out.println(data);
//        	   }
//        	   
//           }
	}
	}


