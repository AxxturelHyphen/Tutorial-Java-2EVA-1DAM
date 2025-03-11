/**
 * Demostración de Variables en Java
 * Este archivo muestra los diferentes tipos de variables en Java y su uso.
 */
public class Variables {
    public static void main(String[] args) {
        // 1. Variables numéricas enteras
        byte numeroPequeno = 127;              // -128 a 127
        short numeroCorto = 32767;             // -32,768 a 32,767
        int numeroEntero = 2147483647;         // -2^31 a 2^31-1
        long numeroLargo = 9223372036854775807L; // -2^63 a 2^63-1

        // 2. Variables numéricas decimales
        float decimal = 3.14159f;              // Precisión simple
        double decimalDoble = 3.14159265359;   // Precisión doble

        // 3. Variables de texto
        char caracter = 'A';                   // Un solo carácter Unicode
        String texto = "Hola Mundo";           // Cadena de texto

        // 4. Variable booleana
        boolean verdadero = true;
        boolean falso = false;

        // Mostrar valores
        System.out.println("=== Demostración de Variables ===");
        System.out.println("Byte: " + numeroPequeno);
        System.out.println("Short: " + numeroCorto);
        System.out.println("Int: " + numeroEntero);
        System.out.println("Long: " + numeroLargo);
        System.out.println("Float: " + decimal);
        System.out.println("Double: " + decimalDoble);
        System.out.println("Char: " + caracter);
        System.out.println("String: " + texto);
        System.out.println("Boolean: " + verdadero + ", " + falso);

        // Ejercicio propuesto:
        /* 
         * 1. Crear variables para almacenar:
         *    - Tu edad
         *    - Tu altura en metros
         *    - Tu nombre
         *    - Si eres estudiante (true/false)
         * 2. Mostrar todos los valores en consola
         */
    }
}