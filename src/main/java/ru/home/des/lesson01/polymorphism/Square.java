package ru.home.des.lesson01.polymorphism;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void calculation() {
        System.out.println("Area square: " + Math.sqrt(side));
    }
}
