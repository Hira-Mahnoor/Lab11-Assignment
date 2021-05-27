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
public class Triangle implements Shape {
     public double height;
     public double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
     
     

    @Override
    public double area() {
        System.out.println("Triangle Area:");
        return ((height * base)/2);
    }
    
}
