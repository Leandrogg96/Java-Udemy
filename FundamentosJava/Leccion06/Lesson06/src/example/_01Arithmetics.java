package example;

public class _01Arithmetics {
    public int a;
    public int b;

    public static void main(String[] args) {
        _01Arithmetics aritmetic1 = new _01Arithmetics();

        aritmetic1.a = 3;
        aritmetic1.b = 8;

        aritmetic1.sumar();
        int resultado = aritmetic1.sumarConRetorno();
        System.out.println("-El resultado del metodo 'sumarConRetorno' es: " + resultado);

        resultado = aritmetic1.sumarConArgumentos(5, 8);
        System.out.println("-Resultado usando argumentos: " + resultado);

        aritmetic1.sumar();

    }

    public void sumar() {
        int resultado = a + b;
        System.out.println("-Resultado: " + resultado);
    }

    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }

    public int sumarConArgumentos(int a, int b){
        this.a = a;   // Modifica los atributos de la clase.
        this.b = b;
        return this.sumarConRetorno();
    }

}