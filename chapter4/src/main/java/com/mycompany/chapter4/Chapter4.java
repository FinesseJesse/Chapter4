/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chapter4;
import java.util.Scanner;

/**
 *
 * @author jswai
 */


public class Chapter4 {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employeeName = SCANNER.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = SCANNER.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = SCANNER.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = SCANNER.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = SCANNER.nextDouble();

        System.out.println();
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        double grossPay = Math.round(hours * payRate * 100) / 100d;
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        double federalWithholding = Math.round(grossPay * federalTaxRate * 100) / 100d;
        System.out.println("\tFederal Withholding (" + federalTaxRate * 100 + "%): $" + federalWithholding);
        double stateWithholding = Math.round(grossPay * stateTaxRate * 100) / 100d;
        System.out.println("\tState Withholding (" + stateTaxRate * 100 + "%): $" + stateWithholding);
        double totalWithholding = federalWithholding + stateWithholding;
        System.out.println("\tTotal Deduction: $" + totalWithholding);
        System.out.println("Net Pay: $" + (grossPay - totalWithholding));
    }
}