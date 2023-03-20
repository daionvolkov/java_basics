package Task10.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        String filename = "src/Task10/Exercise2/text2.txt";
        text.add("Hello");
        text.add("Hello");
        text.add("Hello");
        Write.WriteFile(text, filename);
    }
}
