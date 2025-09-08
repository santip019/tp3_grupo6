package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scaner = new Scanner(System.in);
        byte op;
        GatoSimple gato = null; // Se inicializa en null para verificar si se ha creado un gato
        do {
            System.out.println("\n **** Menu de Opciones ****");
            System.out.println("1 - Crear gato simple");
            System.out.println("2 - Dar de comer a un gato simple");
            System.out.println("3 - Mostrar todos los gatos");
            System.out.println("4 - Crear gato contrincante para pelear con un gato simple");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = scaner.nextByte();
            scaner.nextLine(); // Para limpiar el buffer del scanner

            switch (op) {
                case 1:
                    // Crear gato simple
                    System.out.print("Ingrese el nombre del gato: ");
                    String nombre = scaner.nextLine();

                    System.out.print("Ingrese el color del gato: ");
                    String color = scaner.nextLine();

                    System.out.print("Ingrese el peso del gato: ");
                    float peso = scaner.nextFloat();

                    System.out.print("Ingrese la raza del gato: ");
                    String raza = scaner.next();

                    System.out.print("Ingrese la edad del gato: ");
                    int edad = scaner.nextInt();

                    System.out.print("Ingrese el sexo del gato (macho/hembra): ");
                    String sexo = scaner.next();
                    if (!sexo.equalsIgnoreCase("macho") && !sexo.equalsIgnoreCase("hembra")) {
                        System.out.println("Sexo inválido. Debe ser 'macho' o 'hembra'.");
                        break;
                    }

                    System.out.print("Ingrese el tamaño del gato (pequeno/mediano/grande): ");
                    String tamaño = scaner.next();
                    if (!tamaño.equalsIgnoreCase("pequeno") && !tamaño.equalsIgnoreCase("mediano")
                            && !tamaño.equalsIgnoreCase("grande")) {
                        System.out.println("Tamaño inválido. Debe ser 'pequeno', 'mediano' o 'grande'.");
                        break;
                    }
                    gato = new GatoSimple(nombre, color, peso, raza, edad, sexo, tamaño);
                    System.out.println("El Gato fue creado exitosamente.");
                    Thread.sleep(2000); // Pausa de 2 segundos para que el usuario vea el mensaje
                    break;

                case 2:
                    // Dar de comer a un gato simple
                    if (gato == null) {
                        System.out.println("Debe crear un gato simple primero.");
                        break;
                    }

                    System.out.print("Ingrese la comida para el gato: ");
                    String comida = scaner.nextLine();
                    gato.comer(comida);
                    Thread.sleep(2000);
                    break;

                case 3:
                    // Mostrar todos los gatos
                    byte opcion;

                    if (gato == null) {
                        System.out.println("Debe crear un gato simple primero.");
                        break;
                    }

                    System.out.println("Datos del gato:");
                    gato.mostrarDatos();

                    System.out.println("Ingrese una opcion para escuchar al gato");
                    System.out.print("1 - Maullar, 2 - Ronronear): ");
                    opcion = scaner.nextByte();

                    if (opcion == 1) {
                        gato.maullar();
                    } else if (opcion == 2) {
                        gato.ronronear();
                    } else {
                        System.out.println("Opcion incorrecta.");
                    }
                    Thread.sleep(2000);
                    break;

                case 4:
                    // Crear gato contrincante para pelear con un gato simple
                    if (gato == null) {
                        System.out.println("Debe crear un gato simple primero.");
                        break;
                    }

                    System.out.print("Ingrese el nombre del gato contrincante: ");
                    String nombreC = scaner.nextLine();

                    System.out.print("Ingrese el color del gato contrincante: ");
                    String colorC = scaner.nextLine();

                    System.out.print("Ingrese el peso del gato contrincante: ");
                    float pesoC = scaner.nextFloat();

                    System.out.print("Ingrese la raza del gato contrincante: ");
                    String razaC = scaner.next();

                    System.out.print("Ingrese la edad del gato contrincante: ");
                    int edadC = scaner.nextInt();

                    System.out.print("Ingrese el sexo del gato contrincante (macho/hembra): ");
                    String sexoC = scaner.next();
                    if (!sexoC.equalsIgnoreCase("macho") && !sexoC.equalsIgnoreCase("hembra")) {
                        System.out.println("Sexo inválido. Debe ser 'macho' o 'hembra'.");
                        break;
                    }

                    System.out.print("Ingrese el tamaño del gato contrincante (pequeno/mediano/grande): ");
                    String tamañoC = scaner.next();
                    if (!tamañoC.equalsIgnoreCase("pequeno") && !tamañoC.equalsIgnoreCase("mediano")
                            && !tamañoC.equalsIgnoreCase("grande")) {
                        System.out.println("Tamaño inválido. Debe ser 'pequeno', 'mediano' o 'grande'.");
                        break;
                    }

                    GatoSimple gatoContrincante = new GatoSimple(nombreC, colorC, pesoC, razaC, edadC, sexoC, tamañoC);
                    gato.pelear(gatoContrincante);
                    Thread.sleep(2000);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (op != 5);

        scaner.close();
    }
}

// Dentro del paquete del ejercicio2 crear una clase con nombre Ejercicio2 que
// contenga el método main(). Dentro del método main() construir un menú de
// opciones para realizar las siguientes acciones:
// 1 – Crear gato simple.1: Solicitar al usuario que ingrese por la terminal los
// datos para crear un gato simple.
// 2 – Dar de comer a un gato simple. En la opción 2: Solicitar al usuario que
// ingrese por la terminal la comida que se pasará como parámetro al método que
// alimenta al gato (el gato que fue creado en la opción 1).
// 3 – Mostrar todos los gatos. En la opción 3: Se muestran todos los valores de
// los atributos del objeto gato y lo que devuelven los métodos maullar y
// ronronear.
// 4 – Crear gato contrincante para pelear con un gato simple. En la opción 4:
// Se debe ingresar por la terminal los datos del gato contrincante. Luego el
// objeto gato simple invocará al método pelear y le enviará el parámetro gato
// contrincante, el resultado se muestra por la terminal.
// 5 - Salir En la opción, El menú se muestra en todo momento de la ejecución
// hasta que el usuario ingrese la opción 5.