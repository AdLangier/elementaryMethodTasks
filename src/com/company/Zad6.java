package com.company;

import java.util.Scanner;

public class Zad6 {
    static Scanner scanner = new Scanner(System.in);

    static int digitsSum(int n)                           // używamy pętli "while" ponieważ nie wiemy ile cyfr będzie miała liczba podana przez użytkownika
    {
        int sum = 0;                                      // niestety ze względu na użycie typu "int" program jest ograniczony
        while (n != 0)                                    // do maksymalnej wartości "inta" przy użyciu double był problem
        {                                                 // z formatowaniem (ale treść zadania zakłada użycie liczby całkowitej)
            sum = (sum + n % 10);
            n = n / 10;                                     //WAŻNE rozpisać na czynniki pierwsze kolejność działania warunku w pętli
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        System.out.println("Suma cyfr tej liczby to: " + digitsSum(number));
    }
}
