package com.accenture.prebootcamp.encapsulation.examples.p1;

public class Example2 {
    // default / package access modifier
    // only accessible from classes in the same package
    String prop1 = "default";

    // public access modifier
    public String prop2 = "public";

    //encapsulated as private (private access modifier)
    private String prop3 = "private";

    //can be called inside of the same package and class
    void method1() {
        System.out.println("package access!");
    }

    // can be called from anywhere
    public void method2() {
        System.out.println("public access!");
    }

    // can be called inside the class
    private void method3() {
        System.out.println("private access!");
    }
    
    //example of getter method
    public String getProp3() {
        return prop3;
    }

    //example of setter method
    public void setProp3(String value) {
        prop3 = value;
    }
}
