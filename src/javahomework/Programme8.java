package javahomework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        String alphabet = scanner.next();

        if (alphabet.equals("A")) {
            System.out.println("City name: Ahmedabad");
        } else if (alphabet.equals("B")) {
            System.out.println("City name: Baroda");
        } else if (alphabet.equals("C")) {
            System.out.println("City name: Chicago");
        } else if (alphabet.equals("D")) {
            System.out.println("City name: Delhi");
        } else if (alphabet.equals("E")) {
            System.out.println("City name: Edinburgh");
        } else if (alphabet.equals("F")) {
            System.out.println("City name: Frankfurt");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F.");
          scanner.close();
        }
    }
}



