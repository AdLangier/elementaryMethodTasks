package com.company;

import java.util.Scanner;

public class Zad13 {

    static int getMultiplication(int a, int n){

        int multi = a;
        for (int i = 1; i < n; i++) {
            multi = multi*a;
        }
        return multi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę i wykładnik jej potęgi");
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("Liczba "+a+" podniesiona do potęgi "+n+" to: "+
                getMultiplication(a,n));
    }
}
