package Arrays;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create a 2d array
        int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
        int[] b = {1, 2, 5, 6};
        
        for (int g: b) {
        	System.out.println(b);
        }
            
        
        
	}

}
