package ar.edu.unju.escmi.tp3.ejercicio3;

public class Empleado {
    private String nombre;
    private int legajo;
    private float salario;

    final float salarioMinimo = 600000.00f;
    final float aumentoMeritos = 90000.00f;
    public Empleado(String nombre, int legajo, float salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        if (salario >= salarioMinimo){
            this.salario = salario;
        }
        else
            this.salario = salarioMinimo;
    }
    public void mostrarDatos(){
        System.out.println("\nNombre del empleado: "+ nombre+"\nLegajo: "+ legajo+"\nSalario $: "+salario);
    }
    public void aumentarSalario(){
        salario += aumentoMeritos;
    }
}
