/**
 * Demostración de ArrayDeque en Java
 * Este archivo muestra el uso de ArrayDeque como pila y cola.
 */
import java.util.ArrayDeque;

public class ArrayDeque {
    public static void main(String[] args) {
        // 1. Usar ArrayDeque como Pila (LIFO)
        System.out.println("=== ArrayDeque como Pila ===");
        ArrayDeque<String> pila = new ArrayDeque<>();
        
        // Agregar elementos (push)
        pila.push("Primero");
        pila.push("Segundo");
        pila.push("Tercero");
        
        System.out.println("Pila: " + pila);
        
        // Obtener y eliminar el último elemento (pop)
        String ultimoElemento = pila.pop();
        System.out.println("Elemento extraído: " + ultimoElemento);
        System.out.println("Pila después de pop: " + pila);
        
        // Ver el último elemento sin eliminarlo (peek)
        String tope = pila.peek();
        System.out.println("Elemento en el tope: " + tope);
        
        // 2. Usar ArrayDeque como Cola (FIFO)
        System.out.println("\n=== ArrayDeque como Cola ===");
        ArrayDeque<String> cola = new ArrayDeque<>();
        
        // Agregar elementos al final (offer)
        cola.offer("Primero");
        cola.offer("Segundo");
        cola.offer("Tercero");
        
        System.out.println("Cola: " + cola);
        
        // Obtener y eliminar el primer elemento (poll)
        String primerElemento = cola.poll();
        System.out.println("Elemento extraído: " + primerElemento);
        System.out.println("Cola después de poll: " + cola);
        
        // Ver el primer elemento sin eliminarlo (peek)
        String primero = cola.peek();
        System.out.println("Primer elemento: " + primero);
        
        // 3. Operaciones adicionales
        System.out.println("\n=== Operaciones Adicionales ===");
        ArrayDeque<Integer> numeros = new ArrayDeque<>();
        
        // Agregar elementos
        numeros.addFirst(1);  // Agregar al principio
        numeros.addLast(2);   // Agregar al final
        numeros.addFirst(0);  // Agregar al principio
        numeros.addLast(3);   // Agregar al final
        
        System.out.println("Deque: " + numeros);
        
        // Obtener elementos sin eliminar
        System.out.println("Primer elemento: " + numeros.getFirst());
        System.out.println("Último elemento: " + numeros.getLast());
        
        // Eliminar elementos específicos
        numeros.removeFirst(); // Eliminar el primero
        numeros.removeLast();  // Eliminar el último
        
        System.out.println("Deque después de eliminar: " + numeros);
        
        // 4. Ejemplo práctico: Historial de navegación
        System.out.println("\n=== Ejemplo: Historial de Navegación ===");
        ArrayDeque<String> historial = new ArrayDeque<>();
        
        // Navegar a páginas
        historial.push("www.google.com");
        historial.push("www.wikipedia.org");
        historial.push("www.github.com");
        
        System.out.println("Historial: " + historial);
        
        // Retroceder (simular botón "Atrás")
        String paginaAnterior = historial.pop();
        System.out.println("Retrocediendo desde: " + paginaAnterior);
        System.out.println("Página actual: " + historial.peek());
    }
}

/* Ejercicio propuesto:
 * 1. Implementar un sistema de deshacer/rehacer:
 *    - Usar dos ArrayDeque: uno para deshacer y otro para rehacer
 *    - Implementar métodos para:
 *      - Realizar una acción
 *      - Deshacer la última acción
 *      - Rehacer la última acción deshecha
 * 
 * 2. Crear un sistema de gestión de procesos:
 *    - Cada proceso tiene: ID, nombre, prioridad
 *    - Implementar una cola de prioridad usando ArrayDeque
 *    - Métodos para:
 *      - Agregar proceso
 *      - Ejecutar siguiente proceso
 *      - Mostrar cola de procesos
 * 
 * 3. Implementar un navegador web simplificado:
 *    - Mantener historial hacia adelante y atrás
 *    - Implementar métodos para:
 *      - Navegar a una nueva página
 *      - Ir hacia atrás
 *      - Ir hacia adelante
 *      - Mostrar historial
 */