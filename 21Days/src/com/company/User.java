package com.company;

public class User {
    private String firstName;
    private String lastName;


    public String output(boolean nice){
        return"yoU SUCK " + getFullName()  + ".";
    }
    public String getFirstName(){
        return firstName.toUpperCase();
    }
    public void setFirstName(String fn){
        firstName = fn;
    }
    public String getLastName(){
        return firstName.toUpperCase();
    }
    public void setLastName(String fn){
        firstName = fn;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
}