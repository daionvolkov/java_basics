package Tasks.Tasks2;

public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        long c = 5234L;
        long d = 7123L;
        int e = 85;
        int f = 12;

        double res_add_double = Calculator.Addition(a, b);
        System.out.println("Результат сложения чисел типа double: "+ res_add_double);

        long res_add_long = Calculator.Addition(c, d);
        System.out.println("Результат сложения чисел типа long: "+ res_add_long);

        int res_add_int = Calculator.Addition(e, f);
        System.out.println("Результат сложения чисел типа int: "+ res_add_int);

        double res_div_double = Calculator.Division(a, b);
        System.out.println("Результат деления чисел типа double: "+ res_div_double);

        long res_div_long = Calculator.Division(c, d);
        System.out.println("Результат деления чисел типа long: "+ res_div_long);

        int res_div_int = Calculator.Division(e, f);
        System.out.println("Результат деления чисел типа int: "+ res_div_int);

        double res_multi_double = Calculator.Multiplication(a, b);
        System.out.println("Результат умножения чисел типа double: "+ res_multi_double);

        long res_multi_long = Calculator.Multiplication(c, d);
        System.out.println("Результат умножения чисел типа long: "+ res_multi_long);

        int res_multi_int = Calculator.Multiplication(e, f);
        System.out.println("Результат умножения чисел типа int: "+ res_multi_int);

        double res_sub_double = Calculator.Subtraction(a, b);
        System.out.println("Результат вычитания чисел типа double: "+ res_sub_double);

        long res_sub_long = Calculator.Subtraction(c, d);
        System.out.println("Результат вычитания чисел типа long: "+ res_sub_long);

        int res_sub_int = Calculator.Subtraction(e, f);
        System.out.println("Результат вычитания чисел типа int: "+ res_sub_int);



        Animal cat = new Animal("Tom", 2, "cat");
        Animal dog = new Animal("Johny", 3, "gray", "dog", true);
        Animal mouse = new Animal();
        System.out.println(dog);
        System.out.println(mouse);
        System.out.println(cat);
    }


}
