public class Circle {

    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(Circle other) {
        this.radius = other.radius;
    }
   
    public double getRadius() {
        return radius;
    }
   
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Radius: " + radius + ", Area: " + getArea();
    }

    public boolean equals(Circle other) {
        return this.radius == other.radius;
    }

    public boolean greaterThan(Circle other) {
        return other.getArea() > this.getArea();
    }

}
