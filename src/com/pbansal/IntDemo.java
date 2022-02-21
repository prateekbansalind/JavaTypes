package com.pbansal;

import java.awt.*;
public class IntDemo {
    public static void intDemo(){
      // Primitive Type
        byte x = 1;
        byte y = x;
        System.out.println(x);
        System.out.println(y);
        x = 2;
        System.out.println(x);
        System.out.println(y);


        // Reference Type
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println(point1);
        System.out.println(point2);
        point1.x = 2;
        point1.y = 2;
        System.out.println(point1);
        System.out.println(point2);
    }
}
