/**
 * Demostración de Recursividad en Java
 * Este archivo muestra diferentes ejemplos de funciones recursivas.
 */
public class Recursividad {
    public static void main(String[] args) {
        // 1. Factorial recursivo
        System.out.println("=== Factorial Recursivo ===");
        int numero = 5;
        System.out.println("Factorial de " + numero + ": " + factorial(numero));
        
        // 2. Fibonacci recursivo
        System.out.println("\n=== Fibonacci Recursivo ===");
        System.out.println("Fibonacci de " + numero + ": " + fibonacci(numero));
        
        // 3. Suma recursiva de array
        System.out.println("\n=== Suma Recursiva de Array ===");
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Suma del array: " + sumaArray(numeros, numeros.length - 1));
        
        // 4. Potencia recursiva
        System.out.println("\n=== Potencia Recursiva ===");
        int base = 2;
        int exponente = 4;
        System.out.println(base + " elevado a " + exponente + ": " + potencia(base, exponente));
        
        // 5. Invertir String recursivamente
        System.out.println("\n=== Invertir String Recursivamente ===");
        String texto = "Hola Mundo";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + invertirString(texto));
    }
    
    // Factorial recursivo
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    // Fibonacci recursivo
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // Suma recursiva de array
    public static int sumaArray(int[] array, int indice) {
        if (indice < 0) {
            return 0;
        }
        return array[indice] + sumaArray(array, indice - 1);
    }
    
    // Potencia recursiva
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }
    
    // Invertir String recursivamente
    public static String invertirString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        return invertirString(str.substring(1)) + str.charAt(0);
    }
}

/* Ejercicio propuesto:
 * 1. Crear una función recursiva que calcule el máximo común divisor (MCD)
 *    de dos números usando el algoritmo de Euclides
 * 
 * 2. Crear una función recursiva que determine si una cadena es palíndromo
 * 
 * 3. Crear una función recursiva que cuente cuántas veces aparece un dígito
 *    en un número
 * 
 * 4. Crear una función recursiva que genere la secuencia de números
 *    triangulares hasta n
 */