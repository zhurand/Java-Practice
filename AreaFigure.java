//Write a Java program to create a base class Shape with a method called calculateArea().
//Create three subclasses: Circle and Triangle.
//Override the calculateArea() method in each subclass to calculate and return the shape's area.
//https://w3resource.com/java-exercises/index-polymorphism.php

public class AreaFigure {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4, 9);

        Shape[] shapes = {shape, circle, triangle};

        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }

    }
}

class Shape {
    final static double PI = 3.14;

    public Shape() {
    }

    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return PI * (r * r);
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}