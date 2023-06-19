package Tasks;

public class LeftAndRightSumCalc {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(calcLeftSum(arr));
        System.out.println(calcRightSum(arr));


    }

    public static int calcLeftSum(int[] arr) {
        //{1,2,3,4,5,6,7,8} -> 1+2+3+4
        int leftSum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            leftSum += arr[i];
        }
        return leftSum;
    }

    public static int calcRightSum(int[] arr) {
        //{1,2,3,4,5,6,7,8} -> 5+6+7+8
        int rightSum = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            rightSum += arr[i];
        }
        return rightSum;
    }

}



