package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(SpeedConverter.toMilesPerHour(1.5));
        System.out.println(SpeedConverter.toMilesPerHour(10.25));
        System.out.println(SpeedConverter.toMilesPerHour(-5.6));
        System.out.println(SpeedConverter.toMilesPerHour(25.42));
        System.out.println(SpeedConverter.toMilesPerHour(75.114));
        SpeedConverter.printConversion(75.144);
    }
}
