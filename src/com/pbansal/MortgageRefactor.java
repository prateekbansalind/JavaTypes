package com.pbansal;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageRefactor {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;

    // This method calculates final mortgage.
    public static double calculateMortgage(int principal, float yearlyInterest, byte year){
        short numberOfPayments = (short) (year * MONTH_IN_YEAR);
        float monthlyInterest = yearlyInterest / MONTH_IN_YEAR / PERCENT;
        double mortgage = principal
                * ((monthlyInterest * Math.pow((1+monthlyInterest), numberOfPayments))
                / (Math.pow((1+monthlyInterest), numberOfPayments) - 1));
        return mortgage;
    }

    // Generic method to accept the user input and validate input criteria.
    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double userInput;
        while (true){
            System.out.print(prompt);
            userInput = scanner.nextDouble();
            if (userInput >= min && userInput <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max + ".");
        }
        return userInput;
    }

    // Method to calculate remaining principle after 1st monthly installment
    public static double calculateBalance(int principal, byte year, float yearlyInterest, byte noOfPaymentMade ){
        short numberOfPayments = (short) (year * MONTH_IN_YEAR);
        float monthlyInterest = yearlyInterest / MONTH_IN_YEAR / PERCENT;
        double remainingBalance = (principal
                * (Math.pow((1+monthlyInterest), numberOfPayments) - Math.pow((1+monthlyInterest), noOfPaymentMade))
                / (Math.pow((1+monthlyInterest), numberOfPayments) - 1));
        return remainingBalance;
    }
    public static void printPaymentSchedule(int principal, float yearlyInterest, byte year, byte noOfMonth) {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------");

        for (int month = 1; month <= noOfMonth; month++){

            String leftPrincipal = NumberFormat.getCurrencyInstance().format(calculateBalance(principal, year, yearlyInterest, (byte) month));
            System.out.println("Month " + month + " : " + leftPrincipal);
        }
    }

    public static void printMortgage(int principal, float yearlyInterest, byte year) {
        double mortgage = calculateMortgage(principal, yearlyInterest, year);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMORTGAGE :" + formattedMortgage);
        System.out.println("------");
    }

}
