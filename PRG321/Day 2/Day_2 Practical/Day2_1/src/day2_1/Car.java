/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_1;

/**
 *
 * @author user
 */
public class Car {
    int year;
    String name;
    int model;

    public Car(int year, String name, int model) {
        this.model = model;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
       // return "Car{" + "year=" + year + ", name=" + name + ", model=" + model + '}';
        return "Year= " + year + "\n Name= " + name + "\n Model= " + model ;
    }
    
}
