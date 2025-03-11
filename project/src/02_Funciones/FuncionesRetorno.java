/**
 * Demostración de Funciones con Retorno en Java
 * Este archivo muestra diferentes tipos de funciones que devuelven valores.
 */
public class FuncionesRetorno {
    public static void main(String[] args) {
        // 1. Función que retorna un valor simple
        System.out.println("=== Función con retorno simple ===");
        int suma = sumar(5, 3);
        System.out.println("Suma: " + suma);
        
        // 2. Función que retorna un String
        System.out.println("\n=== Función que retorna String ===");
        String mensaje = generarSaludo("María");
        System.out.println(mensaje);
        
        // 3. Función que retorna un boolean
        System.out.println("\n=== Función que retorna boolean ===");
        boolean esPar = esNumeroPar(8);
        System.out.println("¿Es par? " + esPar);
        
        // 4. Función que retorna un array
        System.out.println("\n=== Función que retorna array ===");
        int[] duplicados = duplicarArray(new int[]{1, 2, 3});
        System.out.print("Array duplicado: ");
        for (int num : duplicados) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 5. Función que retorna un objeto
        System.out.println("\n=== Función que retorna objeto ===");
        Estudiante estudiante = crearEstudiante("Pedro", 20);
        System.out.println("Estudiante creado: " + estudiante.nombre + ", " + estudiante.edad + " años");
    }
    
    // Función que retorna un int
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    // Función que retorna un String
    public static String generarSaludo(String nombre) {
        return "¡Hola " + nombre + "! ¿Cómo estás?";
    }
    
    // Función que retorna un boolean
    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }
    
    // Función que retorna un array
    public static int[] duplicarArray(int[] original) {
        int[] resultado = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            resultado[i] = original[i] * 2;
        }
        return resultado;
    }
    
    // Función que retorna un objeto
    public static Estudiante crearEstudiante(String nombre, int edad) {
        return new Estudiante(nombre, edad);
    }
}

// Clase auxiliar para demostración
class Estudiante {
    String nombre;
    int edad;
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

/* Ejercicio propuesto:
 * 1. Crear una función que reciba un array de números y retorne:
 *    - El promedio de los números
 *    - El número mayor
 *    - El número menor
 * 
 * 2. Crear una función que reciba una cadena y retorne:
 *    - Si es un palíndromo (true/false)
 *    - La cadena invertida
 * 
 * 3. Crear una función que reciba un número y retorne:
 *    - Un array con todos sus divisores
 *    - Si es un número primo
 * 
 * 4. Crear una función que reciba dos objetos Estudiante y retorne:
 *    - El estudiante con mayor edad
 *    - Un nuevo estudiante con los datos combinados
 */