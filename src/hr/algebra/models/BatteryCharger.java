package hr.algebra.models;

public class BatteryCharger extends Employee implements Charger {
    public BatteryCharger(int id, String name, String surname) {
        super(id, name, surname);
    }

    @Override
    public void chargeVehicle(Vehicle vehicle) {
        if (vehicle.gasTankLevel < 0.10)
        {System.out.println("Charging battery.");}
        else{
            System.out.println("Battery level ok.");
        }

    }

    @Override
    public double getPayment(Vehicle vehicle) {

            return vehicle.charge() * 0.11;

    }
}
