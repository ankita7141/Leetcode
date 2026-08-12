public class day19 {

    public static int sumOddLengthSubarrays(int[] arr) {

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int length = j - i + 1;

                if (length % 2 != 0) {

                    int sum = 0;

                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }

                    answer += sum;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3};

        int result = sumOddLengthSubarrays(arr);

        System.out.println("Sum = " + result);
    }
}