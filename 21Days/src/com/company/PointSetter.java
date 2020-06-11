package com.company;

import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(4, 13);

        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);

        System.out.println("\nMoving to (7,6)");
        location.x = 7;
        location.y = 6;

        System.out.println("\nEnd Location: ");
        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);
    }
}
                