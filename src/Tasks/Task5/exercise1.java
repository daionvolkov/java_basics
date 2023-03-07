package Tasks.Task5;

public class exercise1 {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit quasi architecto provident iure sit molestiae";
        String res = findLongestWord(text);
        System.out.printf(res);
    }
    public static String findLongestWord(String text) {
        String[]textArr=text.split(" ");
        int max_lenth = 0;
        String longestWord = "";
        for(int i=0; i< textArr.length; i++) {
            if (textArr[i].length() > max_lenth) {
                max_lenth = textArr[i].length();
                longestWord = textArr[i];
            }
        }
        return  longestWord;
    }
}
