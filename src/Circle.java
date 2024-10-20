public class Circle extends Shape {

    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle(r=" + radius + ", center=" + center + ")";
    }
}
