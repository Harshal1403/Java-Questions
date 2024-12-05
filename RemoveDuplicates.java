public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;  
    }

    public static void main(String[] args) {
        RemoveDuplicates remover = new RemoveDuplicates();
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 4};
        int k = remover.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
