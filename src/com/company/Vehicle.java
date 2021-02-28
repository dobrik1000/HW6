package com.company;

public abstract class Vehicle {
    protected int wheelCount;

    public Vehicle(int wheelCount){
        this.wheelCount = wheelCount;
    }

    protected abstract void printinfo();

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}
