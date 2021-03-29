package com.company;

import java.util.Scanner;

public class Zad14 {

    static int getNWD(int a, int b) {

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    //Zadanie 18 pętle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 liczby");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Nwd tych liczb to: " + getNWD(a, b));

    }
}
