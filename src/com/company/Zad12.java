package com.company;

import java.util.Scanner;

//Dodatkowo wipisać w wyniku ilość tych dzielników :)))

public class Zad12 {


    static int maxDiv(int a, int b) {

        int max = 2;
        for (int i = a; i <= b; i++) {
            if (Zad11.getNumberOfDivisors(i)> Zad11.getNumberOfDivisors(max)){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Liczba z największą liczbą dzielników z podanego przedziału to: "
                +maxDiv(a,b)+" a jest ich: "+Zad11.getNumberOfDivisors(maxDiv(a,b)));

    }
}


