/**
 * Demostración de Estructuras de Control en Java
 * Este archivo muestra las diferentes estructuras de control y su uso.
 */
public class EstructurasControl {
    public static void main(String[] args) {
        // 1. if-else simple
        System.out.println("=== if-else simple ===");
        int edad = 18;
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        // 2. if-else-if
        System.out.println("\n=== if-else-if ===");
        int nota = 85;
        
        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 80) {
            System.out.println("Notable");
        } else if (nota >= 70) {
            System.out.println("Bien");
        } else if (nota >= 60) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }
        
        // 3. switch
        System.out.println("\n=== switch ===");
        int dia = 3;
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Día inválido");
        }

        // Ejercicio propuesto:
        /*
         * 1. Crear una variable para almacenar una calificación (0-100)
         * 2. Usar if-else para mostrar:
         *    - "Excelente" si es mayor a 90
         *    - "Bien" si está entre 70 y 90
         *    - "Necesita mejorar" si es menor a 70
         * 3. Crear una variable mes (1-12) y usar switch para mostrar la estación
         */
    }
}