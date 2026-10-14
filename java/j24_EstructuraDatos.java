import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class j24_EstructuraDatos {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.println(" 1. LISTAS (ArrayList): Ordenadas y repetibles");

        ArrayList colaEspera = new ArrayList<>();

        colaEspera.add("Firulais");
        colaEspera.add("Michi");
        colaEspera.add("Firulais"); // Permite duplicados (dos mascotas con el mismo nombre)
        
        System.out.println("Pacientes en espera: " + colaEspera);
        System.out.println("Primer paciente en ser atendido: " + colaEspera.get(0));


        System.out.println("-----------------------------------------");
        System.out.println(" 2. CONJUNTOS (HashSet): Elementos únicos");
        
        HashSet especiesRegistradas = new HashSet<>();

        especiesRegistradas.add("Perro");
        especiesRegistradas.add("Gato");
        especiesRegistradas.add("Perro"); // Intentamos duplicar "Perro", Java lo ignora

        System.out.println("Especies únicas en la clínica: " + especiesRegistradas);


        System.out.println("-----------------------------------------");
        System.out.println(" 3. MAPAS (HashMap): Pares de Clave -> Valor");
       
        // Clave: Código de la cita (String), Valor: Nombre del paciente (String)
        HashMap citasDelDia = new HashMap<>();
        
        citasDelDia.put("A-01", "Firulais");
        citasDelDia.put("A-02", "Michi");
        citasDelDia.put("A-03", "Lola");
        citasDelDia.put("A-04", "Lola");

        System.out.println("Citas registradas: " + citasDelDia);
        System.out.println("¿Quién tiene la cita A-02? " + citasDelDia.get("A-02"));
    }
}