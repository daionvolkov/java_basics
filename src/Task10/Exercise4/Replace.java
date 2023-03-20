package Task10.Exercise4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Replace {

    public static void ReplaceElements(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<String> text = new ArrayList<>();
            List<String> newText = new ArrayList<>();
            //String text = null;
            String input;
            while ((input = reader.readLine()) != null) {
                text.add(input + "\n");
            }
            for (String word : text) {
                for (int i = 0; i < word.length(); i++) {
                    if (!Character.isAlphabetic(word.charAt(i)) || !Character.isDigit(word.charAt(i))) {
                        newText.add(word = word.replace(word.charAt(i), '$'));
                    } else {
                        newText.add(word);
                    }
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (String st : newText) {
                    writer.write(st + "\n");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
