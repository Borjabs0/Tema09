package com.borjabolufer.ejercicios.ejercicio05;

import com.borjabolufer.lib.LibIO;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
 private Alumno[] alumnos;
 private  Scanner scanner;

    public Ejercicio05() {
        solicitarDatos();
    }
    public void solicitarDatos(){
        alumnos = new Alumno[2];
        String nombre;
        int edad;
        float altura;
        scanner = new Scanner(System.in);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1));
            nombre = LibIO.solicitarString("Dime tu nombre", 3, 23 );
            edad = LibIO.solicitarInt("Dime tu edad: ", 0, 99);
            altura = LibIO.solicitarFloat("Dime tu altura: ", 0, 3);
            alumnos[i] = new Alumno(nombre, edad, altura );
            }
        System.out.println(Arrays.toString(alumnos));

        String alumnoMayor;
        if (alumnos[0].getEdad() > alumnos[1].getEdad()){
            alumnoMayor = alumnos[0].getNombre();
            System.out.println("El alumno " + alumnoMayor + " es mayor que el alumno " + alumnos[1].getNombre());
        } else if (alumnos[0].getEdad() ==  alumnos[1].getEdad()) {
            System.out.println("Tienen la misma edad");
        } else{
            alumnoMayor = alumnos[1].getNombre();
            System.out.println("El alumno " + alumnoMayor + " es mayor que el alumno " + alumnos[0].getNombre());
        }
    }

}
