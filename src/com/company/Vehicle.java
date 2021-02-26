package com.company;

public abstract class Vehicle {
    protected int wheelCount;

    public Vehicle(int wheelCount){
        this.wheelCount = wheelCount;
    }

    protected void printinfo() {
        System.out.println("Вот оно, средство передвижения: " + wheelCount);
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}
