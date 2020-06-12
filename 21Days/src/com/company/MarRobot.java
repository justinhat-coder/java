package com.company;

public class MarRobot {
    String status;
    int speed;
    float temperature;

    MarRobot(String inStatus, int inSpeed, float inTemperature) {
        status = inStatus;
        speed = inSpeed;
        temperature = inTemperature;
    }

    void checkTemperature() {
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

    public static void main(String[] arguments) {
        MarRobot spirit = new MarRobot("exploring", 2, -80);
        spirit.showAttributes();
        System.out.println("Speed increase to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Temperature change to -100.");
        spirit.temperature = -100;
        spirit.showAttributes();
        System.out.println("Temperature check.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
