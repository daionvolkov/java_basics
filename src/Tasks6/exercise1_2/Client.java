package Tasks6.exercise1_2;

public class Client extends Human {
    private String bankName;
    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    void showInfo() {
        System.out.println("Имя клиента:"+getName());
        System.out.println("Фамилия клиента: "+getSurname());
        System.out.println("Название банка: " +getBankName());
    }
    public String getName() {
        return super.getName();
    }
    public String getSurname() {
        return super.getSurname();
    }
    public String getBankName() {return bankName;}


    @Override
    public void showDescription() {
        System.out.println("Клиент банка");
    }
}
