package com.bridgelabz.EmpWage;

public class DailyEmpWage {
    // fixed Constants
    public static int IS_PRESENT = 1;
    public static int WAGE_PER_HOUR = 20;
    public static int FULL_TIME_HOURS = 8;

    public static void main(String[] args) {
        int empCheck = (int) Math.floor(Math.random() * 10) % 2; // 0.0 to 1.0
        int empWage = 0;

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
            empWage = WAGE_PER_HOUR * FULL_TIME_HOURS;
            System.out.println("Employee wages:" + empWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

