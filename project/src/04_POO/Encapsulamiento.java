/**
 * Demostración de Encapsulamiento en Java
 * Este archivo muestra los principios de encapsulamiento y control de acceso.
 */
public class Encapsulamiento {
    public static void main(String[] args) {
        // 1. Crear cuenta bancaria
        System.out.println("=== Cuenta Bancaria ===");
        CuentaBancaria cuenta = new CuentaBancaria("123456", "Juan Pérez");
        
        // 2. Realizar operaciones
        System.out.println("\n=== Operaciones Bancarias ===");
        cuenta.depositar(1000);
        cuenta.mostrarSaldo();
        
        cuenta.retirar(500);
        cuenta.mostrarSaldo();
        
        // Intento de retiro mayor al saldo
        cuenta.retirar(1000);
        
        // 3. Acceder a información de la cuenta
        System.out.println("\n=== Información de la Cuenta ===");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Titular: " + cuenta.getTitular());
        
        // 4. Intentar modificar el saldo directamente (no es posible)
        // cuenta.saldo = 1000000; // Error: saldo es private
        
        // 5. Modificar el titular
        System.out.println("\n=== Modificación de Datos ===");
        cuenta.setTitular("Juan Pablo Pérez");
        System.out.println("Nuevo titular: " + cuenta.getTitular());
    }
}

class CuentaBancaria {
    // Atributos privados
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private boolean activa;
    
    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
        this.activa = true;
    }
    
    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public boolean isActiva() {
        return activa;
    }
    
    // Setters
    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }
    
    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    // Métodos de negocio
    public void depositar(double cantidad) {
        if (activa && cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado: $" + cantidad);
        } else {
            System.out.println("No se pudo realizar el depósito");
        }
    }
    
    public void retirar(double cantidad) {
        if (activa && cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado: $" + cantidad);
        } else {
            System.out.println("No se pudo realizar el retiro");
        }
    }
    
    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

/* Ejercicio propuesto:
 * 1. Crear una clase Empleado encapsulada con:
 *    - Atributos privados: id, nombre, salario, departamento
 *    - Getters y setters apropiados
 *    - Validaciones en los setters:
 *      - Salario no puede ser negativo
 *      - Nombre no puede estar vacío
 *      - ID debe tener un formato específico
 * 
 * 2. Crear una clase Producto encapsulada con:
 *    - Atributos privados: código, nombre, precio, stock
 *    - Métodos para:
 *      - Aumentar/reducir stock
 *      - Aplicar descuento
 *      - Validar precio mínimo
 * 
 * 3. Crear una clase Usuario encapsulada con:
 *    - Atributos privados: username, password, email, activo
 *    - Métodos para:
 *      - Cambiar contraseña (validar formato)
 *      - Validar email
 *      - Activar/desactivar cuenta
 */