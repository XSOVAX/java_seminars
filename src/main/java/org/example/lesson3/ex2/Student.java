package org.example.lesson3.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String FIO;
    private int numberGroup;
    private int salary;
    private List<Integer> score;
}
