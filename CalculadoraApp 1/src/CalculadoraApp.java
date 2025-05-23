import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true){
            System.out.println("**** Aplicación Calculadora ****");
            //Mostramos el menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion,consola);
                } else if (operacion == 5) {//Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                //Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            }//Fin try
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }// Fin While
    }//Fin main

    private static void mostrarMenu(){
        System.out.println("""
                  1.Suma
                  2.Multiplicacion
                  3.Multiplicación
                  4.Division
                  5.Salir
                  """);
        System.out.println("Operacion a realizar? ");
    }

    private static void ejecutarOperacion (int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { //Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> { //Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicación: " + resultado);
            }
            case 4 -> { //División
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);
            }
        }
    }
}//Fin clase

