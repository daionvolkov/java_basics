package Tasks6.exercise1_2;

public class BankEmployee extends Human {
    private String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    public String getBankName() {return bankName;}
    @Override
    public void showInfo() {
        System.out.println("Имя сотрудника банка: " +getName());
        System.out.println("Фамилия сотрудника банка: "+getSurname());
        System.out.println("Название банка: "+getBankName());
    }

    @Override
    public void showDescription() {
        System.out.println("Сотрудник банка");
    }
}
