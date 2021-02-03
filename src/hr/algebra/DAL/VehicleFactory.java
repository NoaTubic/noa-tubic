package hr.algebra.DAL;

import hr.algebra.models.*;

public class VehicleFactory {


    public static Vehicle createVehicle(String vehicleType, int id, Double gasLevel, Double batteryLever, String name){
        switch (vehicleType) {
            case "Car":
                return new Car(id,gasLevel,batteryLever, name);
            case "Van":
                return new Van(id,gasLevel,batteryLever, name);
            case "Bus":
                return new Bus(id,gasLevel,batteryLever, name);
            case "Truck":
                return new Truck(id,gasLevel,batteryLever, name);
            default:
                return null;
        }


    }
}
