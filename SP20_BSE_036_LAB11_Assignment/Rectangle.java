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
public class Rectangle implements Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area() {
        System.out.println("Rectangle Area: ");
        return length* width;
    }
    
}
