package hr.algebra;

import hr.algebra.DAL.VehicleFactory;
import hr.algebra.models.*;

import java.util.ArrayList;
import java.util.List;

public class Solid {

    public static void main(String[] args) {

        BigTrain bt1 =  new BigTrain(1);
        SmallTrain st1 = new SmallTrain(2);

        List<Vehicle> smallVehicles = new ArrayList<>(st1.capicity());



        smallVehicles.add(VehicleFactory.createVehicle("Car",1, 0.5, 0.2, "Car1"));
        smallVehicles.add(VehicleFactory.createVehicle("Car",2, 0.05, 0.0, "Car2"));
        smallVehicles.add(VehicleFactory.createVehicle("Car",3, 0.2, 0.01, "Car3"));
        smallVehicles.add(VehicleFactory.createVehicle("Car",4, 0.05, 0.0, "Car4"));


        smallVehicles.add(VehicleFactory.createVehicle("Van",1, 0.5, 0.9, "Van1"));
        smallVehicles.add(VehicleFactory.createVehicle("Van",2, 0.05, 1.0, "Van2"));
        smallVehicles.add(VehicleFactory.createVehicle("Van",3, 0.2, 0.7, "Van3"));
        smallVehicles.add(VehicleFactory.createVehicle("Van",4, 0.05, 1.0, "Van4"));


        List<Vehicle> bigVehicles = new ArrayList<>(bt1.capicity());

        bigVehicles.add(VehicleFactory.createVehicle("Bus",1, 0.5, 0.7, "Bus1"));
        bigVehicles.add(VehicleFactory.createVehicle("Bus",2, 0.05, 0.01, "Bus2"));
        bigVehicles.add(VehicleFactory.createVehicle("Bus",3, 0.01, 0.05,"Bus3"));

        bigVehicles.add(VehicleFactory.createVehicle("Truck",1, 0.3, 0.09,"Truck1"));
        bigVehicles.add(VehicleFactory.createVehicle("Truck",2, 0.05, 0.7,"Truck2"));
        bigVehicles.add(VehicleFactory.createVehicle("Truck",3, 0.2,0.3 ,"Truck3"));

        GasCharger employee1 = new GasCharger(1,"Milica", "Krmpotic");
        BatteryCharger employee2 = new BatteryCharger(2,"Milutin", "Krmpotic");
        double e1payment = 0;
        double e2payment = 0;


        for (Vehicle v : smallVehicles)
        {
            System.out.println(v.getName() + " - Gas level: " + v.getGasTankLevel() + ", Battery level: " + v.getBatteryLevel());
            employee1.chargeVehicle(v);
            e1payment+=employee1.getPayment(v);
            employee2.chargeVehicle(v);
            e2payment+=employee2.getPayment(v);
        }

        System.out.println("Money earned from tickets = " + (st1.calculateProfitPerTrain(smallVehicles) + bt1.calculateProfitPerTrain(bigVehicles)));
        System.out.println(employee1.toString() + " sallary: " + e1payment);
        System.out.println(employee2.toString() + " sallary: " + e2payment);





    }




}
