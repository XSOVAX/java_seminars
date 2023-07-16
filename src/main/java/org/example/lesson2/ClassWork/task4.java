package org.example.lesson2.ClassWork;

public class task4 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.x = 1;
        vector.y = 2;
        vector.z = 3;
        Vector vector2 = new Vector(1, 2,1);
        System.out.println("vector2.vectorLength() = " + vector2.vectorLength());
        System.out.println(vector);
        System.out.println("vector.scalarMultiply(vector2) = " + vector.scalarMultiply(vector2));

    }

}
