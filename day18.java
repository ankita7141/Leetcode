public class day18 {

    public int[] smallernumthancurrent(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        day18 obj = new day18();

        int[] result = obj.smallernumthancurrent(nums);

        System.out.print("Result: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}