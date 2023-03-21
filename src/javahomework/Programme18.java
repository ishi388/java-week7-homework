package javahomework;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {   //loop is created to iterate each element
            sum += numbers[i];
        }

        System.out.println("The sum of the array is: " + sum);
    }
}


