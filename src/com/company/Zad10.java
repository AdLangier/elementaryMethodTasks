package com.company;

import java.util.Scanner;

public class Zad10 {
    static Scanner scanner = new Scanner(System.in);

    static int getMax(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby");
        int userNumber = scanner.nextInt();
        int userNumber2 = scanner.nextInt();
        System.out.println("Spośród podanych liczb największa to: "+getMax(userNumber,userNumber2));
    }
}
