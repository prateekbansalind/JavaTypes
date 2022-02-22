package com.pbansal;

import java.text.NumberFormat;

import static com.pbansal.MortgageRefactor.*;

public class MortgageCalculator {
        public static void mortgageCalc(){
            // Principal : 1000000
            // Annual Interest Rate : 3.92
            // Period (Years) : 30
            // Mortgage : $472.81

            int principal = (int) readNumber("Enter a principal amount: ", 1000, 1000000);
            float yearlyInterest = (float) readNumber("Enter a annual interest rate: ", 1, 30);
            byte year = (byte) readNumber("Enter period of year: ", 1, 30);
            byte noOfMonth = (byte) (year * 12);

            // Calculate mortgage
            printMortgage(principal, yearlyInterest, year);

            // Calculate payment schedule
            printPaymentSchedule(principal, yearlyInterest, year, noOfMonth);

        }
}

