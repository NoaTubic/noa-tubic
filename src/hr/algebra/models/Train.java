package hr.algebra.models;

import java.util.ArrayList;
import java.util.List;

public class Train{

    private int id;

    public Train(int id) {
        this.id = id;
    }

    public double calculateProfitPerTrain(List<Vehicle> vehicles)
    {
        double earned = 0;
        for (Vehicle v: vehicles)
        {

            earned+=v.charge();
        }

        return earned;
    }



}
