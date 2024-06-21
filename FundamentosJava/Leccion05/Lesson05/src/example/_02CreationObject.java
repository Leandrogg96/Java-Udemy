package example;

public class _02CreationObject {
    public static void main(String[] args) {
        _01CreationClass.persona1.nombre = "Juan";
        _01CreationClass.persona1.apellidoMaterno = "Perez";
        _01CreationClass.persona1.apellidoPaterno = "Gerez";
        _01CreationClass.persona1.desplegarNombre();

        System.out.println("");

        _01CreationClass.persona2.nombre = "Leandro";
        _01CreationClass.persona2.apellidoMaterno = "Varela";
        _01CreationClass.persona2.apellidoPaterno = "Gallac";
        _01CreationClass.persona2.desplegarNombre();

    }
}

