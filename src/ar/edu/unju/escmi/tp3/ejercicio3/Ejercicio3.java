package ar.edu.unju.escmi.tp3.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        Empleado e = null; // Se inicializa en null para verificar si se ha creado un empleado
        int legajo=0; // Variable para almacenar el legajo del último empleado creado (fuera de la repetitiva para que alcance a los otros casos del switch)

        do {
            System.out.println("\n=== Menú de Opciones ===");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Aumentar Salario");
            System.out.println("3. Mostrar los datos del empleado");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextByte();
            sc.nextLine(); // Para limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese nombre del empleado: ");
                    String nombre = sc.nextLine();
                    System.out.print("\nIngrese legajo del empleado: ");
                    legajo = sc.nextInt();
                    System.out.print("\nIngrese salario del empleado: ");
                    float salario = sc.nextFloat();
                    sc.nextLine(); // Limpiar buffer
                    e = new Empleado(nombre, legajo, salario);
                    System.out.println("\nEmpleado creado con éxito.");
                    break;

                case 2:
                    if (e == null) {
                        System.out.println("\nPrimero debe crear un empleado.");
                        break;
                    }
                    System.out.print("\nIngrese legajo del empleado al que aumentar salario: ");
                    int legajoComparacion = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    if (legajoComparacion == legajo) {
                        e.aumentarSalario();
                        System.out.println("\nSalario aumentado.");
                    } else {
                        System.out.println("\nEl legajo ingresado NO corresponde con el último empleado creado.");
                    }
                    break;

                case 3:
                    if (e == null) {
                        System.out.println("\nPrimero debe crear un empleado.");
                    } else {
                        e.mostrarDatos();
                    }
                    break;

                case 4:
                    System.out.println("\nPrograma finalizado");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
        sc.close();
    }
}