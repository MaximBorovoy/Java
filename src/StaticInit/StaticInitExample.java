package StaticInit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaticInitExample {
    static int i = getI();

    static int getI() {
        return 5;
    }

    static {
        j = 10;
    }

    static int j = 0;

    static {
        j++;
    }


    public static void main(String[] args) {
        StaticInitExample staticInitExample = new StaticInitExample();
        System.out.println(i);
        System.out.println(j);

    }
}

