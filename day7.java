import java.util.*;

public class day7
 {

    // Function to concatenate the array with itself
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        // Input array
        int[] nums = {1, 2, 3};

        // Call the function
        int[] result = getConcatenation(nums);

        // Print input array
        System.out.println("Input Array: " + Arrays.toString(nums));

        // Print concatenated array
        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}