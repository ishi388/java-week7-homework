package javahomework;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int value = 3;
        boolean containsValue = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                containsValue = true;
                break;
            }
        }
        if (containsValue) {
            System.out.println("The array contains the value " + value);
        } else {
            System.out.println("The array does not contain the value " + value);
        }
    }
}
