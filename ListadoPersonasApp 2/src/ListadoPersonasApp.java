import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Definimos la lista fuera del ciclo While
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
            salir = ejecutarOperacion(consola,personas);
            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }//Fin Catch
            System.out.println();
        }//Fin While
    }

    private static void mostrarMenu (){
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opción?: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //Revisamos la opcion proporcionada
        switch (opcion){
            case 1 -> {//Agregar persona a la lista
                System.out.print("Ingrese el nombre de la persona: ");
                var nombre = consola.nextLine();
                System.out.print("Ingrese el telefono de la persona: ");
                var tel = consola.nextLine();
                System.out.print("Ingrese el email de la persona: ");
                var email = consola.nextLine();
                //Crear el objeto Persona
                var persona = new Persona(nombre,tel,email);
                //Lo agregamos a la lista de personas
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }//Fin caso 1
            case 2 ->{//Listar las personas
                System.out.println("Listado de personas: ");
                //Mejora usando lambda y metodo de referencia, para recorrer el array e imprimir los valores
                //personas.forEach(persona -> System.out.println(persona));
                personas.forEach(System.out::println);//Sintaxis diferente para forEach
            }
            case 3 ->{//Salimos del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }//Fin switch
        return salir;
    }
}
