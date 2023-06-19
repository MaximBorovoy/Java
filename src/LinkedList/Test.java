package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();
        String str1 = "elem0";
        String str2 = "elem1";
        String str3 = "elem2";
        String str4 = "elem3";
        String str5 = "elem4";
        String str6 = "elem5";
        String str7 = "elem6";

        stringList.add(str1);
        stringList.add(str2);
        stringList.add(str3);
        stringList.add(str4);
        stringList.add(str5);
        stringList.add(str6);
        stringList.add(str7);
        stringList.add(7, "elem8");
        stringList.addLast("elem9");
        stringList.addFirst("elem-1");
        stringList.removeFirst();
//        System.out.println(stringList);
//        System.out.println(stringList.getLast());
//        System.out.println(stringList);
        for (String element : stringList)
            System.out.println(element);
        System.out.println("////////");
        System.out.println(stringList);
    }

}
