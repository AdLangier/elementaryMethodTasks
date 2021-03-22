package com.company;

import java.util.Scanner;

public class Zad5 {
    static Scanner scanner = new Scanner(System.in);

    static boolean checkNumbers(int a, int b, int c) {                    //zmienia nam się typ metody ale argumenty nadal są typu int
        if ((a * a + b * b) == c * c) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Podaj 3 liczby");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberC = scanner.nextInt();
        System.out.println("Liczby są liczbami pitagorejskimi: " + checkNumbers(numberA, numberB, numberC));
    }


}
