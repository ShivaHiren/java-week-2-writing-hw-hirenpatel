package javaweek2writinghwhirenpatel;
/*write a program to enter any radius of the circle and find out the area.(Formula of Area A=PI*r*r).*/

import java.util.Scanner;

public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declaration for reading the input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius:  ");
        double radius = scanner.nextDouble();
        AreaOfCircle(radius);
        //closing the scanner onject
        scanner.close();

    }

    //Calculating the area of circle
    public static void AreaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of circle is : " + area);
    }
}
