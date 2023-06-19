package FileIo;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exception {


    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number != 0)
                throw new MyException("number is not equals to 0");
        }
    }
}
