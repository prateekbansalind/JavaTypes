package com.pbansal;

import java.util.Scanner;

import static java.lang.String.*;

public class ControlFlow {
    public static void comparisonOperator(){
        int x = 1;
        int y = 1;
        System.out.println(x == y); // output would be "true".
                                    // this expression x == y will give me boolean value.
                                    // boolean expression produce boolean value as result.
    }

    public static void logicalOperator(){
        Byte temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(temperature);

        boolean hasGoodIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }

    public static void ifStatement(){
        byte temp = 32;
        if (temp > 30){
            System.out.println("It's a hot day.");
            System.out.println("Drink plenty of water.");
        }
        else if (temp > 20)  // temp > 20 && temp <= 30
            System.out.println("It's a beautiful day.");
        else
            System.out.println("It's cold.");
    }

    public static void ifStatementSimplified(){
        int hasIncome = 120_000;
//        boolean hasHighIncome = false;
//        if (hasIncome > 100_000){
//            hasHighIncome = true;
//        }
//        else
//            hasHighIncome = false;

        // simplified way
        boolean hasHighIncome = (hasIncome > 130_000);
        System.out.println(hasHighIncome); // false
    }

    public static void ternaryOperator(){

        // First iteration
//        int income = 120_000;
//        String className;
//        if (income > 100_000)
//            className = "First";
//        else
//            className = "Economy";
//        System.out.println(className);

        // 2nd iteration
//        int income = 120_000;
//        String className = "Economy";
//        if (income > 100_000)
//            className = "First";
//        System.out.println(className);

        // 3rd iteration - //professionally refactored the above code
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        // if (condition) is true ? assignValue1 : otherwise assignValue2
        System.out.println(className);

    }

    public static void switchStatement(){
//        String userName = "admin";
//        if (userName == "admin")
//            System.out.println("You're admin.");
//        else if (userName == "moderator")
//            System.out.println("You're are moderator.");
//        else
//            System.out.println("You're are guest.");
//        System.out.println(userName);

        String userName = "guest";
        switch (userName){
            case "admin":
                System.out.println("You're an admin.");
                break;

            case "moderator":
                System.out.println("You're moderator.");
                break;

            default:
                System.out.println("You're guest.");
        }
        System.out.println(userName);
    }

    public static void fizzBuzz(){
        // if a number divisible by 5 : then Fizz
        // if a number divisible by 3 : then Buzz
        // if a number divisible by 3 and 5 both : then FizzBuzz
        // if a number not divisible by any of the above ways then print the same number.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        String word = "Fizz";
        if (number % 3 == 0 && number % 5 == 0)
            word = "FizzBuzz";
        else if (number % 3 == 0)
            word = "Buzz";
        else if (number % 5 == 0)
            word = "Fizz";
        else
            word = String.valueOf(number);
        System.out.println(word);
    }

}
