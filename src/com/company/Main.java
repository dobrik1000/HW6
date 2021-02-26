package com.company;

public class Main {

    public static void main(String[] args) {
	Car mazeratti = new Car(4, 5);
	Car mersedes = new Car(4, 3);

	mazeratti.printinfo();
	mersedes.printinfo();

	System.out.println();

	Motorcycle java = new Motorcycle(2, 120);
	Motorcycle minsk = new Motorcycle(2, 32);

	java.printinfo();
	minsk.printinfo();
    }
}
