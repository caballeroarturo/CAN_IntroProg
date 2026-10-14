public class Operaciones {

    // la variable resultado guardara el estado del objeto creado con esta clase
    // el estado inicial es 0
    private double resultado = 0;


    // Metodo sumar, toma el resultado inicial y le suma los numeros ingresados
    public void sumar(double... numeros) {
        for (double numero : numeros) {
            resultado += numero;
        }
        // No se pone aquí que imprima el resultado parcial para separar
        // responsabilidades, en Main se decide cuando mostrar el resultado
    }


    public void multiplicar(double numero) {
        resultado *= numero;
    }

    public void dividir(double numero) {

        if (numero == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return;
        }
        resultado /= numero;
    }

    public double obtenerResultado() {
        return resultado;
    }

    public void reiniciar() {
        resultado = 0;
    }

}
