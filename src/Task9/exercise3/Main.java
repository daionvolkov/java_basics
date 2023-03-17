package Task9.exercise3;

import java.io.Console;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<Integer> array = new ArrayList<>();
        array = fillArrayList();
        getElement(array);
        long end = System.currentTimeMillis();
        long timePassed = end - start;
        System.out.println("Время для ArrayList: " + timePassed);

        long start2 = System.currentTimeMillis();
        List<Integer> array2 = new LinkedList<>();
        array2 = fillLinkedList();
        getElement(array2);
        long end2 = System.currentTimeMillis();
        long timePassed2 = end2 - start2;
        System.out.println("Время для LinkedList: " + timePassed2);
    }

    public static List<Integer> fillArrayList() {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            newList.add(i);
        }
        return newList;
    }

    public static List<Integer> fillLinkedList() {
        List<Integer> newList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            newList.add(i);
        }
        return newList;
    }

    public static int getElement(List<Integer> array) {
        int x = 0;
        for (int i = 0; i < 100000; i++) {
            int rand = (int) (Math.random() * 1000) + 1;
            x = array.get(rand);
        }
        return 0;
    }
}

