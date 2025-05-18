package model;

public class bus extends Vehiculo {
    private int capacidadPasajeros;
    private String tipoBus; // Ejemplo: "Urbano", "Tur�stico", etc.

    // Constructor vac�o
    public bus() {
        super();
    }

    // Constructor con par�metros
    public bus(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String tipoRuedas, String FechaDeFabricacion, MarchasEnum marchas, int velocidad, String A�os, int capacidadPasajeros, String tipoBus) {
        super(marca, matricula, modelo, potencia, color, motor, tipoRuedas, FechaDeFabricacion, marchas, velocidad, A�os);
        this.capacidadPasajeros = capacidadPasajeros;
        this.tipoBus = tipoBus;
    }

    // Getters y Setters
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    @Override
    public String toString() {
        return "Bus{" + "marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + ", potencia=" + potencia +
                ", color=" + color + ", motor=" + motor + ", tipoRuedas=" + tipoRuedas + ", FechaDeFabricacion=" + FechaDeFabricacion +
                ", marchas=" + marchas + ", velocidad=" + velocidad + ", capacidadPasajeros=" + capacidadPasajeros + ", tipoBus=" + tipoBus + '}';
    }
}
