package Fibonacci;

import java.util.Arrays;

public class GreedyAlgorithms {
    public static void main(String[] args) {
//        int[] digits = {5, 4, 3, 7, 5, 8};
//        System.out.println(maxNumber(digits));
        int[] stations = {0, 250, 375, 550, 750, 950};

        System.out.println(minStops(stations, 400));
    }

    public static String maxNumber(int[] digits) {

        Arrays.sort(digits);

        String result = "";

        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;
    }

    public static int minStops(int[] stations, int range) {
        int result = 0;
        int currentStop = 0;
        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;
            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= range)
                nextStop++;
            if (currentStop == nextStop)
                return -1;

            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }

        return result;
    }
}
