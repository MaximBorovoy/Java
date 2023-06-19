package FileIo;

import java.io.*;

public class ReaderAndWriterExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/adm/Desktop/test1.txt");

        Reader reader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        bufferedWriter.write("str1");
        bufferedWriter.newLine();
        bufferedWriter.write("str2");
        bufferedWriter.close();

        char[] chars = new char[50];
        while ((reader.read(chars)) != -1) {
            for (int i = 0; i < chars.length; i++) {
                if (Character.isAlphabetic(chars[i]) || Character.isWhitespace(chars[i])) {
                    System.out.println(chars[i]);
                }
            }
        }
        System.out.println("///");
        while (bufferedReader.read() != -1) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
