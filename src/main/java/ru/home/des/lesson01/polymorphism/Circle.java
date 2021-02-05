package ru.home.des.lesson01.polymorphism;

public class Circle implements Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculation() {
        System.out.println("Area circle: " + 3.14 * Math.sqrt(radius));
    }
}
