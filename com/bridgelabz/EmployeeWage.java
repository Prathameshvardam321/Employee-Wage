package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWage  {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    private int empWagePerHour ;
    private int fullTimeHour ;
    private int partTimeHour ;
    private String companyName;
    private int workingDaysPerMonth ;
    private static int totalEmployeeWage ;
    public EmployeeWage() {
    }
    public EmployeeWage(String companyName,int EMP_WAGE_PER_HOUR, int FULL_TIME_HOUR, int PART_TIME_HOUR, int WORKING_DAYS_PER_MONTH) {
        this.companyName=companyName;
        this.empWagePerHour = EMP_WAGE_PER_HOUR;
        this.fullTimeHour = FULL_TIME_HOUR;
        this.partTimeHour = PART_TIME_HOUR;
        this.workingDaysPerMonth = WORKING_DAYS_PER_MONTH;
        computeWage();
    }

    public void computeWage() {
        int empHours = 0 ;
        int day = 1;
        int totalWage = 0;
        while (day <= workingDaysPerMonth && empHours <= 100) {
            int dailyWage = 0;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (employeeCheck) {
                case IS_FULL_TIME:

                    dailyWage = empWagePerHour* fullTimeHour;
                    empHours += fullTimeHour ;
                    break;
                case IS_PART_TIME:

                    dailyWage = empWagePerHour * partTimeHour;
                    empHours += partTimeHour ;

                    break;
                default:

            }


            day++;
            totalWage += dailyWage ;
        }
        totalEmployeeWage = totalWage;

    }
    public static int totalEmployeeWage(){
        return totalEmployeeWage;
    }
    public static void main(String[] args) {
    EmployeeWage employeeWage = new EmployeeWage("Amj",25,14,7,24);
    System.out.println(employeeWage.companyName+" total wage id : "+totalEmployeeWage());
    }
}