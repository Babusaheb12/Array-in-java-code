package Array_code;

public class A7_SimpleReverseArray {
	
	public static void main(String[] args) {
        int[] a = {12, 45, 78, 36, 14};  // Array of numbers
        
        // Loop through each number in the array
        for (int i = 0; i < a.length; i++) {
            int num = a[i];  // Get the current number
            int rev = 0;  // Initialize the variable to store the reversed number
            
            // Reverse the digits of the number
            while (num > 0) {
                int rem = num % 10;  // Get the last digit
                rev = 10 * rev + rem;  // Build the reversed number
                num = num / 10;  // Remove the last digit
            }
            
            System.out.println("Original: " + a[i] + " Reversed: " + rev);
        }
    }

}
