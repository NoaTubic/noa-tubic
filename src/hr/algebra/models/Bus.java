package hr.algebra.models;

public class Bus extends Vehicle implements Chargable{

    public Bus(int id, double gasTankLevel, double batteryLevel, String name) {
        super(id, gasTankLevel, batteryLevel, name);
    }

    @Override
    public Double charge() {
        return 70.00;
    }
}
