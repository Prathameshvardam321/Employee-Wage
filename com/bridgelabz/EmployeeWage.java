package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWage  {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    private int EMP_WAGE_PER_HOUR ;
    private int FULL_TIME_HOUR ;
    private int PART_TIME_HOUR ;
    private int WORKING_DAYS_PER_MONTH ;
    private int TOTAL_EMPLOYEE_WAGE ;
    public EmployeeWage() {
    }
    public EmployeeWage(String companyName,int EMP_WAGE_PER_HOUR, int FULL_TIME_HOUR, int PART_TIME_HOUR, int WORKING_DAYS_PER_MONTH) {
        this.EMP_WAGE_PER_HOUR = EMP_WAGE_PER_HOUR;
        this.FULL_TIME_HOUR = FULL_TIME_HOUR;
        this.PART_TIME_HOUR = PART_TIME_HOUR;
        this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
    }

    public void computeWage() {
        int empHours = 0 ;
        int day = 1;
        int totalWage = 0;
        while (day <= WORKING_DAYS_PER_MONTH && empHours <= 100) {
            int dailyWage = 0;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeCheck);
            switch (employeeCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is present full time.");
                    dailyWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empHours += FULL_TIME_HOUR ;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is part full time.");
                    dailyWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                    empHours += PART_TIME_HOUR ;

                    break;
                default:
                    System.out.println("Employee is absent.");
            }

            System.out.println("Daily wage is : "+dailyWage+" for day "+day);
            day++;
            totalWage += dailyWage ;
        }
        TOTAL_EMPLOYEE_WAGE = totalWage;
        System.out.println("total employee wage is = " + TOTAL_EMPLOYEE_WAGE );
    }
    public static void main(String[] args) {

        ArrayList<EmployeeWage> employeeWageArrayList = new ArrayList<>();
        employeeWageArrayList.add(new EmployeeWage("Perfios",12,12,123,32));
        employeeWageArrayList.add(new EmployeeWage("Turtlemint",12,12,123,32));
    }
}