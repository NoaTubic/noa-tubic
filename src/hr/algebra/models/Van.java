package hr.algebra.models;

public class Van extends Vehicle implements Chargable {


    public Van(int id, double gasTankLevel, double batteryLevel, String name) {
        super(id, gasTankLevel, batteryLevel, name);
    }

    @Override
    public Double charge() {
        return 80.00;
    }
}
