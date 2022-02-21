package com.pbansal;

public class ConstantDemo {
    public static void constantDemo(){
        // to declare constant in java
        float pi = 3.14F;
        System.out.println(pi);  // not the proper way of initiating and declaring constant values

        // the above code is correct no doubt with it.
        // what if someone changes the value of pi to something else.
        // In order to restrict this, we need to make this variable locked after its initial declaration.
        // In java, we use a keyword called final to make a variable declare as constant.
        // Also, in Java the constant variable declared in uppercase.

        final float PI = 3.14F;
        // PI = 5.64F;              // this cannot be done as the PI is declared with the final keyword.
        System.out.println(PI);
    }
}
