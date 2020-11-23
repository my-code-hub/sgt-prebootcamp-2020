package com.accenture.prebootcamp.encapsulation.excersises.exercise1.p1;

public class InnerApp {

    public static void main(String[] args) {

        //1. create new instance of class A using default constructor
        A objectA = new A();

        //2. output the value of property "a" via the getter method
        //Note: if you did everything right, then the code below shouldn't be compiling:
        //A object = new A();
        //System.out.println(object.a);
        System.out.println(objectA.getA());

        //3. output the value of property "b" via the getter method
        //Note: if you did everything right, then the code below shouldn't be compiling:
        // A object2 = new A();
        // System.out.println(object2.b);
        System.out.println(objectA.getB());

        //4. output the value of property c
        //modify the value of property c to "Updated C!"
        //output the value of property c
        System.out.println(objectA.getC());
        objectA.setC("Updated C!");
        System.out.println(objectA.getC());

        //5. output property value "d"
        // update property "d" to value "InnerApp"
        // output property value "d"
        System.out.println(objectA.d);
        objectA.d = "InnerApp";
        System.out.println(objectA.d);

        //6. call method "local()"
        objectA.local();

        //7. call method "famous()"
        objectA.famous();

        //8. can you call method "secret" on this object? Why not?
       // objectA.secret();

        //9.create new instance of class B using default constructor
        // why can you do it in this class, but couldn't do it in class "BaseApp"?

        B objectB = new B();
    }
}
