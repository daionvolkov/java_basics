package Task10.Exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Glue {

    public static void glueTwoFiles(String filenameToRead, String filenameToAdd) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filenameToRead));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filenameToAdd, true))) {
            List<String> text = new ArrayList<>();
            String input;
            while ((input = reader.readLine()) != null) {
                text.add(input);
            }
            for (String st : text) {
                writer.write(st);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
