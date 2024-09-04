package Array_code;

import java.util.Scanner;

public class A18_EvenORLength {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		String[] k={"Even", "Odd"};
		System.out.println("The Number is: "+k[n%2]);
			
	} 

}
