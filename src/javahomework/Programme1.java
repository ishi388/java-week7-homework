package javahomework;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "even" : "odd"; // Ternary operation
        System.out.println(num + " is " + result);

        scanner.close();


    }



}
