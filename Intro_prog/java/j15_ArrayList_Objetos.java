
import java.util.ArrayList;

public class j15_ArrayList_Objetos {
    public static void main(String[] args) {
        // Creamos la lista para guardar objetos String
        ArrayList<String> autos = new ArrayList<>();

        // 1. Agregamos objetos
        autos.add("Toyota"); // Java trata a "Toyota" como un objeto String
        autos.add("Honda");

        // 2. Recuperamos un objeto por su posición
        String miAuto = autos.get(0); // Devuelve el objeto en la posición 0 ("Toyota")

        // 3. Eliminamos un objeto
        autos.remove("Honda"); // Busca y elimina el objeto "Honda"

        // 4. Verificamos cuántos objetos quedan en la lista
        System.out.println("Total de objetos guardados: " + autos.size());
    }
}

