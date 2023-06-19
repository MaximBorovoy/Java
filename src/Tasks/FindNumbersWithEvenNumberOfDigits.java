package Tasks;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771, 22};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] numbers) {
        int numberOfDigits = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int counter = 0;
            while (number != 0) {
                number /= 10;
                ++counter;
            }
            if (counter % 2 == 0)
                numberOfDigits++;
        }
        return numberOfDigits;
    }
}
