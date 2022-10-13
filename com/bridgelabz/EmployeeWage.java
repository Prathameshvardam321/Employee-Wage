package com.bridgelabz;


    public class EmployeeWage {

        static final int DAILY_TIME_HOUR = 8;
        static final int EMP_WAGE_PER_HOUR = 20;
        static int FULL_TIME_HOUR = 8;
        static int PART_TIME_HOUR = 4;
        public static void computeEmployeeWage(){
            int totalDays = 20;
            int totalWage = 0;
            int totalHours = 0;
            int day = 1;

            while (totalHours <= 100 && day <= totalDays) {
                int employeeCheck = (int) Math.floor(Math.random() * 3);
                System.out.println(employeeCheck);
                int dailyWage = 0;
                switch (employeeCheck) {
                    case 2:
                        System.out.println("Employee is Full time.");
                        dailyWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                        totalHours+=FULL_TIME_HOUR;
                        break;
                    case 1:
                        System.out.println("Employee is Part time.");
                        dailyWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                        totalHours+=PART_TIME_HOUR;
                        break;
                    default:
                        System.out.println("Employee is absent");


                }
                day++;
                totalWage = totalWage + dailyWage;
                System.out.println("Daily wage is " + dailyWage+ " for day "+day);
            }
            System.out.println("Total working hours : "+totalHours);
            System.out.println("Total wage is : " + totalWage);
        }

        public static void main(String[] args) {
           computeEmployeeWage();
        }
        }




