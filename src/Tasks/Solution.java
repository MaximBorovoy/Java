package Tasks;

class Solution {
    public int pivotIndex(int[] numbers, int index) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < numbers[index]; i++)
            leftSum += numbers[i];

        for (int i = numbers[index]; i < numbers.length; i++)
            rightSum += numbers[i];

        if (index < numbers.length / 2)
            return leftSum;
        return rightSum;
    }
}