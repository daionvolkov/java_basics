package Tasks.Task5;

public class exercise3 {
    public static void main(String[] args) {
        String text = "Lorem is ipsum dolor is sit amet consectetur  is adipisicing elit";
        String badWord = " is ";
        String res = changeWord(text, badWord);
        System.out.println(res);
    }

    public static String changeWord(String text, String badWord) {
        String new_text = text.replaceAll(badWord, " [вырезано цензурой] ");
        return new_text;
    }
}
