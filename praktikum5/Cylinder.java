
package praktikum5;

public class Cylinder extends Shape{
    private double radius;
    private double height;
    
    // constructor Cylinder
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }
    
    // Return nilai luas permukaan dari Cylinder    
    public double area() {
        return Math.PI*radius*radius*height;
    }
    
    // Return nilai Cylinder menjadi string
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
