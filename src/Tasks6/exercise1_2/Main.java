package Tasks6.exercise1_2;

public class Main {
    public static void main(String[] args) {
        Client john = new Client("John", "Smith", "Sber");
        john.showInfo();
        john.showDescription();

        BankEmployee bob = new BankEmployee("Bob", "Marly", "AlphaBank");
        bob.showInfo();
        bob.showDescription();


    }
}
