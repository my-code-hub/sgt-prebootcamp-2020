package com.accenture.prebootcamp.objects.exercises.exercise3;

public class ObjectsExercises3 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        System.out.println("r1.getHeight() - " + r1.getHeight());
        System.out.println("r1.getWidth() - " + r1.getWidth());
        System.out.println("r1.getArea() - " + r1.getArea());
        System.out.println("r1.getPerimeter() - " + r1.getPerimeter());

        r1.incrementHeight();
        r1.incrementWidth();
        System.out.println("r1.getHeight() - " + r1.getHeight());
        System.out.println("r1.getWidth() - " + r1.getWidth());

        System.out.println("*****************");

        Rectangle r2 = new Rectangle(-100, -50);
        System.out.println("r2.getHeight() - " + r2.getHeight());
        System.out.println("r2.getWidth() - " + r2.getWidth());

        System.out.println("*****************");

        Rectangle r3 = new Rectangle(100, 50);
        System.out.println("r3.getHeight() - " + r3.getHeight());
        System.out.println("r3.getWidth() - " + r3.getWidth());
        System.out.println("r3.getArea() - " + r3.getArea());
        System.out.println("r3.getPerimeter() - " + r3.getPerimeter());

        r3.incrementHeight();
        r3.incrementWidth();
        System.out.println("r3.getHeight() - " + r3.getHeight());
        System.out.println("r3.getWidth() - " + r3.getWidth());
    }
}
