package Task10.Exercise1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static Task10.Exercise1.Read.readFile;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        File file = new File("src/Task10/Exercise1/text.txt");
        text = readFile(String.valueOf(file));
        System.out.println(text);
    }
}
