package hr.algebra.models;

public class Car extends Vehicle implements Chargable{


    public Car(int id, double gasTankLevel, double batteryLevel, String name) {
        super(id, gasTankLevel, batteryLevel, name);
    }

    @Override
    public Double charge() {
        return 50.00;
    }
}
