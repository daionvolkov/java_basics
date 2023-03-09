package Tasks.Task5;

import java.util.Arrays;


public class exercise2 {
    public static void main(String[] args) {
        String word = "Annasdfsegf";
        //boolean res = polydromWord(word);
        System.out.println(polydromWord(word));
    }

    public static boolean polydromWord(String word) {
        word = word.toLowerCase();
        StringBuilder builderWord = new StringBuilder();
        StringBuilder reverseWord = new StringBuilder();
        builderWord.append(word);
        reverseWord.append(builderWord);
        reverseWord.reverse();
        return reverseWord.toString().equals(builderWord.toString());

    }
}

