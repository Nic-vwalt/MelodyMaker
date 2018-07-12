/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_5;

/**
 *
 * @author Michael
 */
public class Circle extends Shape{
    
    double radius =1;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public int getArea()
    {
    return 0;
    }
    
    public int getPerimeter()
    {
    return 0;    
    }

    @Override
    public String toString() {
        return "A circle with radius: "+radius+", which is a subclass of"+ super.toString();
    }
    
    
    
}
