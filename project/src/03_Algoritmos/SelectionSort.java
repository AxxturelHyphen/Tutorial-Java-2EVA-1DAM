/**
 * Implementación del Algoritmo de Ordenamiento por Selección
 * Este archivo muestra la implementación y uso del algoritmo Selection Sort.
 */
public class SelectionSort {
    public static void main(String[] args) {
        // Array de ejemplo
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array original:");
        imprimirArray(numeros);
        
        // Aplicar ordenamiento por selección
        selectionSort(numeros);
        
        System.out.println("\nArray ordenado:");
        imprimirArray(numeros);
        
        // Ejemplo con array de strings
        String[] nombres = {"Zara", "Ana", "Pedro", "Juan", "Carla"};
        
        System.out.println("\nArray de nombres original:");
        imprimirArray(nombres);
        
        // Aplicar ordenamiento por selección a strings
        selectionSort(nombres);
        
        System.out.println("\nArray de nombres ordenado:");
        imprimirArray(nombres);
    }
    
    // Implementación de Selection Sort para enteros
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el elemento mínimo en el array no ordenado
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            // Intercambiar el elemento mínimo encontrado con el primer
            // elemento del array no ordenado
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            
            // Mostrar el estado del array después de cada selección
            System.out.println("Después de la selección " + (i + 1) + ":");
            imprimirArray(arr);
        }
    }
    
    // Implementación de Selection Sort para strings
    public static void selectionSort(String[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            
            String temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
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
 *    basándose en múltiples criterios, usando un comparador personalizado
 * 
 * 3. Agregar un contador que muestre cuántas comparaciones se realizaron
 *    durante todo el proceso de ordenamiento
 * 
 * 4. Implementar una versión que permita ordenar solo una porción del array,
 *    especificando índices de inicio y fin
 */