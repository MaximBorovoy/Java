import static java.lang.Integer.parseInt;


public class Main {


    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//            System.out.println(arr[i]);
//        }

//        int[][] ints = {{1, 2, 3, 8,8,8},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12, 13}};
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = 0; j < ints[i].length; j++) {
//                System.out.print(ints[i][j]+ " ");
//            }
//            System.out.println();

//        Person person2 = new Person(21, "Лена");
//        person2.setHeight(167);
//        person2.setWeight(35);
//        person2.speak();
//        person3.setHeight(166);
//        person3.setWeight(66);
//        person3.speak();
//        System.out.println(person3);
        String str = "123456";
        String[] strings = str.split("");
        int[] arr = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.valueOf(strings[i]);
        }
        int counter = 0;
        for (int element : arr) {
            counter += element;
        }
        System.out.println(counter);


//        Person person3 = new Person(16, "Oleg");
//        Person person2 = new Person(14, "Eugeniu");
//        person3.go();
//        outputInfo(person3);
//        outputInfo(person2);
//    }
//
//    public static void outputInfo(Info info) {
//        info.showInfo();
//    }
    }
}



