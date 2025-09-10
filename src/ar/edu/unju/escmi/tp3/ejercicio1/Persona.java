package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String domicilio;
    private String provincia;
    
    // Constructor por defecto
    public Persona() {
    }

    // Constructor parametrizado con todos los atributos
    public Persona(int dni, String nombre, LocalDate fechaDeNacimiento, String domicilio, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.domicilio = domicilio;
        this.provincia = provincia;
    }

    // Constructor parametrizado con solo dni, nombre y fecha de nacimiento
    // Se asigna "Jujuy" como provincia por defecto
    public Persona(int dni, String nombre, LocalDate fechaDeNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.provincia="Jujuy";
    }

    // Métodos getters y setters para cada atributo
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Calcula la edad de la persona usando la fecha de nacimiento
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now(); // Obtiene la fecha actual del sistema
        Period periodo = Period.between(fechaDeNacimiento, fechaActual); // Calcula el período entre la fecha de nacimiento y la fecha actual
        int edad = periodo.getYears(); // Obtiene la edad a partir del período calculado
        return edad;
    }

    // Verifica si la persona es mayor de edad (18 años o más)
    public boolean verificarEdad(){
        if(calcularEdad()>=18)
            return true;
        else
            return false;
    }

    // Muestra los datos de la persona por consola
    public void mostrarDatos(){
        System.out.println("\n--------------------------");
        System.out.println("DNI: "+dni);
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de nacimiento: "+fechaDeNacimiento);
        System.out.println("Domicilio: "+domicilio);
        System.out.println("Provincia: "+provincia);
        System.out.println("Edad: "+calcularEdad()+" años");
        if(verificarEdad()==true)
            System.out.println("La persona es mayor de edad");
        else
            System.out.println("La persona no es mayor de edad");
        System.out.println("--------------------------\n");
    }
}
