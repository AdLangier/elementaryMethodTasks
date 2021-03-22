package com.company;

import java.util.Scanner;

public class Zad3 {
    static Scanner scanner = new Scanner(System.in);

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Podaj 2 liczby");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Wynik mnożenia to: " + multiply(firstNumber, secondNumber));

    }
}
