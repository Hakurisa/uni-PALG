package lib;

public class Utils {

/**
 * Selection sort algorithm to sort an integer array in ascending order.
 * 
 * @param a The integer array to be sorted.
 */
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

/**
 * Binary search for the first occurrence of a value in a sorted integer array.
 * 
 * @param a     The sorted integer array to search in.
 * @param value The value to search for.
 * @return      The index of the first occurrence of the value in the array,
 *              or -1 if the value is not found.
 */
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

    public static void bubbleSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n-1-i; j++) {
                if (a[j] > a[j+1]){
                    int swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                }
            }
        }
    }

    public static void insertionSort(int [] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > value) {
                a[j+1] = a[j];
                j--;
            }
            if(a[j+1] < i) 
               a[j+1] = value;
        }

    }

    public static int[] merge(int[] a, int[] b){
        int [] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++]; 
            }
        }
        while(i < a.length) {
            c[k++] = a[i++];
        }
        while(j < b.length) {
            c[k++] = b[j++];
        }
        
        return c;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
