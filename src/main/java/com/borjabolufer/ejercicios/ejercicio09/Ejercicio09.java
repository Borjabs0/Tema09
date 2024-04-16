package com.borjabolufer.ejercicios.ejercicio09;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
    public Ejercicio09() {
        //Excepcion A
        Scanner scanner = new Scanner(System.in);
        int[] numerosEnteros = new int[]{-2, -1, 0, 0, 2, 0, 1, 0};
        int num = 2;
        System.out.print("Array: ");
        System.out.println(Arrays.toString(numerosEnteros));
        System.out.println();

        //Excepcion B
        //Array String el cual provocara la excepcion NullPointerException
        String[] cadenas = new String[]{
                "Hola, ¿cómo estás?",
                "El sol brilla en el cielo azul.",
                "La vida es bella.",
                null,
                "Aprender nunca termina.",
                "El café es mi combustible.",
                null,
                "El conocimiento es poder."
        };

        //ExcepcionC

        try {
            excepcionA(num, numerosEnteros);
        }catch (MyArithmeticException MAE){
            System.out.println(MAE.getMessage());
        }
        try {
            excepcionB(cadenas);
        }catch (MyNullPointerException MNPE){
            System.out.println(MNPE.getMessage());
        }
        try {
            excepcionC(cadenas);
        }catch (MyIndexOutOfBoundsException MIOOE){
            System.out.println(MIOOE.getMessage());
        }
    }

    public void excepcionA(int num, int[] array) throws MyArithmeticException{
        int division;
        System.out.println("ArithmeticException: ");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            try {
                division = num / array[i];
                System.out.println("La división entre el número " + num + " y el número " + array[i] + " es igual: " + division);
            } catch (ArithmeticException AE) {
                throw new MyArithmeticException("La excepción ArithmeticException ha sido tratada correctamente");
            }
        }
        System.out.println();
    }

    public void excepcionB(String[] array) throws  MyNullPointerException {
        System.out.println("NullPointerException\n");
        for (String cadena : array) {
            try {
                if (cadena == null) {
                    System.out.println("El primer caracter de " + cadena + " es: " + cadena.charAt(0));
                }
            } catch (NullPointerException NPE) {
                throw new MyNullPointerException("La excepción NullPointerException ha sido tratada correctamente");
            }
        }
        System.out.println();
    }

    public void excepcionC(String[] array) throws MyIndexOutOfBoundsException{
        System.out.println("IndexOutOfBoundsException\n");
        String cadena;
        for (int i = 0; i < array.length + 1; i++) {
            try {
                cadena = array[i];
                System.out.println(cadena);
            } catch (IndexOutOfBoundsException IOOBE) {
                throw new MyIndexOutOfBoundsException("La excepción IndexOutOfBoundsException ha sido tratada correctamente");
            }
        }
    }

}
