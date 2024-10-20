public class Rectangle extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return 2 * (GeometryUtility.distance(a, b) + GeometryUtility.distance(b, c));
    }

    @Override
    public double getArea() {
        return GeometryUtility.distance(a, b) * GeometryUtility.distance(b, c);
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle(a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ")";
    }
}
