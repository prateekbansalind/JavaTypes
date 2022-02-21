package com.pbansal;

import java.util.Scanner;

public class ReadInput {
    public static void readInput(){
        // Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim();
        System.out.println("Your full name is " + fullName + ".");

        System.out.print("Enter your age: ");
        Byte age = scanner.nextByte();
        System.out.println("Your age is " + age + ".");

        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Your name is: " + name + ".");



    }
}
