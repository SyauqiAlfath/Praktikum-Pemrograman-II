
package praktikum5;

public abstract class Shape {

    protected String shape_name;
    
    //---------------------------------
    // Constructor : Sets up the shape
    //---------------------------------
    
    public Shape(String name) {
        shape_name = name;
    }
    
    //---------------------------------
    // Return the surface area of the shape
    //---------------------------------
    
    protected abstract double area();
    
    //---------------------------------    
    // Return the shape as a string
    //---------------------------------
    
    public String toString() {
        return shape_name;
    }
}
