package Tasks6.exercise5;

import java.util.Scanner;

public class NewUser extends User{
    String name;
    @Override
    public void setAge() {
        name = scan.nextLine();
    }
    public void getInfo() {
        System.out.printf(name);
    }
}
