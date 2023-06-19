package Tasks;

public class DuplicateZeros {
    public static void main(String[] args) {

        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

    }
}
