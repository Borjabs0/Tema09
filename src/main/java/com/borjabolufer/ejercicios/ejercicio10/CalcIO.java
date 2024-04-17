package com.borjabolufer.ejercicios.ejercicio10;


import java.util.Random;
import java.util.Scanner;

public class CalcIO {
    public Scanner lector = new Scanner(System.in);
    //Constantes para las validaciones.
    private static final int MIN_LONGITUD_STRING = 0;
    private static final int MAX_LONGITUD_STRING = 10;
    private static final double MAX_DOUBLE = Double.MAX_VALUE;
    private static final double MIN_DOUBLE = Double.MIN_VALUE;
    private Random random;
    private int interaciones;

    public CalcIO(int interaciones) {
        random = new Random();
        this.interaciones = interaciones;
    }

    public void iniciarSimulacion() {
        for (int i = 0; i < interaciones; i++) {
            int seleccionado = random.nextInt(0, 6); // Excluimos la opción 0 (salir)
            double numUno = random.nextDouble(MIN_DOUBLE, MAX_DOUBLE);
            double numDos = random.nextDouble(MIN_DOUBLE, MAX_DOUBLE);

            String operacion = menu(seleccionado, numUno, numDos);
            System.out.println("Operación: " + operacion);
            System.out.println("Enter para continuar...");
            lector.nextLine();
        }
    }

    private String menu(int seleccionado, double numUno, double numDos) {
        String operacion = "";

        try {
            System.out.println("*****************************\n** OPERACIONES  **\n*****************************\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Resto de la division\n--------------------------\n0. Volver al menu principal");

            switch (seleccionado) {
                case 1:
                    operacion = "Suma";
                    String resultadoSuma = Calculadora.suma(numUno, numDos);
                    System.out.println(resultadoSuma);
                    System.out.println("Enter para seguir...");
                    lector.nextLine();
                    break;
                case 2:
                    operacion = "Resta";
                    String resultadoResta = Calculadora.resta(numUno, numDos);
                    System.out.println(resultadoResta);
                    System.out.println("Enter para seguir...");
                    lector.nextLine();
                    break;
                case 3:
                    operacion = "Multiplicacion";
                    String resultadoMultiplicacion = Calculadora.multiplicacion(numUno, numDos);
                    System.out.println("el resultado de la multiplicacion es: " + resultadoMultiplicacion);
                    System.out.println("Enter para seguir...");
                    lector.nextLine();
                    break;
                case 4:
                    operacion = "Division";
                    String resultadoDivision = Calculadora.division(numUno, numDos);
                    System.out.println(resultadoDivision);
                    System.out.println("Enter para seguir...");
                    lector.nextLine();
                    break;
                case 5:
                    operacion = "Resto";
                    String resultadoResto = Calculadora.resto(numUno, numDos);
                    System.out.println(resultadoResto);
                    System.out.println("Enter para seguir...");
                    lector.nextLine();
                    break;
                case 0:
                    System.out.println("\n\n\n\n");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } catch (NumberFormatException NFE) {
            System.out.println("ERROR - La opcion debe ser un numero. Intentalo de nuevo");
        } catch (ArithmeticException AE) {
            System.out.println("ERROR - Error aritmético: ");
        }catch (IllegalArgumentException IAE){
            System.out.println("ERROR - Error de argumento");
        }
        return operacion;
    }
}
