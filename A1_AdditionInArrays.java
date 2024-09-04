package array;

public class A1_AdditionInArrays {
	 public static void main(String[] args) {
	        int[] nums = {1, 2, 3}; // Define the array
	        int result = 0; // Initialize the result variable
	        
	        for (int n : nums) {
	            result += n; // Add each element to the result
	        }
	        
	        System.out.println("The sum of the array elements is: " + result);
	    }
}
