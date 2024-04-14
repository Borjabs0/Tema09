package com.borjabolufer.ejercicios;

import com.borjabolufer.Lib.LibIO;
import com.borjabolufer.ejercicios.ejercicio05.Ejercicio05;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
    private final int num;
    private final int[] array;

    public Ejercicio06() {
        Scanner scanner = new Scanner(System.in);
        array = new int[]{-2, -1, 0, 1, 2};
        num = 2;
        dividirEntreArrayA(num, array);
        dividirEntreArrayB(num, array);
        System.out.print("Array: ");
        System.out.println(Arrays.toString(array));
    }

    public void dividirEntreArrayA(int num, int[] array) {
        int division;
        System.out.println("DIVISION DE NUMEROS CAPTURANDO LA EXCEPCION:");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            try {
                division = num / array[i];
                System.out.println("La division entre el numero " + num + " y el numero " + array[i] + " es igual: " + division);
            } catch (ArithmeticException AE) {
                System.out.println("No se puedo dividir por cero.");
            }
        }
        System.out.println();
    }

    public void dividirEntreArrayB(int num, int[] array) {
        int division;
        System.out.println("DIVISION DE NUMEROS EN LA QUE LA EXCEPCION NO SE LLEGA A PRODUCIR:");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                division = num / array[i];
                System.out.println("La division entre el numero " + num + " y el numero " + array[i] + " es igual: " + division);
            } else {
                System.out.println("No se puedo dividir por cero.");
            }
        }
        System.out.println();
    }
}
