package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String offer = scanner.nextLine();
            System.out.println(ReverseWords(offer));
        }
        private static String ReverseWords(String s) {
            String[] offer_array = s.split(" ");
            int k = 0;
            s = "";
            for(int i = offer_array.length - 1; i >= 0; i--) {
                if (offer_array[i].length() > 0){
                    if (k != 0) {
                        s += " ";
                    }
                    s += offer_array[i];
                    k++;
                }
            }

            return s;
        }
}