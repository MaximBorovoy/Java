


public class Main {


    public static void main(String[] args) {

        String str = "123456";
        String[] strings = str.split("");
        int[] arr = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        int counter = 0;
        for (int element : arr) {
            counter += element;
        }
        System.out.println(counter);


    }
}



