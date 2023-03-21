package javahomework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the number you want to check: ");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("The given number " +n+ " is Even");//true body
        } else {
            System.out.println("The given number " +n+ " is Odd");//false body
            scanner.close();
        }
    }
 }
