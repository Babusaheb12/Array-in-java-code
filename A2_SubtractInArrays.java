package array;

public class A2_SubtractInArrays {
public static void main(String[] args) {
	int nums[]= {5,8,9,3,7,5};
	
	int result=0;
	
	for(int n:nums) {
		result-=n;
	}
	
	System.out.println("Subtract the array: "+ result);
}
}
