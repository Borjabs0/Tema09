package com.borjabolufer.ejercicios.ejercicio05;

import java.util.Scanner;

public class Alumno {
    private String nombre;
    private int edad;
    private float altura;
    private Scanner scanner;
    private  Alumno[] alumnos;

    public Alumno(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
