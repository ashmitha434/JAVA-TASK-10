public class Circle {
    private double radius;

    //Constructor with no arguments
    public Circle(){
        this.radius = 0.0;

    }
    //Constructor with one argument
    public Circle(double radius) {
         this.radius = radius;

    }
    // Method to set radius 
    public void setRadius (double radius){
          this.radius = radius;

    }
    // Method to get radius 
    public double getRadius(){
        return radius;
    
    }
    // Method to calculate circumference 
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    } 
    public static void main(String[] args) {
        // Example usage
        Circle circle1 = new Circle(); // Using no-argument constructor
        circle1.radius = 5.0; // Setting radius separately
        System.out.println("Circle 1 Circumference: " + circle1.calculateCircumference());

        Circle circle2 = new Circle(3.0); // Using constructor with one argument
        System.out.println("Circle 2 Circumference: " + circle2.calculateCircumference());
    }
}
