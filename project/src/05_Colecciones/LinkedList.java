/**
 * Demostración de LinkedList en Java
 * Este archivo muestra el uso de LinkedList y sus operaciones.
 */
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {
        // 1. Crear LinkedList
        System.out.println("=== Creación de LinkedList ===");
        LinkedList<String> lista = new LinkedList<>();
        
        // 2. Agregar elementos
        System.out.println("\n=== Agregar Elementos ===");
        lista.add("Primero");
        lista.addFirst("Nuevo Primero");
        lista.addLast("Último");
        lista.add(1, "Intermedio");
        
        System.out.println("Lista: " + lista);
        
        // 3. Acceder a elementos
        System.out.println("\n=== Acceder a Elementos ===");
        System.out.println("Primer elemento: " + lista.getFirst());
        System.out.println("Último elemento: " + lista.getLast());
        System.out.println("Elemento en posición 1: " + lista.get(1));
        
        // 4. Modificar elementos
        System.out.println("\n=== Modificar Elementos ===");
        lista.set(1, "Nuevo Intermedio");
        System.out.println("Lista modificada: " + lista);
        
        // 5. Eliminar elementos
        System.out.println("\n=== Eliminar Elementos ===");
        lista.removeFirst();
        lista.removeLast();
        lista.remove(1);
        System.out.println("Lista después de eliminar: " + lista);
        
        // 6. Operaciones de pila y cola
        System.out.println("\n=== Operaciones de Pila y Cola ===");
        LinkedList<Integer> numeros = new LinkedList<>();
        
        // Como pila
        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        System.out.println("Pila: " + numeros);
        System.out.println("Pop: " + numeros.pop());
        
        // Como cola
        numeros.offer(4);
        numeros.offer(5);
        System.out.println("Cola: " + numeros);
        System.out.println("Poll: " + numeros.poll());
        
        // 7. Recorrer LinkedList
        System.out.println("\n=== Recorrer LinkedList ===");
        
        // Con for-each
        System.out.println("Con for-each:");
        for (Integer num : numeros) {
            System.out.println(num);
        }
        
        // Con Iterator
        System.out.println("\nCon Iterator:");
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        // Con ListIterator (permite recorrer en ambas direcciones)
        System.out.println("\nCon ListIterator (reverso):");
        var lit = numeros.listIterator(numeros.size());
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
        
        // 8. LinkedList de objetos
        System.out.println("\n=== LinkedList de Objetos ===");
        LinkedList<Tarea> tareas = new LinkedList<>();
        
        tareas.add(new Tarea("Estudiar Java", "Alta"));
        tareas.add(new Tarea("Hacer ejercicio", "Media"));
        tareas.add(new Tarea("Leer libro", "Baja"));
        
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}

// Clase para ejemplo de LinkedList de objetos
class Tarea {
    private String descripcion;
    private String prioridad;
    
    public Tarea(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    
    @Override
    public String toString() {
        return "Tarea: " + descripcion + " (Prioridad: " + prioridad + ")";
    }
}

/* Ejercicio propuesto:
 * 1. Implementar una lista de reproducción de música:
 *    - Cada canción tiene: título, artista, duración
 *    - Implementar métodos para:
 *      - Agregar canciones al principio o final
 *      - Reproducir siguiente/anterior
 *      - Modo aleatorio
 *      - Repetir lista
 * 
 * 2. Crear un sistema de gestión de tareas pendientes:
 *    - Cada tarea tiene: descripción, prioridad, fecha
 *    - Implementar métodos para:
 *      - Agregar tareas por prioridad
 *      - Marcar tareas como completadas
 *      - Mover tareas arriba/abajo
 *      - Filtrar por estado/prioridad
 * 
 * 3. Implementar un editor de texto básico:
 *    - Usar LinkedList para almacenar el historial de cambios
 *    - Implementar métodos para:
 *      - Agregar/eliminar texto
 *      - Deshacer/rehacer cambios
 *      - Mostrar historial de cambios
 */