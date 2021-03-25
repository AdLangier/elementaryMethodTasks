package com.company;

import java.util.Scanner;

public class Zad7 {
    static Scanner scanner = new Scanner(System.in);

    static boolean isIntegerSquare(double a) {             //zwracany typ to "boolean", ponieważ w treści zadania żądany wynik to true lub false

        double square = Math.sqrt(a);                           //Konieczność skorzystania z klasy "Math" dlatego też typ argumentu to double,
        if ((square - Math.floor(square) == 0)) {               //ponieważ klasa "Math" taki obsługuje
            return true;
        } return false;
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        int userNumber = scanner.nextInt();
        System.out.println("Liczba jest kwadratem liczby całkowitej: " + isIntegerSquare(userNumber));

    }
}
