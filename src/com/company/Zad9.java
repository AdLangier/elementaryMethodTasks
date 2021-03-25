package com.company;

import java.util.Scanner;

public class Zad9 {
    static Scanner scanner = new Scanner(System.in);

    static String isCube(int a) {                                    //użyłem typu "String" jako zwracanego dla sprawdzenia

        double cube = Math.cbrt(a);
        if ((cube - Math.floor(cube)) == 0) {
            return "Liczba jest sześcianem liczby całkowitej";
        }
        return "Liczba nie jest sześcianem liczby całkowitej";
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        System.out.println(isCube(number));
    }


}
