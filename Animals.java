//1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
//Create two subclasses Bird and Cat.
//Override the Sound() method in each subclass to make a specific sound for each animal.
//https://w3resource.com/java-exercises/index-polymorphism.php

public class Animals {
    public static void main(String[] args) {

        Animal animal = new Animal("Животное");
        Bird kesha = new Bird("Кеша");
        Cat murka = new Cat("Мурка");

        Animal[] animals = {animal, kesha, murka};
        for (Animal a : animals) {
            System.out.println(a.getName() + ": " + a.sound());
        }

    }
}

class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String sound() {
        return "Звук какого-то животного";
    }

}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Чик-чирик";
    }

}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Мяу";
    }

}