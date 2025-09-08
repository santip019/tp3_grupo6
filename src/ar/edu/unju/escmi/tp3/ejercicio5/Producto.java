package ar.edu.unju.escmi.tp3.ejercicio5;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    public Producto() {
        // Constructor por defecto
    }
    // Setters y Getters de cada atributo
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // tostring ---> va a ser la forma en la que se muestre el producto, llamado en Ejercicio5 como prod
    public String toString(){
        return "Producto: código=" + codigo + ", descripción=" + descripcion + ", precio=" + precio;
    }
}
