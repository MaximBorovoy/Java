package ArrayList;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int number6 = 6;
        int number7 = 7;

        List<Integer> integerList = new ArrayList<>();
        integerList.add(number1);
        integerList.add(number2);
        integerList.add(number3);
        integerList.add(number4);
        integerList.add(number5);
        integerList.add(number6);
        integerList.add(number7);
        integerList.remove(6);
        Iterator<Integer> iterator = integerList.iterator();
        System.out.println(integerList);

    }
}
