package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[3];
        int contador = 0;
        byte opcion;
        do {
            System.out.println("\n=== Menú de Opciones ===");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Modificar precio de producto");
            System.out.println("4. Mostrar los productos que superen un precio");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextByte();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    if (contador < productos.length) {
                        Producto p = new Producto();

                        System.out.print("Ingrese código del producto: ");
                        p.setCodigo(sc.nextLine());

                        System.out.print("Ingrese descripción del producto: ");
                        p.setDescripcion(sc.nextLine());

                        System.out.print("Ingrese precio del producto: ");
                        p.setPrecio(sc.nextDouble());

                        productos[contador] = p;
                        contador++;
                        System.out.println("Producto creado con éxito.");
                    } else {
                        System.out.println("Ya no se pueden crear más productos (capacidad máxima alcanzada).");
                    }
                    break;

                case 2:
                    System.out.println("\n=== Lista de productos ===");
                    for (Producto prod : productos) {
                        if (prod != null) {
                            System.out.println(prod);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el código del producto a modificar: ");
                    String codigoBuscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Producto prod : productos) {
                        if (prod != null && prod.getCodigo().equals(codigoBuscar)) {
                            System.out.print("Ingrese el nuevo precio: ");
                            double nuevoPrecio = sc.nextDouble();
                            prod.setPrecio(nuevoPrecio);
                            System.out.println("Precio actualizado.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el precio mínimo: ");
                    double precioMin = sc.nextDouble();
                    System.out.println("\n=== Productos con precio mayor a " + precioMin + " ===");
                    for (Producto prod : productos) {
                        if (prod != null && prod.getPrecio() > precioMin) {
                            System.out.println(prod);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
        sc.close();
    }
}
