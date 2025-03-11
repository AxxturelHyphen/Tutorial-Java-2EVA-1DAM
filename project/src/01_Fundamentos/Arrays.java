/**
 * Demostración de Arrays en Java
 * Este archivo muestra los diferentes tipos de arrays y operaciones con ellos.
 */
public class Arrays {
    public static void main(String[] args) {
        // 1. Array unidimensional
        System.out.println("=== Array Unidimensional ===");
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        // Recorriendo array con for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        // 2. Array con inicialización directa
        System.out.println("\n=== Array con inicialización directa ===");
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        
        // Recorriendo con for-each
        for (String dia : dias) {
            System.out.println("Día: " + dia);
        }
        
        // 3. Array bidimensional (matriz)
        System.out.println("\n=== Array Bidimensional ===");
        int[][] matriz = new int[3][3];
        
        // Llenando la matriz
        int valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor++;
            }
        }
        
        // Mostrando la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // 4. Array tridimensional
        System.out.println("\n=== Array Tridimensional ===");
        int[][][] cubo = new int[2][2][2];
        
        // Llenando el cubo
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    cubo[i][j][k] = i + j + k;
                }
            }
        }

        // Ejercicio propuesto:
        /*
         * 1. Crear un array de 5 números enteros y calcular su suma y promedio
         * 2. Crear una matriz 2x2 y calcular su determinante
         * 3. Crear dos arrays y combinarlos en un tercer array
         * 4. Buscar el número mayor y menor en un array
         */
    }
}