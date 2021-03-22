package com.company;

import java.util.Scanner;

public class Zad4 {
    static Scanner scanner = new Scanner(System.in);

    static int divide(int a, int b) {                                  // w metodzie divide() zawarty jest warunek, który zawsze
        if (a > b) {                                                   // będzie dzielił większą liczbę przez mniejszą oraz
            if (b == 0) {                                              // kiedy będziemy chcieli podzielić przez 0 wyświeli nam napis
                System.out.println("Nie dzielimy przez 0!");
            } else {
                return a / b;
            }
        } else if (b > a) {
            if (a == 0) {
                System.out.println("Nie dzielimy przez 0!");
            } else {
                return b / a;
            }
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Podaj 2 liczby");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("Wynik dzielenia to: " + divide(firstNumber, secondNumber));

    }
}

