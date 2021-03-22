package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int add(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println("Podaj 2 liczby");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Wynik dodawania to: " + add(firstNumber, secondNumber));
    }


}
