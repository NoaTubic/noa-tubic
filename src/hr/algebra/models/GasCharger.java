package hr.algebra.models;

public class GasCharger extends Employee implements Charger{
    public GasCharger(int id, String name, String surname) {
        super(id, name, surname);
    }

    @Override
    public void chargeVehicle(Vehicle vehicle) {
        if (vehicle.gasTankLevel < 0.10)
        {System.out.println("Charging gas.");}
        else{
            System.out.println("Fuel level ok.");
        }

    }

    @Override
    public double getPayment(Vehicle vehicle) {
            return vehicle.charge() * 0.10;

    }
}
