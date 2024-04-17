package com.borjabolufer.ejercicios.ejercicio10;

public class Calculadora {
        
    /**
     * Función que convierte el número decimal (Entero) a un número binario.
     * Se calcula el resto de cada número y se divide el resultado de nuevo.
     * @param num
     * @return Devuelve un String con el número en Binario.
     */
    public static String decimalBinario(String num){
        StringBuilder result = new StringBuilder();
        int numDecimal = Integer.valueOf(num);
        if(numDecimal == 0){
            return "0";
        }
        while(numDecimal > 0){
            int resto = numDecimal % 2;
            result.insert(0, resto);
            numDecimal /= 2; 
        }
        return result.toString();
    }
        
    /**
     * Función que realiza la conversión de DECIMAL A HEXADECIMAL.
     * Mediante un bucle se saca el resto de división entre 16 y se divide el resultado de nuevo hasta llegar a 0.
     * @param decimal
     * @return Devuelve un String con el número en Hexadecimal.
     */
    public static String decimalAHexadecimal(String decimal) {
        int numeroDecimal = Integer.parseInt(decimal);
        int residuo;
        String hexadecimal = "";
        String caracteresHexadecimales = "0123456789ABCDEF";
        while (numeroDecimal > 0) {
            residuo = numeroDecimal % 16;
            hexadecimal = caracteresHexadecimales.charAt(residuo) + hexadecimal;
            numeroDecimal = numeroDecimal / 16;
        }
        return hexadecimal;
    }
        
    /**
     * Función que realiza la conversión de BINARIO A DECIMAL.
     * Mediante un bucle se recorre la longitud desde la ultima posición y si se encuentra un 1 se hace la conversion, si no es 0.
     * @param numBinario
     * @return Se devuelve un String con el resultado.
     */
    public static String binarioDecimal(String numBinario){
        StringBuilder result = new StringBuilder();
        int resultado = 0;
        int longitud = numBinario.length();
        for (int i = longitud - 1; i >= 0; i--){
            char digito = numBinario.charAt(i);
            if (digito == '1'){
                resultado += Math.pow(2,longitud - 1 - i);
            }
        }
        result.append(resultado);
        return result.toString();
    }
        
    /**
     * Función que hace la conversion de BINARIO A HEXADECIMAL.
     * Primero se convierte el número en Binario a un Decimal (Entero) mediante otra función.
     * Se convierte el número decimal a String y se usa otra función para convertir el Decimal a Hexadecimal.
     * @param numBin
     * @return Se devuelve un String con el resultado.
     */
    public static String binarioAHexadecimal(String numBin) {
        StringBuilder result = new StringBuilder();
        String conversionDecimalEntero = binarioDecimal(numBin);
        String conversionDecimal = String.valueOf(conversionDecimalEntero);
        String conversionHexadecimal = decimalAHexadecimal(conversionDecimal);
        result.append(conversionHexadecimal);
        return result.toString();
    }
    
    /**
     * Función que realiza la conversión de HEXADECIMAL A BINARIO.
     * @param hexintroducido
     * @return Devuelve un Entero como número decimal.
     */
    public static int hexadecimalDecimal(String hexintroducido){
        int decimalNumber = 0;
        int length = hexintroducido.length();
    
        for (int i = 0; i < length; i++) {
            char digitoHex = hexintroducido.charAt(i);
            int valorDigito;
    
            if (digitoHex >= '0' && digitoHex <= '9') {
                valorDigito = digitoHex - '0';
            } else if (digitoHex >= 'A' && digitoHex <= 'F') {
                valorDigito = digitoHex - 'A' + 10;
            } else if (digitoHex >= 'a' && digitoHex <= 'f') {
                valorDigito = digitoHex - 'a' + 10;
            } else {
                throw new IllegalArgumentException("Caracter hexadecimal no válido: " + digitoHex);
            }
    
            decimalNumber = decimalNumber * 16 + valorDigito;
        }
        return decimalNumber;
    }

    /**
     * Función que hace la conversión de HEXADECIMAL A BINARIO.
     * Primero se convierte el número Hexadecimal a Decimal, mediante otra función y se guarda un enetero para convertirlo a binario.
     * Se convierte el número Decimal (Entero) a Binario.
     * @param numHexa Recibe un número Hexadecimal.
     * @return Devuelve un String con el número en binario
     */
    public static String hexadecimalBinario(String numHexa){
        StringBuilder result = new StringBuilder();
        int conversionDecimalEntero = hexadecimalDecimal(numHexa);
        String conversionDecimal = String.valueOf(conversionDecimalEntero);
        String conversionBinario = decimalBinario(conversionDecimal);
        result.append(conversionBinario);
        return result.toString();
    }

    /**
     * Función que recibe dos números y los suma.
     * @param n1
     * @param n2
     * @return Devuelve un String con el resultado, se concatena n1 + n2 = res.
     */
    public static String suma(double n1, double n2){
        StringBuilder result = new StringBuilder();
        double res = n1 + n2;
        result.append(n1).append(" + ").append(n2).append(" = ").append(res);
        return result.toString();
    }

    /**
     * Función que recibe dos números y los resta.
     * @param num1 Minuendo
     * @param num2 Sustraendo
     * @return Devuelve un String con el resultado y la operación num1 - num2 = res.
     */
    public static String resta(double num1, double num2){
        StringBuilder result = new StringBuilder();
        double res = num1 - num2;
        result.append(num1).append(" - ").append(num2).append(" = ").append(res);
        return result.toString();
    }
   
    /**
     * Función que recibe dos números y hace una multiplicación.
     * @param num1 Multiplicando
     * @param num2 Multiplicador
     * @return Devuelve un String con el resultado de la operacion. num1 * num2 = res.
     */
    public static String multiplicacion(double num1, double num2){
        StringBuilder result = new StringBuilder();
        double res = num1 * num2;
        result.append(num1).append(" * ").append(num2).append(" = ").append(res);
        return result.toString();
    }

    /**
     * Funcíon que recibe dos números y hace una división.
     * @param num1 Dividendo
     * @param num2 Divisor
     * @return Devuelve un String con el resultado de la operación num1 / num2 = res.
     */
    public static String division(double num1, double num2){
        StringBuilder result = new StringBuilder();
        double res = num1 / num2;
        result.append(num1).append(" / ").append(num2).append(" = ").append(res);
        return result.toString();
    }
    
    /**
     * Función que recibe dos números y saca el resto de la división. 
     * @param num1 Dividendo
     * @param num2 Divisor
     * @return Devuelve un String con el resultado de la operación num1 % num2 = res.
     */
    public static String resto(double num1, double num2){
        StringBuilder result = new StringBuilder();
        double res = num1 % num2;
        result.append(num1).append(" % ").append(num2).append(" = ").append(res);
        return result.toString();
    }
}
        

