/**
 * Demostración de ArrayList en Java
 * Este archivo muestra el uso de ArrayList y sus operaciones.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListasArrayList {
    public static void main(String[] args) {
        // 1. Crear ArrayList
        System.out.println("=== Creación de ArrayList ===");
        ArrayList<String> nombres = new ArrayList<>();
        
        // 2. Agregar elementos
        System.out.println("\n=== Agregar Elementos ===");
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");
        System.out.println("Lista: " + nombres);
        
        // 3. Acceder a elementos
        System.out.println("\n=== Acceder a Elementos ===");
        System.out.println("Primer elemento: " + nombres.get(0));
        System.out.println("Último elemento: " + nombres.get(nombres.size() - 1));
        
        // 4. Modificar elementos
        System.out.println("\n=== Modificar Elementos ===");
        nombres.set(1, "María");
        System.out.println("Lista modificada: " + nombres);
        
        // 5. Eliminar elementos
        System.out.println("\n=== Eliminar Elementos ===");
        nombres.remove("Pedro");
        System.out.println("Lista después de eliminar: " + nombres);
        
        // 6. Buscar elementos
        System.out.println("\n=== Buscar Elementos ===");
        System.out.println("¿Contiene 'María'? " + nombres.contains("María"));
        System.out.println("Índice de 'Juan': " + nombres.indexOf("Juan"));
        
        // 7. Recorrer ArrayList
        System.out.println("\n=== Recorrer ArrayList ===");
        
        // Con for tradicional
        System.out.println("Con for tradicional:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        // Con for-each
        System.out.println("\nCon for-each:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        // Con Iterator
        System.out.println("\nCon Iterator:");
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        // 8. Operaciones con ArrayList
        System.out.println("\n=== Operaciones con ArrayList ===");
        
        // Ordenar
        Collections.sort(nombres);
        System.out.println("Lista ordenada: " + nombres);
        
        // Invertir
        Collections.reverse(nombres);
        System.out.println("Lista invertida: " + nombres);
        
        // Limpiar
        nombres.clear();
        System.out.println("Lista vacía: " + nombres);
        
        // 9. ArrayList de objetos
        System.out.println("\n=== ArrayList de Objetos ===");
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        estudiantes.add(new Estudiante("Juan", 20));
        estudiantes.add(new Estudiante("Ana", 22));
        
        for (Estudiante e : estudiantes) {
            System.out.println("Nombre: " + e.getNombre() + ", Edad: " + e.getEdad());
        }
    }
}

// Clase para ejemplo de ArrayList de objetos
class Estudiante {
    private String nombre;
    private int edad;
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
}

/* Ejercicio propuesto:
 * 1. Crear un programa que gestione una lista de tareas:
 *    - Cada tarea debe tener: título, descripción, estado
 *    - Implementar métodos para:
 *      - Agregar tarea
 *      - Marcar tarea como completada
 *      - Eliminar tarea
 *      - Listar tareas por estado
 * 
 * 2. Crear un programa que maneje un catálogo de libros:
 *    - Cada libro debe tener: título, autor, año, ISBN
 *    - Implementar métodos para:
 *      - Agregar/eliminar libros
 *      - Buscar por autor
 *      - Ordenar por año
 *      - Filtrar por década
 * 
 * 3. Crear un programa que gestione un registro de estudiantes:
 *    - Cada estudiante debe tener: nombre, ID, calificaciones
 *    - Implementar métodos para:
 *      - Calcular promedio
 *      - Encontrar mejor estudiante
 *      - Agrupar por rango de calificaciones
 */