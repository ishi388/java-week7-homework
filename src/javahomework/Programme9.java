package javahomework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * Use switch statement
 */
public class Programme9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        String letter = input.nextLine().toUpperCase();        // convert input to uppercase to simplify comparison

        if (letter.equals("A")) {
            System.out.println("The city name is Ahmedabad");
        } else if (letter.equals("B")) {
            System.out.println("The city name is Bangalore");
        } else if (letter.equals("C")) {
            System.out.println("The city name is Chennai");
        } else if (letter.equals("D")) {
            System.out.println("The city name is Delhi");
        } else if (letter.equals("E")) {
            System.out.println("The city name is Ernakulam");
        } else if (letter.equals("F")) {
            System.out.println("The city name is Faridabad");
        } else {
            switch (letter) {                                  // switch statement
                case "G":
                case "H":
                case "I":
                case "J":
                case "K":
                    System.out.println("Invalid entry: Please enter an alphabet from A to F");
                    break;
                default:
                    System.out.println("Invalid entry: " + letter + " is not a valid alphabet");
                    break;

            }
        }
    }
}

