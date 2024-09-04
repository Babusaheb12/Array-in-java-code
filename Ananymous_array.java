package array;

class Addition {
    public int adds(int[] nums) {
        int result = 0;
        for(int n : nums) {
            result = result + n;
        }
        return result;
    }
}

public class Ananymous_array {
	public static void main(String[] args) {
		Addition obj=new Addition();
		int nums[]= {1,2,3};
		int results=obj.adds(nums);
		System.out.println(results);
		
		
		}
	}
