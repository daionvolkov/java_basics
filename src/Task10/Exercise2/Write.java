package Task10.Exercise2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Write {

    public static void WriteFile(List<String> text, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String st : text) {
                writer.write(st + "\n");
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }

}
