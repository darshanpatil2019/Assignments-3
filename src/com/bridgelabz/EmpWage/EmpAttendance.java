package com.bridgelabz.EmpWage;

public class EmpAttendance {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculation Program");

        int IS_PRESENT = 1;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2; // 0.0 to 1.0

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

