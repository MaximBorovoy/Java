package FileIo.TryWithResources;

import java.io.*;

public class TryWithResourcesExample {

    public void readFromFile() {
        try (Reader reader = new FileReader(new File("someFileName"));
             Writer writer = new FileWriter(new File(""))) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
