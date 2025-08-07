package models;
import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("target_code")
    private String simbolo;
    @SerializedName("conversion_rate")
    private double valor;

    // Constructor por defecto
    public Moneda(String simbolo, double valor) {
        this.simbolo = simbolo;
        this.valor = valor;
    }

    // getters
    public String getSimbolo() {
        return simbolo;
    }

    public double getValor() {
        return valor;
    }

    // setters
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
