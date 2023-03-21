package javahomework;
//Java programs to implement the program

import java.util.Scanner;

/**
 *WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme5 {

    public static void main(String[] args) {
        salarySlip();               //static method
    }
    public static void salarySlip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee Id: ");
        int eId = scanner.nextInt();
        System.out.println("Enter the Employee Name: ");
        String eName = scanner.next();
        System.out.println("Enter the Basic salary: ");
        double salary = scanner.nextDouble();
        double hra = (salary*10)/100;
        double ta = (salary*8)/100;
        double da = (salary*9)/100;
        double pf = (salary*20)/100;
        double grossSalary = (salary + hra + ta + da)-pf;
        scanner.close();

        System.out.println("|--------------------------|----------------------|");
        System.out.println("|                       Salary Slip                |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|Employee ID        :"+eId+"                       |");
        System.out.println("Employee Name       :"+eName+"                     |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|Basic salary       :"+salary+"                    |");
        System.out.println("|HRA 10%            :"+hra+"                       |");
        System.out.println("|TA 8%              :"+ta+"                        |");
        System.out.println("|DA 9%              :"+da+"                        |");
        System.out.println("|PF 20%             :"+pf+"                        |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|Gross salary       :"+grossSalary+"               |");
        System.out.println("|--------------------------------------------------|");






    }

}