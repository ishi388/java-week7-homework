package javahomework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {
        // Numeric array
        int[] numbers = { 5, 3, 1, 4, 2 };
        Arrays.sort(numbers);
        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));

        // String array
        String[] strings = { "banana", "apple", "orange", "pear", "grape" };
        Arrays.sort(strings);
        System.out.println("Sorted string array: " + Arrays.toString(strings));
    }
}

