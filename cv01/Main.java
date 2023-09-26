import java.util.Random;

/**
 * Main
 * 
 * Vygenerovat random čísla, odfiltrovat záporná do nového pole, ze záporných vypsat druhé nejmenší
 */
public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        
        int[] arr = new int[50];
        int count = 0;
        int length = 0;

        for (int i = 0; i < 50; i++) {
            int number = -50 + rnd.nextInt(100);
            if(number < 0) {
                length++;
            }
            arr[i] = number;
        }
        int[] negative = new int[length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                negative[count] = arr[i];
                count++;
            }
        }

        int lowest = 0;
        int secondLowest = 0;

        System.out.println("Array of negative numbers:");
        for (int i = 0; i < negative.length; i++) {
            System.out.print(negative[i] + ", ");
            if(lowest > negative[i]) {
                lowest = negative[i];
            }
            if (secondLowest > negative[i] && lowest < negative[i]) {
                secondLowest = negative[i];
            }
        }

        System.out.println("\nSecond lowest number in the negative number array: " + secondLowest);
        
    }
}