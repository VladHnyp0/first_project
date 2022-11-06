package com.example.programmer_life;

public class Main {
    public static void main (String[] arg){
        //// ===> Metod 1 <=== ////
        AutoOwner vlad = new AutoOwner();
        vlad.name = "Vlad";
        vlad.age = 15;
        vlad.home = "Parent's home";
        vlad.job = 4;
        vlad.car = 4;
        vlad.auto_owner_say();

        //// ===> Method 2 <=== ////
        AutoOwner dima = new AutoOwner("Dima", 95, "His next home - your home =)", 0, 0);
        dima.auto_owner_say();

        //// ===> Method 3 <=== ////
        Human vitalik = new Human("Vitalik", 14);
        vitalik.human_say();

        //// ===> Method 4 <=== ////
        Human roman = new Human("Roman", 17);
        roman.human_say();

        //// ===> Method 5 <=== ////
        Human loh = new Human();
        loh.human_say();
    }
}
