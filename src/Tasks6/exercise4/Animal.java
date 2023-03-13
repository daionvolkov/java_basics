package Tasks6.exercise4;
import java.util.Scanner;
import java.io.Console;

public class Animal {
    int age;
    Scanner scan = new Scanner(System.in);
    public Animal() {
        age = scan.nextInt();
    }

    public int getAge() {
        return age;
    }
}
