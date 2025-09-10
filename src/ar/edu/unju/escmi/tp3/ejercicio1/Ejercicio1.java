package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Se crea el objeto Scanner para leer datos desde la terminal
        byte op = 0; // Variable para la opción del menú
        Persona persona1 = null; // Variable para almacenar el objeto Persona y poder acceder a sus métodos 
 
        do {
            System.out.println("1 - Crear objeto con Constructor por defecto.");
            System.out.println("2 - Crear objeto con Constructor parametrizado");
            System.out.println("3 - Crear objeto con Constructor (dni, nombre, fecha de nacimiento)");
            System.out.println("4 - Mostrar personas");
            System.out.println("5 - Salir");
            System.out.println("Seleccione una opción: ");
            op = sc.nextByte();
            sc.nextLine();

            switch (op) {
                case 1:
                    persona1 = new Persona (); // Se crea un nuevo objeto Persona utilizando el constructor por defecto
                    
                    System.out.println("Ingrese DNI: ");
                    persona1.setDni(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese nombre: ");
                    persona1.setNombre(sc.nextLine());
                    System.out.println("Ingrese fecha de nacimiento [aaaa-mm-dd]: ");
                    persona1.setFechaDeNacimiento(LocalDate.parse(sc.next())); // Con .parse, se convierte el texto ingresado, en formato aaaa-mm-dd, en un objeto LocalDate
                    sc.nextLine();
                    System.out.println("Ingrese provincia: ");
                    persona1.setProvincia(sc.nextLine());
                    System.out.println("Ingrese domicilio: ");
                    persona1.setDomicilio(sc.nextLine());

                    break;
                case 2:
                    System.out.println("Ingrese DNI: ");
                    int dni2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.println("Ingrese fecha de nacimiento [aaaa-mm-dd]: ");
                    LocalDate fechaDeNacimiento2 = LocalDate.parse(sc.next());
                    sc.nextLine();
                    System.out.println("Ingrese provincia: ");
                    String provincia2 = sc.nextLine();
                    System.out.println("Ingrese domicilio: ");
                    String domicilio2 = sc.nextLine();

                    // Se crea un nuevo objeto Persona utilizando el constructor parametrizado con todos los atributos
                    persona1 = new Persona(dni2, nombre2, fechaDeNacimiento2, provincia2, domicilio2);

                    break;
                case 3:
                    System.out.println("Ingrese DNI: ");
                    int dni3 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese nombre: ");
                    String nombre3 = sc.nextLine();
                    System.out.println("Ingrese fecha de nacimiento [aaaa-mm-dd]: ");
                    LocalDate fechaDeNacimiento3 = LocalDate.parse(sc.nextLine());
                    
                    // Se crea un nuevo objeto Persona utilizando el constructor que recibe dni, nombre y fecha de nacimiento
                    persona1 = new Persona(dni3, nombre3, fechaDeNacimiento3);
                    
                    break;
                case 4:
                    persona1.mostrarDatos();
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción invalida");
            }

        } while (op != 5);

        sc.close(); // Se cierra el Scanner
    }
}
