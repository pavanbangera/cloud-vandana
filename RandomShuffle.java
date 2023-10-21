import java.util.Arrays;
import java.util.Random;

public class RandomShuffle {

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7 };

        // print original array
        System.out.println("Original Array: " + Arrays.toString(values));

        // call function for random shuffle the array
        shuffle(values);

        // shuffled array...output
        System.out.println("Shuffled Array: " + Arrays.toString(values));

    }

    static void shuffle(int[] arr) {
        // using Random class for select random position in the given array
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            // select random number here
            int j = random.nextInt(i + 1);

            // swap random position with i index
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }
}