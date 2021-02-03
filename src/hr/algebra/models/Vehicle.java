package hr.algebra.models;

public class Vehicle implements Chargable{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGasTankLevel() {
        return gasTankLevel;
    }

    public void setGasTankLevel(double gasTankLevel) {
        this.gasTankLevel = gasTankLevel;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    String name;
    double gasTankLevel;
    double batteryLevel;

    public Vehicle(int id, double gasTankLevel, double batteryLevel, String name) {
        this.id = id;
        this.gasTankLevel = gasTankLevel;
        this.batteryLevel = batteryLevel;
        this.name = name;
    }


    @Override
    public Double charge() {
        return null;
    }
}
