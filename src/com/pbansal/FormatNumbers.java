package com.pbansal;

import java.text.NumberFormat;

public class FormatNumbers {
    public static void formatNumbers(){
        // Number into currency
        // NumberFormat currency = new NumberFormat(); - NumberFormat is abstract class can not be instantiated.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String cur = currency.format(1234567.891);
        System.out.println(cur);

        // format percentage
        NumberFormat percentage = NumberFormat.getPercentInstance();
        String per = percentage.format(0.16);
        System.out.println(per);

        // Method Chaining
        String price = NumberFormat.getCurrencyInstance().format(820.990);
        System.out.println(price);
    }
}
