package com.bridgelabz.LineComparison;

import java.util.Scanner;

public class UC1 {
    public static void main(String[] args) {
        // Creating an object for Scanner class
        Scanner sc = new Scanner(System.in);
        /* As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system,
        So that I can calculate its length. A Length as 2 Points (x1, y1) and (x2, y2) & Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)*/
        System.out.println("Enter the values for x1,y1,x2,y2");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2));
    }
}

