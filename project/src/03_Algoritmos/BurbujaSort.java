intercambio = true;
                }
            }
            
            if (!intercambio) {
                break;
            }
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
 *    basándose en alguna propiedad (por ejemplo, ordenar estudiantes por edad)
 * 
 * 3. Agregar un contador que muestre cuántos intercambios se realizaron
 *    durante todo el proceso de ordenamiento
 * 
 * 4. Implementar una versión que permita especificar si se desea ordenar
 *    en orden ascendente o descendente mediante un parámetro booleano
 */