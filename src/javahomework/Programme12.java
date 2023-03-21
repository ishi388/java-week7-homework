package javahomework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String input = scanner.next();                        //Reading the input value

        if (input.matches("[0-9]+")) {                 //For identifying number
            System.out.println("Input value is a number.");
        } else if (input.matches("[a-zA-Z]+")){        //For identifying an alphabet
            System.out.println("Input value is an alphabet.");
        } else {
            System.out.println("Input value is a symbol.");
        }

        scanner.close();
    }
}







