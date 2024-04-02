package org.launchcode;
import java.util.Scanner;
public class Miles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of miles driven: ");
        double milesDriven = scanner.nextDouble();

        System.out.print("Enter the amount of gas consumed (in gallons): ");
        double gasConsumed = scanner.nextDouble();

        double milesPerGallon = milesDriven / gasConsumed;
        System.out.println("Your miles-per-gallon is: " + milesPerGallon);
        scanner.close();
    }
}
