//Классный прямоугольник
//
//Давайте перейдём к более сложным геометрическим фигурам.
//
//Разработайте класс Rectangle.
//
//При инициализации класс принимает два списка рациональных координат противоположных углов прямоугольника
//(со сторонами параллельными осям координат).
//
//Класс должен реализовывать методы:
//
//perimeter — возвращает периметр прямоугольника;
//area — возвращает площадь прямоугольника.
//Все результаты вычислений нужно округлить до сотых.
//
//Примечание
//Ваше решение должно содержать только классы и функции.
//В решении не должно быть вызовов инициализации требуемых классов.
//
//Классный прямоугольник 2.0
//
//Расширим функционал класса написанного вами в предыдущей задаче.
//
//Реализуйте методы:
//
//getPos() — возвращает координаты верхнего левого угла в виде списка;
//getSize() — возвращает размеры в виде списка;
//move(dx, dy) — изменяет положение на заданные значения;
//resize(width, height) — изменяет размер (положение верхнего левого угла остаётся неизменным).
//
//Примечание
//Ваше решение должно содержать только классы и функции.
//В решении не должно быть вызовов инициализации требуемых классов.
//Все результаты вычислений нужно округлить до сотых.

import java.util.ArrayList;

public class CoolRectangle {
    public static void main(String[] args) {

        ArrayList<Double> corner1 = new ArrayList<>();
        corner1.add(7.52);
        corner1.add(-4.3);

        ArrayList<Double> corner2 = new ArrayList<>();
        corner2.add(3.2);
        corner2.add(3.14);

        Rectangle rect = new Rectangle(corner1, corner2);

        System.out.println(rect.perimeter());
        System.out.println(rect.area());
        System.out.println(rect.getPos());
        System.out.println(rect.getSize());
        rect.resize(23.5, 11.3);
        System.out.println(rect.getPos());
        System.out.println(rect.getSize());
        rect.move(1.32, -5);
        System.out.println(rect.getSize());
        System.out.println(rect.getPos());

    }
}

class Rectangle{

    private double x1, y1, x2, y2;
    private double rectangleHeight, rectangleWidth;

    public Rectangle(ArrayList<Double> corner1, ArrayList<Double> corner2) {
        this.x1 = corner1.get(0);
        this.y1 = corner1.get(1);
        this.x2 = corner2.get(0);
        this.y2 = corner2.get(1);
        this.rectangleHeight = (double) Math.round(Math.abs(this.y1 - this.y2) * 100) / 100;
        this.rectangleWidth = (double) Math.round(Math.abs(this.x1 - this.x2) * 100) / 100;
    }

    public double perimeter() {
        double result = 2 * (this.rectangleHeight + this.rectangleWidth);
        return (double) Math.round(result * 100) / 100;
    }

    public double area() {
        double result = this.rectangleHeight * this.rectangleWidth;
        return (double) Math.round(result * 100) / 100;
    }

    public ArrayList<Double> getPos() {
        ArrayList<Double> pos = new ArrayList<>();
        double x = (double) Math.round(Math.min(this.x1, this.x2) * 100) / 100;
        double y = (double) Math.round(Math.max(this.y1, this.y2) * 100) / 100;
        pos.add(x);
        pos.add(y);
        return pos;
    }

    public ArrayList<Double> getSize() {
        ArrayList<Double> rectangleSize = new ArrayList<>();
        rectangleSize.add(this.rectangleWidth);
        rectangleSize.add(this.rectangleHeight);
        return rectangleSize;
    }

    public void move(double dx, double dy) {
        this.x1 += dx;
        this.y1 += dy;
        this.x2 += dx;
        this.y2 += dy;
    }

    public void resize(double width, double height) {
        this.rectangleHeight = height;
        this.rectangleWidth = width;
    }
}