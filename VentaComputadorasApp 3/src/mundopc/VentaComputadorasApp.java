package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor; //Desde donde se importan nuestras clases
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        //Crear objetos
        Raton ratonLenovo = new Raton("Bluetooht","Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("Bluetooth","Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo",27);
        //System.out.println(monitorLenovo);
        //Creamos un objeto de tipo Computadora
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
        //System.out.println(computadoraLenovo);

        //Agregamos objeto tipo computadora
        Monitor monitorDell = new Monitor("Dell",15);
        Teclado tecladoDell = new Teclado("USB","Dell");
        Raton ratonDell = new Raton("USB","Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell",monitorDell,tecladoDell,ratonDell);

        //Agregamos objeto tipo computadora
        Monitor monitorMac = new Monitor("Mac",27);
        Teclado tecladoMac = new Teclado("Bluetooth","Mac");
        Raton ratonMac = new Raton("Bluetooth","Mac");
        Computadora computadoraIMac = new Computadora("Computadora IMac",monitorMac,tecladoMac,ratonMac);

        //Creamos una nueva Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.agregarComputadora(computadoraDell);
        System.out.println();
        orden2.mostrarOrden();
    }
}