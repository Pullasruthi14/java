import java.io.*;
import java.util.*;
public class CompositeNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isComposite(arr[i])) {
                count++;
            }
        }

        System.out.println("The number of composite numbers in the array is " + count);
    }

    public static boolean isComposite(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }

        return false;
    }
}
