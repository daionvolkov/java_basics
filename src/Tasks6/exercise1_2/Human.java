package Tasks6.exercise1_2;

public abstract class Human implements About {
    private String name;
    private String surname;
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
    abstract void showInfo();

}

