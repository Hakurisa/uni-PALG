package cv02;

import lib.Utils;

import java.util.Random;

public class Main {

    private static Random rnd = new Random();
    public static void main(String[] args) {
        search();
    }

    private static void search() {
        int number = 20;
        int [] a = new int[number];
        for (int i = 0; i < number; i++) {
           a[i] = rnd.nextInt(100);
        }
        Utils.printArray(a);
        Utils.selectionSort(a);
        Utils.printArray(a);
        System.out.println(Utils.binarySearch(a, a[4]));
        System.out.println(Utils.binarySearch(a, 69));
        //System.out.println("xdd");

    }
}
