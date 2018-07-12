/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public abstract class Car {
    protected int year;
    protected String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    @Override
    public final String toString() {
        return "Car{" + "year=" + year + ", model=" + model + '}';
    }
    
}
