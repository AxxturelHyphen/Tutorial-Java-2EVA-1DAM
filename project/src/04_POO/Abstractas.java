/**
 * Demostración de Clases Abstractas en Java
 * Este archivo muestra el uso de clases y métodos abstractos.
 */
public class Abstractas {
    public static void main(String[] args) {
        // No se puede instanciar una clase abstracta
        // FiguraGeometrica figura = new FiguraGeometrica(); // Error
        
        // 1. Crear objetos de clases concretas
        System.out.println("=== Figuras Geométricas ===");
        Rectangulo rect = new Rectangulo(5, 3);
        Triangulo tri = new Triangulo(4, 6);
        CirculoAbs circ = new CirculoAbs(2.5);
        
        // 2. Calcular y mostrar áreas
        System.out.println("\n=== Cálculo de Áreas ===");
        rect.calcularArea();
        tri.calcularArea();
        circ.calcularArea();
        
        // 3. Usar métodos no abstractos
        System.out.println("\n=== Información de Figuras ===");
        rect.mostrarInformacion();
        tri.mostrarInformacion();
        circ.mostrarInformacion();
        
        // 4. Polimorfismo con clases abstractas
        System.out.println("\n=== Polimorfismo ===");
        FiguraGeometrica[] figuras = {rect, tri, circ};
        
        for (FiguraGeometrica fig : figuras) {
            fig.calcularArea();
            fig.mostrarInformacion();
        }
    }
}

// Clase abstracta base
abstract class FiguraGeometrica {
    protected String nombre;
    protected double area;
    
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
        this.area = 0;
    }
    
    // Método abstracto - debe ser implementado por las clases hijas
    public abstract void calcularArea();
    
    // Método concreto - puede ser heredado sin cambios
    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + area);
    }
}

// Clase concreta Rectángulo
class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        area = base * altura;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}

// Clase concreta Triángulo
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}

// Clase concreta Círculo
class CirculoAbs extends FiguraGeometrica {
    private double radio;
    
    public CirculoAbs(double radio) {
        super("Círculo");
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        area = Math.PI * radio * radio;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Radio: " + radio);
    }
}

/* Ejercicio propuesto:
 * 1. Crear una jerarquía de personajes para un juego:
 *    - Clase abstracta Personaje con métodos abstractos:
 *      - atacar()
 *      - defender()
 *      - usarHabilidadEspecial()
 *    - Clases concretas: Guerrero, Mago, Arquero
 * 
 * 2. Crear un sistema de pagos:
 *    - Clase abstracta MetodoPago con método abstracto:
 *      - procesarPago(double cantidad)
 *    - Clases concretas: TarjetaCredito, PayPal, Efectivo
 * 
 * 3. Crear un sistema de notificaciones:
 *    - Clase abstracta Notificacion con método abstracto:
 *      - enviar(String mensaje)
 *    - Clases concretas: Email, SMS, NotificacionPush
 */