/**
 * Implementación del Algoritmo de Ordenamiento por Inserción
 * Este archivo muestra la implementación y uso del algoritmo Insertion Sort.
 */
public class InsertionSort {
    public static void main(String[] args) {
        // Array de ejemplo
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array original:");
        imprimirArray(numeros);
        
        // Aplicar ordenamiento por inserción
        insertionSort(numeros);
        
        System.out.println("\nArray ordenado:");
        imprimirArray(numeros);
        
        // Ejemplo con array de strings
        String[] nombres = {"Zara", "Ana", "Pedro", "Juan", "Carla"};
        
        System.out.println("\nArray de nombres original:");
        imprimirArray(nombres);
        
        // Aplicar ordenamiento por inserción a strings
        insertionSort(nombres);
        
        System.out.println("\nArray de nombres ordenado:");
        imprimirArray(nombres);
    }
    
    // Implementación de Insertion Sort para enteros
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Mover los elementos del array que son mayores que key
            // a una posición adelante de su posición actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            
            // Mostrar el estado del array después de cada inserción
            System.out.println("Después de insertar " + key + ":");
            imprimirArray(arr);
        }
    }
    
    // Implementación de Insertion Sort para strings
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    // Método auxiliar para imprimir arrays de enteros
    public static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Método auxiliar para imprimir arrays de strings
    public static void imprimirArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/* Ejercicio propuesto:
 * 1. Modificar el algoritmo para ordenar en orden descendente
 * 
 * 2. Implementar una versión que ordene objetos de una clase personalizada
 *    basándose en múltiples criterios (por ejemplo, estudiantes por edad
 *    y si tienen el mismo edad, por nombre)
 * 
 * 3. Agregar un contador que muestre cuántos desplazamientos se realizaron
 *    durante todo el proceso de ordenamiento
 * 
 * 4. Implementar una versión que maneje arrays de números decimales (double)
 *    con un criterio de comparación personalizado
 */