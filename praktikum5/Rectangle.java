
package praktikum5;

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    // constructor dari Rectangle
    public Rectangle (double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }
    
    // Return nilai luas permukaan dari Rectangle
    public double area() {
        return length * width;
    }
    
    // Return nilai Rectangle menjadi string
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
