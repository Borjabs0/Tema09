package com.borjabolufer.ejercicios;

import java.util.Arrays;

public class Ejercicio07 {
    private final String[] array;

    public Ejercicio07() {
        this.array = new String[]{
                "Hola, ¿cómo estás?",
                "El sol brilla en el cielo azul.",
                "La vida es bella.",
                null,
                "Aprender nunca termina.",
                "El café es mi combustible.",
                null,
                "El conocimiento es poder."
        };

        mostrarCadenasArray(array);
        System.out.println(Arrays.toString(array));
    }

    public void mostrarCadenasArray(String[] array) {
        for (String cadena : array) {
            try {
                if (!cadena.isEmpty()) {
                    System.out.println("El primer caracter de " + cadena + " es: " + cadena.charAt(0));
                }
            } catch (NullPointerException NPE) {
                System.out.println("La cadena es nula");
            }
        }
    }
}
