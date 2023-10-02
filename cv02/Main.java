package cv02;

import java.util.Random;

public class Main {

    private static Random rnd = new Random();
    public static void main(String[] args) {
        search();
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {

            int min = a[i];
            int index = i;

            for (int j = i; j < n; j++) {
                if(a[j] < min) {
                    min = a[j];
                    index = j;                    
                }
            }

            if(index != i) {
                a[index] = a[i];
                a[i] = min;
            }
        }
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static int binarySearch(int[] a, int value) {
        int m = 0;
        int n = a.length-1;
        while (m <= n) {
            if (value == a[(m+n)/2]) {
                return (m+n)/2;
            } else if (value < a[(m+n)/2]) {
                n = (m+n)/2 - 1;
            } else {
                m = (m+n)/2 + 1;
            }
        }
        return -1;

    }

    private static void search() {
        int number = 20;
        int [] a = new int[number];
        for (int i = 0; i < number; i++) {
           a[i] = rnd.nextInt(100);
        }
        printArray(a);
        selectionSort(a);
        printArray(a);
        System.out.println(binarySearch(a, a[4]));
        System.out.println(binarySearch(a, 69));
        //System.out.println("xdd");

    }
}
