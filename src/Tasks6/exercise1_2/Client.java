package Tasks6.exercise1_2;

public class Client extends Human {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя клиента: " + getName() + ", Фамилия клиента: " + getSurname() + ", Название банка: " + getBankName());
    }

    public String getBankName() {
        return bankName;
    }


    @Override
    public void showDescription() {
        System.out.println("Клиент банка");
    }
}
