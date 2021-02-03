package hr.algebra.models;

import java.util.List;

public class Employee{
    public Employee(int id, String name, String surname) {
        this.id = id;
        Name = name;
        Surname = surname;
    }

    int id;
    String Name;
    String Surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }


    @Override
    public String toString() {
        return Name + '\'' + Surname;
    }
}
