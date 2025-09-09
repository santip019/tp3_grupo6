package ar.edu.unju.escmi.tp3.ejercicio4;

// Clase que representa un cliente
public class Cliente {
    private int dni; // Documento del cliente
    private String nombre; // Nombre del cliente
    private char categoria; // Categoría del cliente

    // Constructor con parametros para inicializar los datos del cliente
    public Cliente(int dni, String nombre, char categoria){
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Métodos getter para acceder a los atributos
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public char getCategoria() {
        return categoria;
    }
    
    // Muestra los datos del cliente en formato legible
    @Override
    public String toString() {
        return "Cliente: "+ nombre + "\n" + "DNI: " + dni + "\n" + "Categoria: " + categoria + "\n";

    }
}