package FileIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFromFile {
    public static void main(String[] args) {
        try {
            readFromFile();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
    public static void readFromFile() throws FileNotFoundException {
        String path = "C:/Users/adm/Desktop/test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }


}
