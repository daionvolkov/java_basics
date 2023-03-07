package Tasks.Task5;

import java.util.Arrays;


public class exercise2 {
    public static void main(String[] args) {
        String word = "annn";
        boolean res = polydromWord(word);
        System.out.println(res);
    }

    public static boolean polydromWord(String word) {

        char[] polydromWord = new char[word.length()];
        char[] arrWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            polydromWord[i] = word.charAt(word.length() - i - 1);
            arrWord[i] = word.charAt(i);
        }
        for (int i = 0; i < arrWord.length; i++) {
            if (arrWord[i] != polydromWord[i]) {
                return false;
            }
        }
        return true;
    }
}
