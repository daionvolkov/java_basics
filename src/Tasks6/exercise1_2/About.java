package Tasks6.exercise1_2;

public interface About {
    public static String description = "VIP";

    abstract void showDescription();
    static String getDescr() {
        return description;
    }
    default void showDescr() {
        System.out.println(getDescr());
    }
}
