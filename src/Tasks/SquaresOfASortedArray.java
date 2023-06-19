package Tasks;

import java.util.Arrays;


public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] numbers = {-5, 1, 0, 6};
        System.out.println(Arrays.toString(sortedSquares(numbers)));

    }

    public static int[] sortedSquares(int[] nums) {
        int[] squaredArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squaredArray[i] = nums[i] * nums[i];
        }

        return Arrays.stream(squaredArray).sorted().toArray();
    }
}


