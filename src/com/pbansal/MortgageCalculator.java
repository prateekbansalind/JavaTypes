package com.pbansal;

import java.text.NumberFormat;
import java.util.Scanner;
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

            // Calculate mortgage
            double mortgage = calculateMortgage(principal, yearlyInterest, year);
            String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage :" + formattedMortgage);
            }
        }

