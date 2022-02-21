package com.pbansal;

import java.util.Arrays;

public class ArrayDemo {
    public static void arrayDemo(){
        int[] numbers = new int[5]; // this is an old way of initiating the arrays.
        numbers[0] = 1;
        numbers[1] = 2;
        // numbers[10] = 11; // This line will create a error as the array is of length 5.
        // System.out.println(numbers[10]);
        System.out.println(numbers); // output : [I@49e4cb85
        // By default, when we print java array, we get a string based on the address of that object in a memory.

        // below line shows that, the java has a class called Arrays which helps us to print the members of array object.
        Arrays.toString(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]

        // below declaration is useful we you know the size and value of the array item.
        int[] ages = {30, 30, 45, 60, 45};
        System.out.println(Arrays.toString(ages)); // output : [30, 30, 45, 60, 45]
        System.out.println(ages.length); // output : 5

        Arrays.sort(ages); // sort out the ages
        System.out.println(Arrays.toString(ages));
        // In java, once declared, arrays has a fixed length, it means we cannot delete or add elements.
    }

    public static void multiArrayDemo(){
        // initiate object to store multi dimensional array.
        // one way
        int[][] array_2d = new int[2][3]; // 2 x 3 array
        array_2d[0][0] = 1;
        System.out.println(array_2d); // output : [[I@49e4cb85
        // we cannot directly call array to print, we need to use a class called Arrays
        System.out.println(Arrays.toString(array_2d)); // output : [[I@2133c8f8, [I@43a25848]
        // for multi dimensional array we need to use a method called deepToString of Arrays class.
        System.out.println(Arrays.deepToString(array_2d)); // output : [[1, 0, 0], [0, 0, 0]]

        // another way with curly braces
        int[][] array_2D = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(array_2D));

    }
}
