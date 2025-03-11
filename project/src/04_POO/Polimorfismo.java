/**
 * Demostración de Polimorfismo en Java
 * Este archivo muestra los diferentes tipos de polimorfismo.
 */
public class Polimorfismo {
    public static void main(String[] args) {
        // 1. Polimorfismo de sobrecarga
        System.out.println("=== Polimorfismo de Sobrecarga ===");
        Calculadora calc = new Calculadora();
        
        System.out.println("Suma de enteros: " + calc.sumar(5, 3));
        System.out.println("Suma de decimales: " + calc.sumar(5.5, 3.3));
        System.out.println("Suma de tres números: " + calc.sumar(1, 2, 3));
        
        // 2. Polimorfismo de sobreescritura
        System.out.println("\n=== Polimorfismo de Sobreescritura ===");
        Forma forma = new Forma();
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        
        forma.dibujar();
        circulo.dibujar();
        cuadrado.dibujar();
        
        // 3. Polimorfismo en tiempo de ejecución
        System.out.println("\n=== Polimorfismo en Tiempo de Ejecución ===");
        Forma[] formas = {new Forma(), new Circulo(), new Cuadrado()};
        
        for (Forma f : formas) {
            f.dibujar(); // Llamada polimórfica
        }
        
        // 4. Casting de objetos
        System.out.println("\n=== Casting de Objetos ===");
        Forma formaCirculo = new Circulo();
        formaCirculo.dibujar();
        
        if (formaCirculo instanceof Circulo) {
            Circulo circuloCast = (Circulo) formaCirculo;
            circuloCast.calcularArea(5);
        }
    }
}

// Clase para demostrar sobrecarga de métodos
class Calculadora {
    // Sobrecarga del método sumar
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

// Clases para demostrar sobreescritura
class Forma {
    public void dibujar() {
        System.out.println("Dibujando una forma");
    }
}

class Circulo extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
    
    public void calcularArea(double radio) {
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}

class Cuadrado extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}

/* Ejercicio propuesto:
 * 1. Crear una jerarquía de instrumentos musicales:
 *    - Clase base Instrumento con método tocar()
 *    - Clases derivadas: Guitarra, Piano, Bateria
 *    - Cada instrumento debe producir su propio sonido
 *    - Crear un método que reciba un array de instrumentos y los haga tocar
 * 
 * 2. Crear una clase Convertidor con métodos sobrecargados:
 *    - convertir(int metros) -> centímetros
 *    - convertir(double kilos) -> libras
 *    - convertir(String binario) -> decimal
 * 
 * 3. Crear una jerarquía de productos:
 *    - Clase base Producto con calcularPrecio()
 *    - Clases derivadas: ProductoNormal, ProductoDescuento, ProductoLujo
 *    - Cada uno con su propia implementación de calcularPrecio()
 */