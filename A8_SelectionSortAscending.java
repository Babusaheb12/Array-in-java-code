package Array_code;

import java.util.Scanner;

public class A8_SelectionSortAscending {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter length: ");
	        int n = sc.nextInt();  // Read the length of the array
	        int[] a = new int[n];  // Initialize the array

	        // Get elements from the user
	        for (int i = 0; i < a.length; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            a[i] = sc.nextInt();
	        }

	        // Sort the array
	        sort(a);

	        // Print the sorted elements
	        System.out.println("Sorted Elements are: ");
	        for (int x : a) {
	            System.out.print(x + "  ");
	        }

	        // Close the scanner to avoid resource leak
	        sc.close();
	    }

	    // Selection sort algorithm
	    public static int[] sort(int[] a) {
	        for (int i = 0; i < a.length - 1; i++) {    
	            int min = a[i];  
	            int min_index = i;
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[j] < min) {
	                    min = a[j];
	                    min_index = j;
	                }
	            }
	            // Swap the found minimum element with the element at index 'i'
	            a[min_index] = a[i];
	            a[i] = min;
	        }
	        return a;  // Return the sorted array after all iterations
	    }

}
