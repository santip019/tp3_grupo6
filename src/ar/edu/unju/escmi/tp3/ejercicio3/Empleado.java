package ar.edu.unju.escmi.tp3.ejercicio3;

public class Empleado {
    // Atributos privados para encapsular los datos del empleado
    private String nombre;
    private int legajo;
    private float salario;
    //Constantes para salario minimo y aumento por meritos
    final float salarioMinimo = 600000.00f;
    final float aumentoMeritos = 90000.00f;
    //Constructor parametrizado
    public Empleado(String nombre, int legajo, float salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        //Se asigna salario minimo si el salario ingresado es menor al salario minimo
        if (salario >= salarioMinimo){
            this.salario = salario;
        }
        else
            this.salario = salarioMinimo;
    }
    //Se muestran por consola los datos del empleado
    public void mostrarDatos(){
        System.out.println("\nNombre del empleado: "+ nombre+"\nLegajo: "+ legajo+"\nSalario $: "+salario);
    }
    //Se incrementa el salario con el aumento por merito
    public void aumentarSalario(){
        salario += aumentoMeritos;
    }
    {/*
    En el paquete correspondiente al ejercicio 3 crear la clase Empleado.
    Dentro de la clase declare los atributos nombre, legajo y salario. El modificador de acceso para
    estos atributos es privado.
    Declare 2 constantes dentro de la clase, la primera constante define el salario mínimo y tiene un
    valor de 600.000,00$. La segunda constante define un aumento por méritos con un valor de
    90.000,00$
    Declare un constructor parametrizado para inicializar los atributos. Dentro del constructor agregar
    la lógica para realizar la asignación del salario.
    Si el parámetro salario es mayor o igual al salario mínimo entonces asignar al atributo salario el
    valor del parámetro salario.
    Si el parámetro salario es menor que el salario mínimo entonces asignar al atributo salario el valor
    de la constante salario mínimo.
    Construya un método que permita mostrar los datos del empleado, ejemplo:
    Nombre del empleado: Juan Perez
    Legajo: 1245
    Salario $: 350.000,75
    Construya un método que permita dar un aumento al salario del empleado. Se incrementa el
    salario sumándole la constante aumento por méritos.
    */}
}
