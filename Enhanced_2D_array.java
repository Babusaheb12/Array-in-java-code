package array;

public class Enhanced_2D_array {
	public static void main(String[] args) {
		int nums[][]= {
				{2,5,6,8,},
				{5,9,6,3,},
				{7,8,9,4},
				{1,2,3,5}
				
		};
		for(int a[] : nums) {
			for(int b:a) {
				System.out.println(b);
			}
			System.out.println( );
		}
	}

}
