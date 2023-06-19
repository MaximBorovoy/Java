package Tasks;

public class ReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(reduceToZero(1));
    }

    public static int reduceToZero(int n) {
        int counter = 0;
        while (n > 0) {

            if (n % 2 == 0)
                n /= 2;
            else
                n--;

            counter++;
        }

        return counter;
    }
}


