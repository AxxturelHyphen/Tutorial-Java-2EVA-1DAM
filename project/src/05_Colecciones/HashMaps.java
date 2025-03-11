/**
 * Demostración de HashMap en Java
 * Este archivo muestra el uso de HashMap y sus operaciones.
 */
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // 1. Crear HashMap
        System.out.println("=== Creación de HashMap ===");
        HashMap<String, Integer> edades = new HashMap<>();
        
        // 2. Agregar elementos
        System.out.println("\n=== Agregar Elementos ===");
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Pedro", 35);
        System.out.println("Mapa: " + edades);
        
        // 3. Acceder a elementos
        System.out.println("\n=== Acceder a Elementos ===");
        System.out.println("Edad de Juan: " + edades.get("Juan"));
        System.out.println("Edad de María (no existe): " + edades.get("María"));
        System.out.println("Edad de María (con valor por defecto): " + 
                         edades.getOrDefault("María", 0));
        
        // 4. Modificar elementos
        System.out.println("\n=== Modificar Elementos ===");
        edades.put("Juan", 26); // Sobrescribe el valor anterior
        System.out.println("Nueva edad de Juan: " + edades.get("Juan"));
        
        // 5. Eliminar elementos
        System.out.println("\n=== Eliminar Elementos ===");
        edades.remove("Pedro");
        System.out.println("Mapa después de eliminar a Pedro: " + edades);
        
        // 6. Verificar existencia
        System.out.println("\n=== Verificar Existencia ===");
        System.out.println("¿Contiene a Juan? " + edades.containsKey("Juan"));
        System.out.println("¿Contiene edad 30? " + edades.containsValue(30));
        
        // 7. Recorrer HashMap
        System.out.println("\n=== Recorrer HashMap ===");
        
        // Recorrer claves
        System.out.println("Claves:");
        for (String nombre : edades.keySet()) {
            System.out.println(nombre);
        }
        
        // Recorrer valores
        System.out.println("\nValores:");
        for (Integer edad : edades.values()) {
            System.out.println(edad);
        }
        
        // Recorrer pares clave-valor
        System.out.println("\nPares clave-valor:");
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        
        // 8. HashMap de objetos
        System.out.println("\n=== HashMap de Objetos ===");
        HashMap<String, Estudiante2> estudiantes = new HashMap<>();
        
        estudiantes.put("001", new Estudiante2("Juan", 20));
        estudiantes.put("002", new Estudiante2("Ana", 22));
        
        for (Map.Entry<String, Estudiante2> entrada : estudiantes.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + 
                             ", Nombre: " + entrada.getValue().getNombre() +
                             ", Edad: " + entrada.getValue().getEdad());
        }
        
        // 9. Operaciones adicionales
        System.out.println("\n=== Operaciones Adicionales ===");
        
        // Tamaño del mapa
        System.out.println("Tamaño del mapa: " + edades.size());
        
        // Verificar si está vacío
        System.out.println("¿Está vacío? " + edades.isEmpty());
        
        // Limpiar el mapa
        edades.clear();
        System.out.println("Mapa después de limpiar: " + edades);
    }
}

// Clase para ejemplo de HashMap de objetos
class Estudiante2 {
    private String nombre;
    private int edad;
    
    public Estudiante2(String nombre, int edad) {
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
 * 1. Crear un programa que gestione un diccionario:
 *    - Almacenar palabras y sus definiciones
 *    - Implementar métodos para:
 *      - Agregar nuevas palabras
 *      - Buscar definiciones
 *      - Actualizar definiciones
 *      - Mostrar palabras por inicial
 * 
 * 2. Crear un programa que maneje un inventario:
 *    - Cada producto tiene: código, nombre, precio, cantidad
 *    - Implementar métodos para:
 *      - Agregar/eliminar productos
 *      - Actualizar stock
 *      - Calcular valor total
 *      - Listar productos agotados
 * 
 * 3. Crear un programa que gestione una agenda telefónica:
 *    - Almacenar contactos con múltiples números
 *    - Implementar métodos para:
 *      - Agregar/eliminar contactos
 *      - Agregar números a contactos existentes
 *      - Buscar por nombre o número
 *      - Agrupar por inicial
 */