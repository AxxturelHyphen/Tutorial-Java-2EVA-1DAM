/**
 * Demostración de Clases en Java
 * Este archivo muestra los conceptos básicos de la Programación Orientada a Objetos.
 */
public class Clases {
    public static void main(String[] args) {
        // 1. Crear objetos de la clase Persona
        System.out.println("=== Creación de Objetos ===");
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Ana", 30);
        
        // Mostrar información
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        
        // 2. Modificar atributos
        System.out.println("\n=== Modificación de Atributos ===");
        persona1.setEdad(26);
        persona1.mostrarInformacion();
        
        // 3. Usar métodos
        System.out.println("\n=== Uso de Métodos ===");
        persona1.cumplirAnos();
        persona1.mostrarInformacion();
        
        // 4. Crear objeto usando constructor alternativo
        System.out.println("\n=== Constructor Alternativo ===");
        Persona persona3 = new Persona("Carlos");
        persona3.mostrarInformacion();
        
        // 5. Usar método estático
        System.out.println("\n=== Método Estático ===");
        System.out.println("Número de personas creadas: " + Persona.getContadorPersonas());
    }
}

class Persona {
    // Atributos de instancia
    private String nombre;
    private int edad;
    
    // Atributo estático
    private static int contadorPersonas = 0;
    
    // Constructor principal
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++;
    }
    
    // Constructor sobrecargado
    public Persona(String nombre) {
        this(nombre, 0); // Llamada al constructor principal
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
    // Método estático
    public static int getContadorPersonas() {
        return contadorPersonas;
    }
    
    // Métodos de instancia
    public void cumplirAnos() {
        edad++;
        System.out.println(nombre + " ha cumplido años.");
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

/* Ejercicio propuesto:
 * 1. Crear una clase Cuenta que represente una cuenta bancaria con:
 *    - Atributos: número de cuenta, saldo, titular
 *    - Métodos: depositar, retirar, consultar saldo
 *    - Constructor que valide el saldo inicial
 *    - Método estático para transferir entre cuentas
 * 
 * 2. Crear una clase Libro con:
 *    - Atributos: título, autor, año, ISBN
 *    - Constructor que valide el ISBN
 *    - Método para prestar y devolver el libro
 *    - Método estático para buscar libros por autor
 * 
 * 3. Crear una clase Tiempo que maneje horas, minutos y segundos:
 *    - Métodos para sumar y restar tiempos
 *    - Método para convertir a segundos
 *    - Método para mostrar en formato 24h y 12h
 */