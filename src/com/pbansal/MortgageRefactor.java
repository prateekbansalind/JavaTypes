package com.pbansal;

import java.util.Scanner;

public class MortgageRefactor {

    // This method calculates final mortgage.
    public static double calculateMortgage(int principal, float yearlyInterest, byte year){

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
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

}
