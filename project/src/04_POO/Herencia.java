/**
 * Demostración de Herencia en Java
 * Este archivo muestra los conceptos de herencia y sus características.
 */
public class Herencia {
    public static void main(String[] args) {
        // 1. Crear objetos de diferentes tipos
        System.out.println("=== Creación de Objetos ===");
        Animal animal = new Animal("Animal genérico");
        Perro perro = new Perro("Max", "Labrador");
        Gato gato = new Gato("Luna", 7);
        
        // 2. Llamar métodos heredados
        System.out.println("\n=== Métodos Heredados ===");
        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();
        
        // 3. Llamar métodos específicos
        System.out.println("\n=== Métodos Específicos ===");
        perro.jugar();
        gato.arañar();
        
        // 4. Usar super en constructores
        System.out.println("\n=== Uso de super ===");
        perro.mostrarInformacion();
        gato.mostrarInformacion();
        
        // 5. Demostrar polimorfismo
        System.out.println("\n=== Polimorfismo ===");
        Animal[] animales = {animal, perro, gato};
        for (Animal a : animales) {
            a.hacerSonido(); // Llamada polimórfica
        }
    }
}

// Clase base
class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }
}

// Clase derivada Perro
class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
    
    public void jugar() {
        System.out.println(nombre + " está jugando con una pelota");
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Raza: " + raza);
    }
}

// Clase derivada Gato
class Gato extends Animal {
    private int vidasRestantes;
    
    public Gato(String nombre, int vidasRestantes) {
        super(nombre);
        this.vidasRestantes = vidasRestantes;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
    
    public void arañar() {
        System.out.println(nombre + " está arañando el sofá");
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Vidas restantes: " + vidasRestantes);
    }
}

/* Ejercicio propuesto:
 * 1. Crear una jerarquía de clases para figuras geométricas:
 *    - Clase base Figura con método calcularArea()
 *    - Clases derivadas: Círculo, Rectángulo, Triángulo
 *    - Cada clase debe implementar su propio cálculo de área
 * 
 * 2. Crear una jerarquía de empleados:
 *    - Clase base Empleado con salario base
 *    - Clases derivadas: Gerente (bonus), Vendedor (comisión)
 *    - Método calcularSalario() en cada clase
 * 
 * 3. Crear una jerarquía de vehículos:
 *    - Clase base Vehiculo
 *    - Clases derivadas: Coche, Moto, Camion
 *    - Métodos para arrancar, acelerar, frenar
 */