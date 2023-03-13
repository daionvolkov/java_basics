package Tasks6.exercise5;

import java.util.Scanner;

public class NewUser extends User {
    String name;

    @Override
    public void setInfo() {
        name = scan.nextLine();
    }

    @Override
    public void printInfo() {
        String s = String.valueOf(name);
        System.out.println("Имя пользователя: " + s);
    }
}
