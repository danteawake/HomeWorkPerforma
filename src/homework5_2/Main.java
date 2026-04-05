package homework5_2;

public class Main {

    /*
    Задача 2:
    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
    Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
    периметра(используя абстрактный класс/методы). Создать массив из 5 разных
    фигур. Вывести на экран сумму периметра всех фигур в массиве
     */

    public static void main(String[] args) {

        double totalPerimeter = 0.0;
        Figure[] figures = new Figure[5];

        figures[0] = new Triangle(4, 3, 5);
        figures[1] = new Rectangle(5, 4);
        figures[2] = new Circle(4);
        figures[3] = new Triangle(3, 5, 7);
        figures[4] = new Rectangle(8, 2);

        for (int i = 0; i < figures.length; i++) {
            Figure f = figures[i];
            f.getParameters();
            totalPerimeter += f.perimeter();
        }

        System.out.println("Sum of perimeters of all figures = " + totalPerimeter);
    }
}
