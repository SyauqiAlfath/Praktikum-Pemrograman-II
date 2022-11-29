
package praktikum5;

public class Paint {
    private double coverage;
    
    // Constructor dari object paint
    public Paint(double c) {
        coverage = c;
    }
    
    // Return the amount of paint (number of gallons)
    // needed to paint the shape given as the parameter.
    public double amount(Shape s){
        System.out.println("Computing amount for" + s);
        return s.area() / coverage;
    }
    
}
