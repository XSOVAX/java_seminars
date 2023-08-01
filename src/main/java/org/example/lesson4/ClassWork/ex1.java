package org.example.lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);;
        System.out.println("linkedList = " + linkedList);
        linkedList = reverseList(linkedList);
        System.out.println("linkedList = " + linkedList);
        int sum = 0;
        for (Integer element : linkedList) {
            if (element % 2 == 0) sum += element;
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }

    /**
     * @param n количество элементов
     * @return новый список
     */
    public static LinkedList createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for(int i = 0; i < n; i++){
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }

    public static LinkedList reverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> linkedListSolution = new LinkedList<>();
        int n = linkedList.size();
        if (n > 0){
            for (int i = 0; i < n; i++) {
                linkedListSolution.addFirst(linkedList.pop());
            }
        }
        return linkedListSolution;
    }
}
