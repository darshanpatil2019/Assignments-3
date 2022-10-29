package com.bridgelabz.EmpWage;

public class EmpWageforMonth {

    // fixed Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAXIMUM_WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        // variables for Initializing
        int empWage = 0;
        int empHrs = 0;
        int totalEmpWage = 0;
        //Computating
        for (int day = 0; day <= MAXIMUM_WORKING_DAYS_PER_MONTH; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            // calculate employee wages for the present employee either part time or full time
            empWage = empHrs * WAGE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee wage:" + empWage);
        }
        // To Display Total Employee wage for the month
        System.out.println("Total Employee wage:" + totalEmpWage);

    }
}
