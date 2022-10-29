package com.bridgelabz.EmpWage;

public class switchCase {
    //  constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        // variables to Calculate Wages of Employee
        int empWage = 0;
        int empHrs = 0;

        //computation using random function
        double empCheck = Math.floor(Math.random() * 10) % 3;

        switch ((int) empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Employee is Present for Part Time");
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Employee is Present for Full Time");
                break;
            default:
                empHrs = 0;
                System.out.println("Employee is Absent for the day");
                break;
        }
        // to calculate employee wages for the parttime or fulltime employee
        empWage = WAGE_PER_HOUR * empHrs;
        System.out.println("Employee wage is:" + empWage);

    }
}

