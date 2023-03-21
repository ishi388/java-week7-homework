package javahomework;

import java.util.Scanner;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 or 5 to print numbers divisible by 3 0r 5: ");
        int num = scanner.nextInt();

        if (num == 3) {
            System.out.println("Numbers divisible by 3 between 1 and 100:");
            for (int i = 1; i <= 100; i++) {             //loop and modulo operator
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (num == 5) {
            System.out.println("Numbers divisible by 5 between 1 and 100:");
            for (int i = 1; i <= 100; i++) {       //Loop and modulo operator usage
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Invalid input! Please enter 3 or 5.");  //If user don't enter 3 or 5
        }
        scanner.close();
    }
}