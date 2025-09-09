package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente clientes[] = new Cliente[4]; // Array para guardar hasta 4 clientes
        int op, c = 0; // op: opción del menú, c: cantidad de clientes registrados

        do {
            // Menú principal
            System.out.println("*** Menú ***");
            System.out.println("1 - Crear cliente");
            System.out.println("2 - Mostrar cliente por DNI");
            System.out.println("3 - Mostrar todos");
            System.out.println("4 - Mostrar clientes por categoría");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opción: ");
            op = sc.nextInt();

            switch (op) {

                case 1: // Crear cliente nuevo
                    if (c < 4) { // Verifica si hay espacio en el array
                        System.out.print("Ingrese DNI: ");
                        int dni = sc.nextInt();
                        sc.nextLine(); // Limpia el buffer
                        System.out.print("Ingrese Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese Categoría: ");
                        char categoria = sc.next().charAt(0);
                        clientes[c] = new Cliente(dni, nombre, categoria); // Crea y guarda el cliente
                        System.out.println("Cliente creado correctamente.");
                        c++;
                    } else {
                        System.out.println("No se pueden agregar más clientes.");
                    }
                    break;
                case 2: // Buscar cliente por DNI
                    System.out.print("Ingrese DNI del cliente a buscar: ");
                    int dniBuscar = sc.nextInt();
                    if (c >= 1) {
                        boolean encontrado = false;
                        for (Cliente cl : clientes) {
                            if (cl != null && cl.getDni() == dniBuscar) {
                                System.out.println("Cliente encontrado" + "\n" + cl);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró el DNI");
                        }
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;
                case 3: // Mostrar todos los clientes
                    if (c >= 1) {
                        System.out.println("Lista de clientes:");
                        for (Cliente cl : clientes) {
                            if (cl != null)
                            System.out.println(cl);
                        }
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;
                case 4: // Mostrar clientes por categoría
                    System.out.print("Ingrese Categoría a buscar: ");
                    char catBuscar = sc.next().charAt(0);
                    if (c >= 1) {
                        StringBuilder resultado = new StringBuilder();
                        for (Cliente cl : clientes) {
                            if (cl != null && cl.getCategoria() == catBuscar) {
                                resultado.append(cl).append("\n");
                            }
                        }
                        if (resultado.length() > 0) {
                            System.out.println("Clientes en categoría " + catBuscar + ":");
                            System.out.print(resultado);
                        } else {
                            System.out.println("No se encontraron clientes en esa categoría.");
                        }
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (op != 5);
        sc.close(); // Cierra el scanner al finalizar
    }
}