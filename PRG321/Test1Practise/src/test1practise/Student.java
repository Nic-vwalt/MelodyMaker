/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1practise;

/**
 *
 * @author Drikus
 */
public class Student extends Person implements Istudent, Comparable<Student> {
    
    protected double mark1, mark2;

    public Student(double mark1, double mark2, String name, String surname, int id, int age) {
        super(name, surname, id, age);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    @Override
    public String toString() {
        return "Student{" + "mark1=" + mark1 + ", mark2=" + mark2 + '}';
    }
    
    public Student(String name, String surname, int id, int age) {
        super(name, surname, id, age);
    }

    @Override
    public double CalculateMark() {
        return (this.mark1 + this.mark2)/2;
    }

    @Override
    public int compareTo(Student o) {
        if (this.mark1 > o.mark1) {
            return 1;
        }
        return -1;
 
    }
    
}
