public class day9 {

    public int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (countOfDigits(nums[i])) {
                count++;
            }
        }

        return count;
    }

    private boolean countOfDigits(int num) {

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count % 2 == 0;
    }

    public static void main(String[] args) {

        day9 obj = new day9();

        int[] nums1 = {12, 345, 2, 6, 7896};
        System.out.println(obj.findNumbers(nums1));   // Output: 2

        int[] nums2 = {555, 901, 482, 1771};
        System.out.println(obj.findNumbers(nums2));   // Output: 1
    }
}