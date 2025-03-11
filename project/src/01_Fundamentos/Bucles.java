/**
 * Demostración de Bucles en Java
 * Este archivo muestra los diferentes tipos de bucles y su uso.
 */
public class Bucles {
    public static void main(String[] args) {
        // 1. Bucle for
        System.out.println("=== Bucle for ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }
        
        // 2. Bucle while
        System.out.println("\n=== Bucle while ===");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        
        // 3. Bucle do-while
        System.out.println("\n=== Bucle do-while ===");
        int numero = 1;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
        
        // 4. for-each (enhanced for)
        System.out.println("\n=== Bucle for-each ===");
        String[] frutas = {"Manzana", "Banana", "Naranja", "Uva"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
        
        // 5. Bucles anidados
        System.out.println("\n=== Bucles anidados ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        // Ejercicio propuesto:
        /*
         * 1. Usar un bucle for para imprimir los números pares del 2 al 10
         * 2. Usar un bucle while para contar hacia atrás desde 5 hasta 1
         * 3. Crear un array de 5 nombres y usar for-each para imprimirlos
         * 4. Usar bucles anidados para crear un patrón de asteriscos:
         *    *
         *    **
         *    ***
         */
    }
}