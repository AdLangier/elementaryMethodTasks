package com.company;


//Dodatkowo sformatować wynik tak, aby poprawnie wyświetlał słowo "dzielnik"

import java.util.Scanner;

public class Zad11 {
    static Scanner scanner = new Scanner(System.in);

    static int getNumberOfDivisors(int a) {

        int numberOfDivisors = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }

    public static void main(String[] args) {

        System.out.println("Podaj liczbę");

        int userNumber = scanner.nextInt();

        if (getNumberOfDivisors(userNumber) == 2 || getNumberOfDivisors(userNumber) % 10 == 2 && getNumberOfDivisors(userNumber) != 12
                || getNumberOfDivisors(userNumber) == 3 || getNumberOfDivisors(userNumber) % 10 == 3 && getNumberOfDivisors(userNumber) != 13
                || getNumberOfDivisors(userNumber) == 4 || getNumberOfDivisors(userNumber) % 10 == 4 && getNumberOfDivisors(userNumber) != 14)
        {
            System.out.println("Podana liczba ma " + getNumberOfDivisors(userNumber) + " dzielniki");

        } else if (userNumber == 1) {

            System.out.println("Podana liczba ma 1 dzielnik");

        } else {

            System.out.println("Podana liczba ma " + getNumberOfDivisors(userNumber) + " dzielników");
        }
    }
}
