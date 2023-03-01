package Tasks.Tasks2;

public class Animal {
    public String name;
    public int age;
    public String color;
    public String category;

    public Animal() {
    }

    public Animal(String name, int age, String color, String category, boolean isHappy) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.category = category;
    }
    public Animal(String name, int age, String category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }
    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
