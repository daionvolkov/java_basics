package Tasks6.exercise5;

import java.util.Scanner;

public class User {
    int age = 0;
    Scanner scan = new Scanner(System.in);

    public void setInfo() {
        age = scan.nextInt();
    }

    public void printInfo() {
        String s = String.valueOf(age);
        System.out.println("Возраст пользователя: " + s);
    }

}
