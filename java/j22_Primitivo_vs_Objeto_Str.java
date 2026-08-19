public class j22_Primitivo_vs_Objeto_Str {

    public static void main(String[] args) {

        // ===================================================
        // 1. TIPO PRIMITIVO (char) - "Un solo carácter simple"
        // ===================================================
        // Se declara con comillas SIMPLES (' ')
        char letraPrimitiva = 'a';

        System.out.println("--- Tipo primitivo o simple (char) ---");
        System.out.println("Valor: " + letraPrimitiva);

        // Si escribes "letraPrimitiva."...
        // ❌ No pasa nada: un char solo guarda ese símbolo en memoria, no tiene métodos.


        // ===================================================
        // 2. OBJETO (String) - "Texto completo con herramientas"
        // ===================================================
        // Se declara con comillas DOBLES (" ")
        String textoObjeto = "Hola Java";

        System.out.println("\n--- OBJETO (String) ---");
        System.out.println("Valor: " + textoObjeto);

        // ✅ Al ser un OBJETO, tiene decenas de métodos (herramientas) usando el punto (.):

        // Herramienta 1: Saber cuántos caracteres tiene (.length())
        System.out.println("Largo del texto: " + textoObjeto.length() + " caracteres"); //lenght(textoObjeto)//

        // Herramienta 2: Convertir todo a mayúsculas (.toUpperCase())
        System.out.println("En mayúsculas: " + textoObjeto.toUpperCase());

        // Herramienta 3: Reemplazar letras (.replace())
        System.out.println("Reemplazar 'a' por 'o': " + textoObjeto.replace('a', 'o'));

        // Herramienta 4: Saber si contiene una palabra (.contains())
        System.out.println("¿Contiene la palabra 'Java'?: " + textoObjeto.contains("Java"));

        // Herramienta 2: Convertir todo a mayúsculas (.toLowerCase())
        System.out.println("En minúsculas: " + textoObjeto.toLowerCase());
    }
}
