package Fibonacci;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(findIndexOfANumber(7));
    }

   public static int findIndexOfANumber(int number) {
        int[] arr = {1, 2, 3, 4, 7, 5, 7};
        for (int i = 0; i < arr.length; i++)
            if (number == arr[i]) {
                number = i;
                return number;
            }
        return -1;
    }
}
