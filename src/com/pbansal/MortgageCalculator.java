package com.pbansal;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
        public static void mortgageCalc(){
            // Principal : 1000000
            // Annual Interest Rate : 3.92
            // Period (Years) : 30
            // Mortgage : $472.81

            final byte MONTH_IN_YEAR = 12;
            final byte PERCENT = 100;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the principal amount: ");
            int principal = scanner.nextInt();

            System.out.print("Enter Annual Interest Rate (%): ");
            float yearlyInterest = scanner.nextFloat();

            System.out.print("Enter period of years: ");
            byte year = scanner.nextByte();

            // convert annual interest rate into monthly interest rate
            float monthlyInterest = yearlyInterest / MONTH_IN_YEAR / PERCENT;

            // Convert year into month
            short numberOfPayments = (short) (year * MONTH_IN_YEAR);

            // formula to calculate mortgage.
            double mortgage = principal
                    * ((monthlyInterest * Math.pow((1+monthlyInterest), numberOfPayments))
                    / (Math.pow((1+monthlyInterest), numberOfPayments) - 1));

            // Convert into number format for currency.
            String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

            System.out.println("Mortgage :" + formattedMortgage);





        }
}
