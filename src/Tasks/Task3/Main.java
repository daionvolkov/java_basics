package Tasks.Task3;

public class Main {
    public static void main(String[] args) {
        Simple firstObj = new Simple();
        firstObj.setColor("Red");
        firstObj.setTitle("First");
        firstObj.setWeight(100);
        firstObj.printInfo();

        Simple secondObj = new Simple();
        secondObj.setColor("green");
        secondObj.setTitle("Second");
        secondObj.setWeight(150);
        secondObj.printInfo();

        House firstHouse = new House();
        firstHouse.setNumsOfFloors(10);
        firstHouse.setDateOfBuild(1980);
        firstHouse.setTitle("First Building");
        firstHouse.printInfoHouse();
        firstHouse.numsOfYears();

        House secondHouse = new House();
        secondHouse.setNumsOfFloors(15);
        secondHouse.setDateOfBuild(1985);
        secondHouse.setTitle("Second Building");
        secondHouse.printInfoHouse();
        secondHouse.numsOfYears();

        Tree appleTree = new Tree();

        Tree peachTree = new Tree(10, "Peach tree");

        Tree cherryTree = new Tree(20, true, "Cherry tree");
    }
}
