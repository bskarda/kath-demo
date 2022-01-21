package com.company;

import java.util.ArrayList;
import java.util.List;

public class OurTestClass {

    public static void main(String[] args) {
        int result = subtract(7, 5);
        System.out.println("result = " + result);

        Car slow = new Car("Brown 🚖", 15);
        Car fast = new Car("Red 🏎", 90);
        Car normal = new Car("White 🚓", 60);

        List<Car> cars = new ArrayList<>();
        cars.add(slow);
        cars.add(fast);
        cars.add(normal);

        int speedLimit = 60;

        for (int i = 0; i < cars.size(); i++) {
            Car currentCar = cars.get(i);
            System.out.println("Current car = " + currentCar);
            if (currentCar.isSpeeding(speedLimit)) {
                System.out.println("🚨🚔");
            } else {
                System.out.println("Nothing to see here");
            }
        }
    }




    // com.company.Main#subtract(int, int): int
    static int subtract(int first, int second) {
        return first - second;
    }
}
