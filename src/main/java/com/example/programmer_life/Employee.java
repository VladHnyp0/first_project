package com.example.programmer_life;

public class Employee extends Human{
    int job = 0;

    public Employee() {}

    public Employee(String name, int age, String home, int job) {
        super(name, age, home);
        this.job = job;
    }

    public String choice_job() {
        String[] job = new String[6];
        job[0] = "BOMJ developer: \nsalary: -10 \ngladness_less: -20 \n";
        job[1] = "Python developer: \nsalary: 400  \ngladness_less: 3 \n";
        job[2] = "Rust developer: \nsalary: 700  \ngladness_less: 1 \n";
        job[3] = "C++ developer: \nsalary: 450 \ngladness_less: 25 \n";
        job[4] = "Java developer: \nsalary: 500 \ngladness_less: 10 \n";
        job[5] = "Assembl(ASM) developer: \nsalary 999999 \ngladness_less 999999\n";

        return job[this.job];
    }

    public void employee_say() {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nHome: " + home + "\n-------------------" +"\nJob of " + name + " is: " + choice_job());

    }
    public void get_job(){
        System.out.println("Your Job is: " + choice_job());
    }
}