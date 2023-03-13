package Task7;

public class Plane {

    public class Wing {
        int wingWeight;

        public Wing(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        void printWingWeight() {
            System.out.println(wingWeight);
        }
    }

    public void getWingWeight(int wingWeight) {
        Wing wing = new Wing(wingWeight);
        wing.printWingWeight();
    }

}
