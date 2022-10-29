package com.bridgelabz.EmpWage;

public class EmpWageLoop {
    // fixed constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS_PER_MONTH = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        // Variables for initializing
        int empHrs = 0;
        int empWage = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        // Computing the daily wages
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= MAX_WORKING_DAYS_PER_MONTH) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            empWage = empHrs * WAGE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee wage:" + empWage);
        }
        System.out.println("Total Employee wage is:" + totalEmpWage);
    }
}
