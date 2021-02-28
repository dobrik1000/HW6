package com.company;

public class Motorcycle extends Vehicle {
        private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    public void printinfo() {
        System.out.println("Транспортное средство: Мотоцикл- Количество колес: " + wheelCount + " - Максимальная скорость: " + maxSpeed + "км/ч");
    }
}
