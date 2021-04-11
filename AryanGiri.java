// Declaring Triangle class
class Triangle {
    public double length, breadth;

    // Default constructor
    public Triangle() {
    }

    // Main constructor
    public Triangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method that calculates area of the triangle
    public double area() {
        return 0.5 * this.breadth * this.length;
    }
}

// Main class with main method
public class AryanGiri {
    public static void main(String[] args) {
        // Declaring two triangle objects
        Triangle t1 = new Triangle(1.4, 6.4), t2 = new Triangle(3.1, 2.9);

        // Extracting larger triangle
        Triangle largerTriangle = t1.length >= t2.length ? t1 : t2;

        // Printing area of the larger triangle on console
        System.out.println("Area of the larger triangle: " + largerTriangle.area());
    }
}
