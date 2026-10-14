public class User {

    String username;
    String email;
    int age;

    // No se puede tener dos constructores con exactamente los mismos parámetros,
    // aunque cambien el nombre de las variables o el código interno.

    // Constructor 1 (metodo) Una forma para poder crear usuarios
    User(){
        this.username = "Guest";
        this.email = "NA";
        this.age = 0;
    }

    // Constructor 2: es otro metodo que se llama igual y que si recibe unos parametros
    User(String username){
        // dato obtenido de los argumentos de mi método/constructor "User"
        this.username = username;

        // valor por defecto    
        this.email = "NA";
        this.age = 0;
    }


    // Constructor 3: es otro metodo que se llama igual que mi primer constructor y recibe más parametros
    User(String username, String email){
        // dato obtenido de los argumentos de mi método/constructor "User"
        this.username = username;
        this.email = email;

        // valor por defecto 
        this.age = 0;
    }


    User(String username, String email, int age){
        // dato obtenido de los argumentos de mi método/constructor "User"
        this.username = username;
        this.email = email;
        this.age = age;
        // no tiene valores por defecto

    }

    // Si necesitas cambiar la lógica de inicialización,
    // solo lo modificas en el constructor principal (el más completo), y
    // los demás heredan ese cambio automáticamente.
    // Evitas código duplicado y posibles errores.
}

