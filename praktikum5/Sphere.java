
package praktikum5;

public class Sphere extends Shape{
    private double radius;
    
    // Constructor dari Sphere
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }
    
    // Mengembalikan nilai luas permukaan Sphere
    public double area() {
        return 4*Math.PI*(radius*radius);
    }
    
    // Mengembalikan nilai Sphere menjadi string
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
    
}
