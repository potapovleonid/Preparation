package ru.home.des.lesson01.polymorphism;

public class Test1 {
    public static void main(String[] args) {
        Figure figure = new Circle(15);
        figure.calculation();
        figure = new Square(15);
        figure.calculation();
        figure = new Rectangle(15, 2);
        figure.calculation();
    }
}
