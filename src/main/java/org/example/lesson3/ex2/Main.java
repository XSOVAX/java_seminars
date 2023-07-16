package org.example.lesson3.ex2;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова", 23, 1000, List.of(3,4,5));
        Student student2 = new Student("Семенов", 31, 1000, List.of(5,4,5));
        Student student3 = new Student("Сидорова", 25,1500, List.of(5,4,5));
        List<Student> students= new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            if (student.getFIO().endsWith("ова") && (sumScores(student.getScore()) % 2 == 0)){
                System.out.println(student.getSalary());
            }
        }
    }

    private static Integer sumScores(List<Integer> score) {
        int sum = 0;
        for (Integer integer : score) {
            sum += integer;
        }
        return sum;
    }
}
