package com.pbansal;

public class CastingDemo {
    public static void castingDemo(){
        // implicit casting : it will happen when no data is going to lose.
        // byte > short > int > long > float > double
        short x = 1; // short has 2 byte of memory
        int y = x + 2; // int has 4 byte of memory
        // in the background, when we compile the code.
        // Java will see the value of x and then initiate and allocate another anonymous variable
        // which will have an int data type and then copied the value from the short variable to the
        // anonymous int variable.
        // which can be used later on.
        System.out.println(y);

        double m = 1.1;
        double n = m + 2; // 2 > 2.0
        System.out.println(n);

        // explicit casting
        double k = 2.2;
        int l = (int)k + 2; // (int)2.2 > 2
        System.out.println(l);

        // explicit casting can only be possible between compatible types
        // like this, byte > short > int > long > float > double
        // all the above data type are basically numbers.
        // explicit casting cannot be done if you are changing string into numbers.

        String q = "1";
        // int w = q + 2;
        // String q cannot be converted into int as they are not compatible data types.
        // So in order to convert string into int, in java for a primitive data type.
        // there is a wrapper class can be called and its method "parseDataType" can be used.
        int w = Integer.parseInt(q) + 2; // Integer.parseInt(q) = 1
        System.out.println(w); // output : 3
    }
}
