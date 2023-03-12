package Tasks6.exercise3;

public class Truck extends Car{
    int wheelsCount;
    int maxWeight;
    public  Truck(int weight, String model, char color, float speed, int wheelsCount, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }
    public void  newWheels(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println(this.wheelsCount);
    }
    public void showInfo() {
        super.outPut();
        System.out.println("Количество колес: "+wheelsCount + "Максимальный вес: "+ maxWeight);
    }
}
