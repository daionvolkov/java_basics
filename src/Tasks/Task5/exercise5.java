package Tasks.Task5;


public class exercise5 {
    public static void main(String[] args) {
        String text = "This is a test string";
        System.out.println(reverseString(text));
    }

    public static String reverseString(String text) {
        StringBuilder newText = new StringBuilder();
        for (String el : text.split(" ")) {
            StringBuilder newEl = new StringBuilder(el);
            newText.append(newEl.reverse()
                    .append(" "));
        }
        return newText.toString().trim();
    }
}
