public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return GeometryUtility.distance(a, b) + GeometryUtility.distance(b, c) + GeometryUtility.distance(c, a);
    }

    @Override
    public double getArea() {
        double ab = GeometryUtility.distance(a, b);
        double bc = GeometryUtility.distance(b, c);
        double ac = GeometryUtility.distance(a, c);

        double p = (ab + bc + ac) / 2;

        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle(a=" + a + ", b=" + b + ", c=" + c + ")";
    }
}
