package com.accenture.prebootcamp.objects.exercises.exercise3;

//3. create class "Rectangle"...
public class Rectangle {

    // with properties "width" and "height" (whole numbers).
    private int width;
    private int height;

    //* create default constructor which sets "height" to 5 and "width" to 10
    Rectangle() {
        height = 5;
        width = 10;
    }

    // * create a constructor with parameters "width"
    // and "height" which sets the corresponding property values
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        if (this.width <= 0) {
            this.width = 10;
        }
        if (this.height <= 0) {
            this.height = 5;
        }
    }

    //* create methods "getHeight" and "getWidth" which return the corresponding properties
    int getHeight() {
        return height;
    }

    int getWidth() {
        return width;
    }

    //* create a method "getPerimeter" (sum all sides) which
    // calculates and returns the perimeter of the rectangle
    int getPerimeter() {
        return (width + height) * 2;
    }

    //* create a method "getArea" (multiply with with height)
    // which calculates and returns the area of rectangle
    int getArea() {
        return width * height;
    }

    //* create a method "incrementHeight" with no parameters, which increments height by one
    void incrementHeight() {
        height++;
    }

    //* create a method "incrementWidth" with no parameters, which increments width by one
    void incrementWidth() {
        width++;
    }
}
