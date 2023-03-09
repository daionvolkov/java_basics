package Tasks.Task5;

public class exercise4 {
    public static void main(String[] args) {
        String text = "Lorem is ipsum dolor is sit amet consectetur adipisicing elit";
        String word = "is";
        System.out.println(findCount(text, word));
    }

    public static int findCount(String text, String word) {
        int count = 0;
        for (String el : text.split(" ")) {
            if (el.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
