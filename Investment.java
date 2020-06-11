package com.company;

//Justin Dao
//6/9/20
//Investment 

public class Main {

    public static void main(String[] args) {
        float money = 14000;
        System.out.println("Your starting investment is: $" + money);
        money = money + (money * .4F);
        System.out.println("Your money after a span of 1 year: $" + money);
        money = money - 1500F;
        System.out.println("Your money after a span of 2 years: $" + money);
        money = money + (money * .12F);
        System.out.println("Your money after a span of 3 years: $" + money);
    }
}

