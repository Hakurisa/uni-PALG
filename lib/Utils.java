package lib;

public class Utils {
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

    public static int binarySearch(int[] a, int value) {
        int m = 0;
        int n = a.length-1;
        while (m <= n) {
            int k = (m+n)/2;
            if (value == a[k]) {
                //hledání prvního prvku
                while(k>=0 && a[k] == value) {
                    k--;
                }
                return k + 1;
                //return (m+n)/2;
            } else if (value < a[k]) {
                n = k - 1;
            } else {
                m = k + 1;
            }
        }
        return -1;

    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
