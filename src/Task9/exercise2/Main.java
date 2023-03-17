package Task9.exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("qwerty");
        array.add("qwe");
        array.add("qwerty");
        array.add("qwert");
        array.add("werty");
        array.add("erty");
        array.add("qwerty");
        System.out.println(getCollection(array));

    }

    public static List<String> getCollection(List<String> array) {
        Set<String> set = new LinkedHashSet<>();
        for (String s : array) {
            set.add(s);
        }
        return new ArrayList<>(set);

    }
}
