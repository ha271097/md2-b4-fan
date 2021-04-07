package com.company;

public class mainFan {
    public static void main(String[] args) {
        fan quat1 = new fan();
        quat1.setOn(true);
        quat1.setSpeed(3);
        quat1.setColor("yellow");
        quat1.setRadius(10);
        System.out.println("quat 1: ");
        quat1.toString(true);

        fan quat2 = new fan();
        quat2.setOn(true);
        quat2.setSpeed(2);
        quat2.setRadius(5);
        quat2.setColor("blue");
        System.out.println("quat 2: ");
        quat2.toString(false);
    }
}
