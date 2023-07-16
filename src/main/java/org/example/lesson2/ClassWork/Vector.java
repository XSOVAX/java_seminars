package org.example.lesson2.ClassWork;

public class Vector {
    public double x;
    public  double y;
    public  double z;

    /**
     *
     * @param x координата X
     * @param y координата Y
     * @param z координата Z
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    /**
     *
     * @return Вывод в строковой форме
     */
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return Нахождение длинны вектора
     */
    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     *
     * @param vector2  произведение с этим вектором
     * @return Возвращает значение скалярного произведения векторов
     */
    public double scalarMultiply(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.y;
    }
}
