package Array;

public class Average_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		  
	        // getting array length
	        int length = array.length;
	 
	        
	        int sum = 0;
	 
	        
	        for (int i = 0; i < array.length; i++) {
	            
	        	sum += array[i];
	        }
	 
	        double average = sum / length;
	         
	        System.out.println("Average of array : "+average);
	 
	    }
	 
}

