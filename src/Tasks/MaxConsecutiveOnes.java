package Tasks;

import static java.lang.Math.max;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
                result = Math.max(result, counter);

            } else {
                counter = 0;
            }
        }

        return result;
    }
}
