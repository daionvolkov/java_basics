package Tasks.Task3;


public class House {
    private int numsOfFloors;
    private int dateOfBuild;
    private String title;


    public void setNumsOfFloors(int numsOfFloors) {
        this.numsOfFloors = numsOfFloors;
    }
    public void setDateOfBuild(int dateOfBuild) {
        this.dateOfBuild = dateOfBuild;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getNumsOfFloors() {
        return numsOfFloors;
    }
    public int getDateOfBuild() {
        return dateOfBuild;
    }
    public String gettitle() {
        return title;
    }
    public void printInfoHouse(){
        System.out.println(numsOfFloors+" "+dateOfBuild +" "+title);
    }
    public void numsOfYears() {
        int numbersOfYears = 2023-dateOfBuild;
        System.out.println(numbersOfYears);
    }
}
