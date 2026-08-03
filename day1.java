import java.util.Arrays;
import java.util.HashMap;

public class day1 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        day1 obj = new day1();

        int[] nums = {2, 7, 11, 15};

        int[] ans = obj.twoSum(nums, 9);

        System.out.println(Arrays.toString(ans));
    }
}