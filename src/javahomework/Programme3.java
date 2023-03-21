package javahomework;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class Programme3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        // Input marks for three subjects
        System.out.print("Enter marks for Maths (out of 100): ");
        int maths = sc.nextInt();
        if (maths < 0 || maths > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }
        System.out.print("Enter marks for Science (out of 100): ");
        int science = sc.nextInt();
        if (science < 0 || science > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }
        System.out.print("Enter marks for English (out of 100): ");
        int english = sc.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }

        // Calculate total marks and percentage
        int totalMarks = maths + science + english;
        double percentage = (double) totalMarks / 3;

        // Determine result and grade
        String result = percentage >= 35 ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }

            // Print mark sheet
            System.out.println("_______________________________");
            System.out.println("|                               |");
            System.out.println("|           Mark Sheet          |");
            System.out.println("|_______________________________|");
            System.out.printf("| Name : %-23s|\n", name);
            System.out.printf("| Roll No: %-21d|\n", rollNo);
            System.out.println("|_______________________________|");
            System.out.println("| Subjects :     Marks          |");
            System.out.println("|_______________________________|");
            System.out.printf("| Maths :        %-5d          |\n", maths);
            System.out.printf("| Science :      %-5d          |\n", science);
            System.out.printf("| English :      %-5d          |\n", english);
            System.out.println("|_______________________________|");
            System.out.printf("| Total :        %-5d          |\n", totalMarks);
            System.out.printf("| Percentage :   %-5.1f%%        |\n", percentage);
            System.out.printf("| Result :       %-5s          |\n", result);
            System.out.printf("| Grade :        %-5s          |\n", grade);
            System.out.println("|_______________________________|");
        }
    }

