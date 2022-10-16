package com.bridgelabz;


    public class EmployeeWage {
        public static void employeeWageBuilder(String companyName,int fullTimeHour,int wagePerHour,int totalDays){
            int day = 1;
            int partTimeHour=1/2*fullTimeHour;
            int totalWage=0;
            int totalHours=0;
            while (totalHours <= 100 && day <= totalDays) {
                    int employeeCheck = (int) Math.floor(Math.random() * 3);
                    System.out.println(employeeCheck);
                    int dailyWage = 0;
                    switch (employeeCheck) {
                    case 2:
                    System.out.println("Employee is Full time.");
                  dailyWage = wagePerHour*fullTimeHour;
                    totalHours+=fullTimeHour;
                    break;
                    case 1:
                    System.out.println("Employee is Part time.");
                   dailyWage = wagePerHour*partTimeHour;
                    totalHours+=partTimeHour;
                    break;
                   default:
        System.out.println("Employee is absent");
                    }
        totalWage = totalWage + dailyWage;
        System.out.println("Daily wage is for "+ companyName+" is "+ dailyWage+ " for day "+day);
                day++;
        }
        System.out.println("Total working hours for "+companyName+" is : "+totalHours);
        System.out.println("Total wage for "+companyName+ " is : " + totalWage);
        System.out.println("-------------------------------------------------------------");

        }

        public static void main(String[] args) {
          employeeWageBuilder("Mahendra",12,20,22);
          employeeWageBuilder("Reliance",14,24,20);
        }
        }


