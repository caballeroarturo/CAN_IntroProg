public class j21_Primitivo_vs_Objetos {

    public static void main(String[] args) {

        // ==========================================
        // 1. TIPO PRIMITIVO (int) - "Solo el valor"
        // ==========================================
        int edadPrimitiva = 25;

        System.out.println("--- Tipo de dato primitivo ---");
        System.out.println("Valor: " + edadPrimitiva);

        // Si intentas poner "edadPrimitiva." para usar un método/función...
        // ❌ ¡No puedes! No tiene métodos. Solo guarda el número 25.


        // ==========================================
        // 2. OBJETO / WRAPPER (Integer) - "Valor + Herramientas"
        // ==========================================
        Integer edadObjeto = 25; // Java lo envuelve como Objeto automáticamente

        System.out.println("\n--- OBJETO (Integer) ---");
        System.out.println("Valor: " + edadObjeto);

        // ✅ Al ser un OBJETO, podemos usar el punto (.) para usar sus herramientas:

        // Herramienta 1: Convertir el número a texto (String)
        String texto = edadObjeto.toString(); // toString(edadObjeto)  //
        System.out.println("Convierte el objeto Integer en objeto String: " + texto);
        /*
        25
        "25"
        */
        System.out.println("Convertido a texto (longitud): " + texto.length() + " caracteres");

        // Herramienta 2: Comparar con otro número usando un método (función)
        int comparacion = edadObjeto.compareTo(30); 
        // Devuelve un número negativo porque 25 es menor a 30
        System.out.println("¿Es menor que 30?: " + (comparacion < 0));

        // Herramienta 3: Consultar constantes de la clase Integer
        System.out.println("Número entero máximo que soporta Java: " + Integer.MAX_VALUE);
    }

}
