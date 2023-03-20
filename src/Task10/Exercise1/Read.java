package Task10.Exercise1;

import java.io.*;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Read {

    public static ArrayList ReadFile(String file) {


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> text = new ArrayList<>();
            String input;
            while ((input = reader.readLine()) != null) {
                text.add(input);
            }
            return (ArrayList) text;

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }


}
