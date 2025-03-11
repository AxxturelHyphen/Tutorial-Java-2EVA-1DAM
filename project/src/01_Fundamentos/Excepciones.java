/**
 * Demostración de Excepciones en Java
 * Este archivo muestra el manejo de excepciones y sus diferentes tipos.
 */
public class Excepciones {
    public static void main(String[] args) {
        // 1. Try-catch simple
        System.out.println("=== Try-catch simple ===");
        try {
            int resultado = 10 / 0;  // Genera ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
            System.out.println("Mensaje: " + e.getMessage());
        }
        
        // 2. Try-catch con múltiples catch
        System.out.println("\n=== Try-catch múltiple ===");
        try {
            int[] numeros = new int[3];
            numeros[5] = 10;  // Genera ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
        
        // 3. Try-catch-finally
        System.out.println("\n=== Try-catch-finally ===");
        try {
            String texto = null;
            texto.length();  // Genera NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Referencia nula");
        } finally {
            System.out.println("Este bloque siempre se ejecuta");
        }
        
        // 4. Lanzar excepciones
        System.out.println("\n=== Lanzar excepciones ===");
        try {
            validarEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
        
        // 5. Try con recursos (try-with-resources)
        System.out.println("\n=== Try con recursos ===");
        try (MiRecurso recurso = new MiRecurso()) {
            recurso.procesar();
        } catch (Exception e) {
            System.out.println("Error al procesar: " + e.getMessage());
        }
    }
    
    // Método que lanza una excepción
    public static void validarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        System.out.println("Edad válida: " + edad);
    }
}

// Clase para demostrar try-with-resources
class MiRecurso implements AutoCloseable {
    public void procesar() {
        System.out.println("Procesando recurso...");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("Cerrando recurso...");
    }
}

/* Ejercicio propuesto:
 * 1. Crear un método que reciba un String y devuelva su longitud
 *    - Manejar la excepción NullPointerException
 *    - Usar finally para mostrar un mensaje
 * 
 * 2. Crear un método que divida dos números
 *    - Manejar ArithmeticException
 *    - Validar que los números sean positivos
 *    - Lanzar IllegalArgumentException si son negativos
 * 
 * 3. Crear una clase que implemente AutoCloseable
 *    - Agregar métodos que puedan lanzar excepciones
 *    - Usar try-with-resources para manejar la clase
 */