package Tasks6.exercise1_2;

public class Main {
    public static void main(String[] args) {
        Client john = new Client("John", "Smith", "Sber");
        showInfo(john);
        showDescription(john);

        BankEmployee bob = new BankEmployee("Bob", "Marly", "AlphaBank");
        showInfo(bob);
        showDescription(bob);
    }

    private static void showDescription(About about) {
        about.showDescr();
    }

    public static void showInfo(Human human) {
        human.showInfo();
    }

}
