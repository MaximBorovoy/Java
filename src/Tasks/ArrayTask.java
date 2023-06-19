package Tasks;


public class ArrayTask {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 5;
        array[1] = 9;
        array[2] = 6;
        array[3] = 4;
        array[4] = 11;
        array[5] = 24;
        array[6] = 37;
        array[7] = 88;
        array[8] = 11;
        array[9] = 39;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                array[i] = -1;
            System.out.println(array[i]);
        }

    }
}
