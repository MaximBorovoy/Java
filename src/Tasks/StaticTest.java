package Tasks;

public class StaticTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
        print();
        StaticPrinter.x = 5;
        StaticPrinter.y = 6;
        System.out.println(StaticPrinter.x + StaticPrinter.y);
    }

    static class StaticPrinter {
        static int x;
        static int y;


    }

    public static void print() {
        System.out.println("Printing...");
    }
}

