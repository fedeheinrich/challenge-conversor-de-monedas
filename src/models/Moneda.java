package models;
import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("target_code")
    private String nombre;
    @SerializedName("conversion_rate")
    private double valor;

    public Moneda(){}
    // Constructor por defecto
    public Moneda(String simbolo, double valor) {
        this.nombre= simbolo;
        this.valor = valor;
    }

    // getters
    public String getNombre() {
        return nombre;
    }
    public double getValor() {
        return valor;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nValor: " + valor;
    }
}
