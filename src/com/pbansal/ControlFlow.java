package com.pbansal;

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
}
