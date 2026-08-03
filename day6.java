public class day6 {

    public int removeDuplicates(int[] nums) {

        // Edge case
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {

                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        day6 obj = new day6();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements = " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}