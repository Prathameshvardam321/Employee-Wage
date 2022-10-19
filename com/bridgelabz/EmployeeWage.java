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
            switch (employeeCheck) {
                case IS_FULL_TIME:
                    dailyWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empHours += FULL_TIME_HOUR ;
                    break;
                case IS_PART_TIME:
                    dailyWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                    empHours += PART_TIME_HOUR ;

                    break;
                default:
            }
            day++;
            totalWage += dailyWage ;
        }
        TOTAL_EMPLOYEE_WAGE = totalWage;

    }

    @Override
    public String toString() {
        return "total employee wage is = " + TOTAL_EMPLOYEE_WAGE ;
    }

    public static void main(String[] args) {
        EmployeeWage[] employeeWages = new EmployeeWage[3];
        EmployeeWage wipro = new EmployeeWage(15,12,7,24);
        EmployeeWage tcs = new EmployeeWage(20,13,7,22);
        EmployeeWage google = new EmployeeWage(30,11,6,20);
        employeeWages[0] = wipro;
        employeeWages[1] = tcs;
        employeeWages[2] = google;
        employeeWages[0].calculateEmployeeWage();
        employeeWages[1].calculateEmployeeWage();
        employeeWages[2].calculateEmployeeWage();
        for (int i =0;i<employeeWages.length;i++){
            System.out.println(employeeWages[i]);
        }
    }

}