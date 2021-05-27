/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SP20_BSE_036_LAB11_Assignment;

/*
Task 2
Implement the Shape interface for Rectangle, Circle and Triangle class.
*/
public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        System.out.println("Circle Area:");
        return radius* radius *Math.PI;
        
    }
    
}
