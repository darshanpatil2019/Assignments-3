package com.bridgelabz.EmpWage;

public class PartTimeEmpWage {

    private static int IS_PART_TIME = 1;
    private static int IS_FULL_TIME = 2;
    private static int WAGE_PER_HOUR = 20;
    private static int FULL_TIME_HOURS = 8;
    private static int PART_TIME_HOURS = 4;

    public static void main(String[] args) {
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        int empWage = 0;
        int empHrs = 4;

        if (empCheck == IS_PART_TIME) {
            empHrs = 4;
            System.out.println("Employee is Present for Part Time");
        } else if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee is Present for Full Time");
        } else {
            empHrs = 0;
            System.out.println("Employee is Absent");
        }

        empWage = WAGE_PER_HOUR * empHrs;
        System.out.println("Employee Wage:" + empWage);
    }

}
