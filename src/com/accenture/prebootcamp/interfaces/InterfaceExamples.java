package com.accenture.prebootcamp.interfaces;

public class InterfaceExamples {

    public static void main(String[] args) {
        Shape shape = new Triangle();

        Shape shape2 = new Circle();

        Shape shape3 = new RedTriangle();

        Shape[] shapes = new Shape[3];
        shapes[0] = shape;
        shapes[1] = shape2;
        shapes[2] = shape3;

        outputAllShapes(shapes);

        if (shape instanceof Shape) {
            System.out.println(1);
        }

        if (shape3 instanceof Shape) {
            System.out.println(2);
        }
    }

    static void outputAllShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getType());
        }
    }
}
