/**
 * Demostración de Operadores en Java
 * Este archivo muestra los diferentes tipos de operadores y sus usos.
 */
public class Operadores {
    public static void main(String[] args) {
        // 1. Operadores Aritméticos
        System.out.println("=== Operadores Aritméticos ===");
        int a = 10;
        int b = 3;
        
        System.out.println("Suma: " + (a + b));         // 13
        System.out.println("Resta: " + (a - b));        // 7
        System.out.println("Multiplicación: " + (a * b));// 30
        System.out.println("División: " + (a / b));     // 3
        System.out.println("Módulo: " + (a % b));       // 1
        
        // 2. Operadores de Incremento/Decremento
        System.out.println("\n=== Operadores de Incremento/Decremento ===");
        int c = 5;
        System.out.println("Valor inicial: " + c);      // 5
        System.out.println("Postincremento: " + c++);   // 5 (luego 6)
        System.out.println("Valor actual: " + c);       // 6
        System.out.println("Preincremento: " + ++c);    // 7
        
        // 3. Operadores Relacionales
        System.out.println("\n=== Operadores Relacionales ===");
        System.out.println("a > b: " + (a > b));        // true
        System.out.println("a < b: " + (a < b));        // false
        System.out.println("a >= b: " + (a >= b));      // true
        System.out.println("a <= b: " + (a <= b));      // false
        System.out.println("a == b: " + (a == b));      // false
        System.out.println("a != b: " + (a != b));      // true
        
        // 4. Operadores Lógicos
        System.out.println("\n=== Operadores Lógicos ===");
        boolean x = true;
        boolean y = false;
        
        System.out.println("AND (&&): " + (x && y));    // false
        System.out.println("OR (||): " + (x || y));     // true
        System.out.println("NOT (!): " + (!x));         // false

        // Ejercicio propuesto:
        /*
         * 1. Crear dos variables numéricas
         * 2. Realizar todas las operaciones aritméticas
         * 3. Comparar los números usando operadores relacionales
         * 4. Crear expresiones booleanas combinando operadores lógicos
         */
    }
}