package mundopc.modelo;

public class Computadora {
    private int idComputadorta;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    private Computadora (){
        idComputadorta = ++contadorComputadoras;
    }

    public Computadora (String nombre,Monitor monitor,Teclado teclado,Raton raton){
     this();
     this.nombre = nombre;
     this.monitor = monitor;
     this.teclado = teclado;
     this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{\n" +
                " idComputadorta=" + idComputadorta +
                ",  nombre='" + nombre + '\'' +
                ", \n   monitor=" + monitor +
                ", \n   teclado=" + teclado +
                ", \n   raton=" + raton +
                '}';
    }
}
