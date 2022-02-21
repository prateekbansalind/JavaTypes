package com.pbansal;


import java.util.Locale;

public class StringDemo {

    public static void stringDemo(){
        // String is a reference type
        //String message = new String("Hello World");
        String message = "Hello World";
        System.out.println(message);

        message = "Hello World" + "!!";
        System.out.println(message);

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf('W'));
        System.out.println(message.replace('!', '*'));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        message = "     Hello" + " World!!  ";
        System.out.println(message.trim());

        // escape sequences
        message = "Hello \"Prateek\"";
        System.out.println(message);

        message = "c:\\windows\\user";
        System.out.println(message);

        // to imsert a new line  - use \n
        message = "Hello, \nHow are you?";
        System.out.println(message);

        // to have tab - \t
        message = "c:\t\\windows";
        System.out.println(message);


    }
}
