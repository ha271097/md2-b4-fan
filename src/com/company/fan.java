package com.company;

public class fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public fan() {
    }
    void setSpeed(int num){
        switch (num){
            case 1:
                this.speed = slow;
                break;
            case 2:
                this.speed = medium;
                break;
            case 3:
                this.speed = fast;
                break;
        }
    }
    public int getSpeed() {
        return speed;
    }
    void setRadius(int radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    void setOn(boolean status){
        this.on = status;
    }
    public boolean getOn(){
        return on;
    }
    public void toString(boolean on){
        if(on == true){
            System.out.println("status: on ");
            System.out.println("speed = " + getSpeed());
            System.out.println("color = " + getColor());
            System.out.println("radius = " + getRadius() + "\n");
        }
        else {
            System.out.println("status: off ");
            System.out.println("color = " + getColor());
            System.out.println("radius = " + getRadius() + "\n");
        }
    }
}
