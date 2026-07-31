import java.util.*;

public class sumOf1DArray {

    // Function to calculate running sum
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = runningSum(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Running Sum: " + Arrays.toString(result));
    }
}