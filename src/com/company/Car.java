package com.company;

public class Car extends Vehicle implements Costable{
    public Car(int wheelCount) {
        super(wheelCount);
    }

    private int doorsCount;

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    public void printinfo() {
        System.out.println("Транспортное средство: Машина - Количество дверей: " + doorsCount + " - Количество колес: " + wheelCount + " - Стоимость этой модели: " + getCost() + " $");
    }

    @Override
    public int getCost() {
        return (wheelCount + doorsCount) * 2500;
    }


}
