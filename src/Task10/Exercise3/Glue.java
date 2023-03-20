package Task10.Exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Glue {

    public static void GlueTwoFiles(String filenameToRead, String filenameToAdd) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filenameToRead))) {
            List<String> text = new ArrayList<>();
            String input;
            while((input = reader.readLine()) != null) {
                text.add(input);
            }
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(filenameToAdd, true))) {
                for (String st : text) {
                    writer.write(st);
                }
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
