
package SP20_BSE_036_LAB11_Assignment;
/*
Implement a class CalculateAreas that has a function that takes shape type array of objects 
and builds an array of (double values) values for each corresponding shapes
*/
public class Calculate_Area {
   static Shape obj_array[]= new Shape[3];
    private int i=0;
    //This function will take shape type object and put it in array 
    public void add(Shape a){                   
        if(i<obj_array.length){
           obj_array[i]=a;
            i++;
             }
        
    }
    public static void main(String[] args) {
      
        Shape S1= new Circle(9.0);
        Shape S2= new Rectangle(9.0,8.0);
        Shape S3= new Triangle(5.0,4.0);
        
       Calculate_Area A = new Calculate_Area();
     
        A.add(S1);
        A.add(S2);
        A.add(S3);
        System.out.println(obj_array[0].area());
        System.out.println(obj_array[1].area());
        System.out.println(obj_array[2].area());
        
    }
    
    }

    

