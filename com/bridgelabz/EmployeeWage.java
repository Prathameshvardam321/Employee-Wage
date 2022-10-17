package com.bridgelabz;


public class EmployeeWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    private int EMP_WAGE_PER_HOUR ;
    private int FULL_TIME_HOUR ;
    private int PART_TIME_HOUR ;
    private int WORKING_DAYS_PER_MONTH ;

    private int TOTAL_EMPLOYEE_WAGE ;



    public EmployeeWage() {
    }

    public EmployeeWage(int EMP_WAGE_PER_HOUR, int FULL_TIME_HOUR, int PART_TIME_HOUR, int WORKING_DAYS_PER_MONTH) {
        this.EMP_WAGE_PER_HOUR = EMP_WAGE_PER_HOUR;
        this.FULL_TIME_HOUR = FULL_TIME_HOUR;
        this.PART_TIME_HOUR = PART_TIME_HOUR;
        this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
    }

    public void calculateEmployeeWage() {

        int empHours = 0 ;
        int day = 1;
        int totalWage = 0;
        while (day < WORKING_DAYS_PER_MONTH && empHours <= 100) {
            int dailyWage = 0;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeCheck);
            switch (employeeCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is present");
                    dailyWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empHours += FULL_TIME_HOUR ;

                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is present");
                    dailyWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                    empHours += PART_TIME_HOUR ;

                    break;
                default:
                    System.out.println("Employee is absent");
            }
            day++;
            totalWage += dailyWage ;
            System.out.println("Total employee hours are " + empHours);
            System.out.println("Total wage for " + day + " day is " + totalWage);
        }
        TOTAL_EMPLOYEE_WAGE = totalWage;

    }

    @Override
    public String toString() {
        return "total employee wage = " + TOTAL_EMPLOYEE_WAGE ;
    }

    public static void main(String[] args) {
        EmployeeWage perfios  = new EmployeeWage(35,8,5,23);
        perfios.calculateEmployeeWage();
        System.out.println("Perfios " + perfios.toString());
        EmployeeWage reliance = new EmployeeWage(30,14,7,24);
        reliance.calculateEmployeeWage();
        System.out.println("Reliance " + reliance.toString());

    }
}