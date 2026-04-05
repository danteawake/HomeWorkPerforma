package homework5_2;

abstract class Figure {

    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract double square();

    public abstract double perimeter();

    public void getParameters() {
        System.out.println("----------------");
        System.out.println(name);
        System.out.println("square = " + square());
        System.out.println("perimeter = " + perimeter());
    }
}