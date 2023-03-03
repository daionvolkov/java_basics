package Tasks.Task3;

class Simple {
    private String color;
    private String title;
    private int weight;

    public  Simple() {
    }
    public  Simple(String color) {
        this.color = color;
    }
    public  Simple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    public void printInfo() {
        System.out.println(color+" "+title +" "+weight);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}