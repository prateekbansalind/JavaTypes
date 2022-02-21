package com.pbansal;

public class ArithmeticOperations {
    public static void arithmeticOperationsDemo(){

        // add
        int add = 2 + 2;
        System.out.println(add);

        // subtract
        int subtract = 2 - 2;
        System.out.println(subtract);

        // divide
        int div = 10/3; // output : 3 which is not correct.
        System.out.println(div);

        double div1 = (double) 10 / (double) 3;
        System.out.println(div1);

        // increment and decrement
        // x++ : ++ after x considered as postfix
        // ++x : ++ before x considered as prefix

        // case: postfix
        int x = 1;
        int y = x++;

        // output: x = 2 , y = 1
        System.out.println(x);
        System.out.println(y);

        // case: prefix
        x = 1;
        y = ++x;
        System.out.println(x);
        System.out.println(y);

        // to increase x by 2
        x = 1;
        // x = x + 2;
        x += 2; // augmented or compound assignment operator
        System.out.println(x);



    }
}
