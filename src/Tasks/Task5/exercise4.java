package Tasks.Task5;

public class exercise4 {
    public static void main(String[] args) {
        String text1 = "Lorem ipsum dolor sit amet consectetur adipisicing elit";
        String text2 = "dolor sit amet";
        System.out.println(findCount(text1, text2));
    }

    public static int findCount(String text1, String text2) {
        int count = 0;
        for (String el : text1.split(" ")) {
            for (String el2 : text2.split(" ")) {
                if (el.equals(el2)) {
                    count++;
                }
            }
        }
        return count;
    }
}
