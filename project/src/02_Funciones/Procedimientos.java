/**
 * Demostración de Procedimientos (métodos void) en Java
 * Este archivo muestra diferentes tipos de procedimientos y su uso.
 */
public class Procedimientos {
    public static void main(String[] args) {
        // 1. Procedimiento simple
        System.out.println("=== Procedimiento simple ===");
        saludar();
        
        // 2. Procedimiento con parámetros
        System.out.println("\n=== Procedimiento con parámetros ===");
        saludarPersona("Juan");
        
        // 3. Procedimiento con múltiples parámetros
        System.out.println("\n=== Procedimiento con múltiples parámetros ===");
        imprimirInformacion("Ana", 25);
        
        // 4. Procedimiento con array como parámetro
        System.out.println("\n=== Procedimiento con array ===");
        int[] numeros = {1, 2, 3, 4, 5};
        imprimirArray(numeros);
        
        // 5. Procedimiento que modifica un objeto
        System.out.println("\n=== Procedimiento que modifica objeto ===");
        Persona persona = new Persona("Carlos");
        modificarPersona(persona);
        System.out.println("Nombre modificado: " + persona.nombre);
    }
    
    // Procedimiento simple sin parámetros
    public static void saludar() {
        System.out.println("¡Hola mundo!");
    }
    
    // Procedimiento con un parámetro
    public static void saludarPersona(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }
    
    // Procedimiento con múltiples parámetros
    public static void imprimirInformacion(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    // Procedimiento que recibe un array
    public static void imprimirArray(int[] array) {
        System.out.print("Elementos del array: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    // Procedimiento que modifica un objeto
    public static void modificarPersona(Persona p) {
        p.nombre = p.nombre.toUpperCase();
    }
}

// Clase auxiliar para demostración
class Persona {
    String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

/* Ejercicio propuesto:
 * 1. Crear un procedimiento que imprima un patrón de asteriscos
 *    basado en un número que reciba como parámetro
 * 
 * 2. Crear un procedimiento que reciba un array de nombres
 *    y los imprima en orden inverso
 * 
 * 3. Crear un procedimiento que reciba dos números y muestre
 *    todos los números pares entre ellos
 * 
 * 4. Crear un procedimiento que modifique los elementos de un array
 *    multiplicándolos por un número dado
 */