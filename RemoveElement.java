import java.util.Arrays;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int k=0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=val) {
				nums[k]=nums[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
        return k;
    }
	
	public static void main(String[] args) {
		int nums[]= {1,2,2,3,4,2,5};
		
		System.out.println(removeElement(nums, 2));
	}

}
