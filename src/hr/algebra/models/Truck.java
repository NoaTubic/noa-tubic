package hr.algebra.models;

public class Truck extends Vehicle implements Chargable {


    public Truck(int id, double gasTankLevel, double batteryLevel, String name) {
        super(id, gasTankLevel, batteryLevel, name);
    }

    @Override
    public Double charge() {
        return 90.00;
    }
}
