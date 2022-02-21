package com.pbansal;

public class MathClassDemo {
    public static void mathDemo(){
        // round a number
        int number = Math.round(1.1F);
        System.out.println(number);

        // Ceil a number
        int ceilNumber = (int) Math.ceil(1.1F); // ceil output = 2
        System.out.println(ceilNumber);

        // floor a number
        int floorNumber = (int)Math.floor(1.1F);
        System.out.println(floorNumber);

        int maxNumber = Math.max(2, 3);
        System.out.println(maxNumber);
        int minNumber = Math.min(2, 3);
        System.out.println(minNumber);

        double randomNumber = Math.random();
        System.out.println(randomNumber); // output : 0.XXXXXXXX
        System.out.println(randomNumber*100); // output : XX.XXXXXXXX
        System.out.println(Math.round(randomNumber*100)); // output : XX  // 1st way
        System.out.println((int)(randomNumber*100)); // output : XX // 2nd way



    }
}
