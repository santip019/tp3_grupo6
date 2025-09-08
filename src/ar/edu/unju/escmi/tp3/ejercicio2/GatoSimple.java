package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
    private String color;
    private float peso;
    private String raza;
    private int edad;
    private String nombre;
    private String sexo; // "macho" o "hembra"
    private String tamaño; // "pequeño", "mediano", "grande"

    public GatoSimple() {
        // Constructor por defecto
    }

    public GatoSimple(String nombre, String color, float peso, String raza, int edad, String sexo, String tamaño) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.tamaño = tamaño;
    }

    public void maullar() {
        System.out.println("Miauu");
    }

    public void ronronear() {
        System.out.println("prrrr");
    }

    public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println("Que rico ¡Gracias!!");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equalsIgnoreCase("hembra")) {
            System.out.println("No me gusta pelear");
        } else // es macho
        {
            if (gatoContrincante.sexo.equalsIgnoreCase("hembra")) {
                System.out.println("no peleo contra gatitas");
            } else // es macho
            {
                System.out.println("¡Ven aquí que te vas a enterar!");
            }
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Sexo: " + sexo);
        System.out.println("Tamaño: " + tamaño);
    }
}
// En el paquete correspondiente al ejercicio 2 crear la clase GatoSimple.
// Defina los atributos que tienen en común los gatos, por ejemplo: color, peso,
// raza, edad, nombre, sexo (macho o hembra), etc. Asigne el tipo de dato más
// conveniente para cada atributo. Todos los atributos se declaran con
// modificador de acceso privado. Para saber qué métodos debemos implementar hay
// que preguntarse qué acciones están asociadas a los gatos. Los gatos maullan,
// ronronean, comen y si son machos se pelean entre ellos. Esos son los métodos
// que se deben definir en la clase. Cuando el gato maulla, se muestra un
// mensaje “Miauu”. Cuando el gato ronronea, se muestra un mensaje
// “prrrr”.Cuando el gato come, aquí hay que enviar al método una cadena que
// represente la comida (esto es un parámetro para el método), por ejemplo
// “gelatina”. Vamos a suponer que a todos los gatos les gusta el “pescado”.
// Cuando el método recibe comida como “pescado” se debe mostrar “Que rico
// ¡Gracias!!”, si recibe cualquier otra comida se muestra “Lo siento, yo solo
// como pescado”. Cuando el gato pelea, el método debe recibir otra instancia
// (objeto) de la clase GatoSimple el nombre será gatoContrincante (es un
// parámetro para el método). Si el sexo de nuestro gato es “hembra” se debe
// mostrar “No me gusta pelear” Si el sexo de nuestro gato es “macho” vamos a
// preguntar si el sexo de gatoContrincante es “hembra”, si es así mostraremos
// “no peleo contra gatitas”. Si el sexo de gatoContrincante es “macho” mostrar
// “¡Ven aquí que te vas a enterar!”. Recordar la nomenclatura para los nombres
// de los métodos (se deben expresar con un verbo en infinitivo). Declarar
// dentro de la clase un constructor parametrizado para inicializar todos los
// atributos de la clase.