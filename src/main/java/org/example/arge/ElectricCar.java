package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private int batterySize;
    private double avgKmPerCharge;

    public ElectricCar(String name, String description, int batterySize, double avgKmPerCharge) {
        super(name, description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }
}
