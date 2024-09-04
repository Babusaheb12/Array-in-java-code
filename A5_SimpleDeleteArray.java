package Array_code;

public class A5_SimpleDeleteArray {
	public static void main(String[] args) {
        // Initialize the array with some elements, including duplicates
        int[] y = {6, 45, 25, 12, 25, 14, 45, 36, 63, 36, 63};
        
        // Call the method to remove duplicates and get the resultant array
        int[] z = getElements(y);
        
        // Print the elements of the resultant array
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
    } 
    
    // Method to remove duplicates from the array
    public static int[] getElements(int[] p) {
        int k = p.length; // Initialize k with the length of the array
        
        // Iterate over each element in the array
        for (int i = 0; i < k; i++) {
            // Compare the current element with the rest of the elements
            for (int j = i + 1; j < k; j++) {
                // If a duplicate is found
                if (p[i] == p[j]) {
                    // Replace the duplicate element with the last element in the array
                    p[j] = p[k - 1];
                    k--;  // Reduce the effective size of the array
                    j--;  // Stay at the current index to check the new element at this position
                }
            }
        }
        
        // Create a new array of the correct size (with duplicates removed)
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = p[i]; // Copy the elements from the original array to the new array
        }
        
        // Return the new array without duplicates
        return b;    
    }
	

}
