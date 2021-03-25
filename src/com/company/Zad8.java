package com.company;

import java.util.Scanner;

public class Zad8 {

    static boolean isPrimeNumber(int a) {

        int numberOfDividers = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                numberOfDividers++;
            }
        }
        if(numberOfDividers == 2||numberOfDividers == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int userNumber = scanner.nextInt();
        System.out.println("Liczba jest pierwsza: "+isPrimeNumber(userNumber));

    }
}
