package mundopc.modelo;

public class DispositivoEntrada {
    public String tipoDeEntrada;
    public String marca;

    public DispositivoEntrada(String tipoDeEntrada,String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    public String getTipoDeEntrada() {return tipoDeEntrada;}

    public void setTipoDeEntrada(String tipoDeEntrada) {this.tipoDeEntrada = tipoDeEntrada;}

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

