import java.util.Arrays;

public class day8 {

    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[2 * n];

        for (int i = 0; i < n; i++) {

            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }

        return res;
    }

    public static void main(String[] args) {

        day8 obj = new day8();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] ans = obj.shuffle(nums, n);

        System.out.println(Arrays.toString(ans));
    }
}