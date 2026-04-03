package homework5_2;

class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double square() {
        return 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (c + a - b) * (a + b - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}