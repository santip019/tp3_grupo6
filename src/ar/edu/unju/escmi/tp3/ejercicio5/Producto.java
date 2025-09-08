package ar.edu.unju.escmi.tp3.ejercicio5;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    public Producto() {
    }

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

    public String toString(){
        return "Producto: código=" + codigo + ", descripción=" + descripcion + ", precio=" + precio;
    }
}
