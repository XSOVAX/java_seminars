package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Task2HW {
    public static void main(String[] args) {
        System.out.println(sum_of_positive_numbers());
    }

    public static int sum_of_positive_numbers() {
        Scanner scanner = new Scanner(System.in);
        int sum_data = 0, previous_data = 0;
        int data = scanner.nextInt();
        while (data != 0){
            if(data < 0) sum_data += previous_data;
            if (data >= 0) previous_data = data;
            data = scanner.nextInt();
        }
        return sum_data;
    }
}
