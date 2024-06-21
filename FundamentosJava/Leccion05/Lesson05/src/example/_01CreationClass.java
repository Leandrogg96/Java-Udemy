package example;

public class _01CreationClass {
    static Persona persona1 = new Persona();
    static Persona persona2 = new Persona();

    public _01CreationClass() {

    }
    public static class Persona {
        //Atributos de una clase
        //No es necesario asignar valores
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;

        //Constructor
        public Persona(String nombre, String apellidoMaterno, String apellidoPaterno){
            this.nombre = nombre;
            this.apellidoMaterno = apellidoMaterno;
            this.apellidoPaterno = apellidoPaterno;
        }

        public Persona() {

        }

        //Metodos de la clase
        //Los usaran los objetos de esta clase
        public void desplegarNombre() {
            System.out.println("Nombre : " + nombre);
            System.out.println("Apellido Paterno : " + apellidoPaterno);
            System.out.println("Apellido Materno : " + apellidoMaterno);
        }
    }
}
