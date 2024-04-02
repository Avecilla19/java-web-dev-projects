package org.launchcode;

import java.util.Scanner;
import circle.Circle;
public class Area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        double radius = scanner.nextDouble();

        double area = Circle.getArea(radius);
       // double area = Math.PI * radius * radius;

        System.out.println("The area of the circle with your radius " + radius + "is: " + area);
        scanner.close();

    }
}
