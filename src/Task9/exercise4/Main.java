package Task9.exercise4;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map <User, Integer> map = new HashMap<>();
        User alex = new User("Alex");
        User max = new User("Max");
        map.put(alex, 10);
        map.put(max, 20);

    }

    public static void getUserScore(Map map) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(map[name]);
    }
}
