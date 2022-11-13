package com.example.programmer_life;

import java.util.Scanner;

public class Main {

    private static String checker() {
        Scanner jobCheck = new Scanner(System.in);
        System.out.print("Have u got a job? Type Y/N: ");
        String have_job = jobCheck.nextLine();

        if (have_job.equals("Y") || have_job.equals("y") || have_job.equals("Yes") || have_job.equals("yes") || have_job.equals("YES")) {
            Scanner carCheck = new Scanner(System.in);
            System.out.print("Have u got a car? Type Y/N: ");
            String have_car = carCheck.nextLine();
            if (have_car.equals("Y") || have_car.equals("y") || have_car.equals("Yes") || have_car.equals("yes") || have_car.equals("YES")) {
                return "job_car";
            } else {
                return "job_without_car";
            }
        } else {
            return  "without_job";
        }
    }

    private static String takeName(){
        Scanner inputName = new Scanner(System.in);
        System.out.print("Type your name: ");
        String userName = inputName.nextLine();
        System.out.println("Name: " + userName);
        return userName;
    }
    private static int takeAge(){
        Scanner inputAge = new Scanner(System.in);
        System.out.print("Type your age: ");
        int userAge = inputAge.nextInt();
        if (userAge > 13 && userAge < 122) {
            System.out.println("Age: " + userAge);
        }
        else {
            System.out.println("Type your actuality age: ");
            takeAge();
        }

        return userAge;
    }
    private static String takeHome(){
        Scanner inputHome = new Scanner(System.in);
        System.out.print("Shot information about your home: ");
        String userHome = inputHome.nextLine();
        System.out.println("Home: " + userHome);
        return userHome;
    }
    private static int takeJob(){
        Scanner inputJob = new Scanner(System.in);
        System.out.print("Type number 0-5: ");
        int userJob = inputJob.nextInt();
        System.out.println("Job: " + userJob);
        return userJob;
    }

    private static int takeCar(){
        Scanner inputCar = new Scanner(System.in);
        System.out.print("Type number 0-4: ");
        int userCar = inputCar.nextInt();
        System.out.println("Car: " + userCar);
        return userCar;
    }



    public static void main (String[] arg){
        String check = checker();
        if (check.equals("without_job")){
            Human user = new Human(takeName(), takeAge(), takeHome());
            user.human_say();
        }
        else if (check.equals("job_car")){
            AutoOwner user = new AutoOwner(takeName(), takeAge(), takeHome(), takeJob(), takeCar());
            user.auto_owner_say();
        }
        else {
            Employee user = new Employee(takeName(), takeAge(), takeHome(), takeJob());
            user.employee_say();
        }

//        //// ===> Metod 1 <=== ////
//        AutoOwner vlad = new AutoOwner();
//        vlad.name = "Vlad";
//        vlad.age = 15;
//        vlad.home = "Parent's home";
//        vlad.job = 4;
//        vlad.car = 4;
//        vlad.auto_owner_say();
//
//        //// ===> Method 2 <=== ////
//        AutoOwner dima = new AutoOwner("Dima", 95, "His next home - your home =)", 0, 0);
//        dima.auto_owner_say();
//
//        //// ===> Method 3 <=== ////
//        Human vitalik = new Human("Vitalik", 14);
//        vitalik.human_say();
//
//        //// ===> Method 4 <=== ////
//        Human roman = new Human("Roman", 17);
//        roman.human_say();
//
//        //// ===> Method 5 <=== ////
//        Human loh = new Human();
//        loh.human_say();
    }
}
