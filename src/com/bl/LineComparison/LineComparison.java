package com.bl.LineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation");
        double line1;
        System.out.println("Enter the Line");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x1 axis");
        int x1 = scan.nextInt();
        System.out.println("enter x2 axis");
        int x2 = scan.nextInt();
        System.out.println("enter y1 axis");
        int y1 = scan.nextInt();
        System.out.println("enter y2 axis");
        int y2 = scan.nextInt();

        line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("The length of line" + line1);

    }
}