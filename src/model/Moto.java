/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

/**
 *
 * @author germanromort
 */
public class Moto extends Vehiculo{


    private boolean tieneSidecar;
    
    public Moto() {
        super();
    }
    
    /**
     *
     * @param marca
     * @param matricula
     * @param modelo
     * @param potencia
     * @param color
     * @param motor
     * @param tipoRuedas
     * @param FechaDeFabricacion
     * @param marchas
     * @param velocidad
     * @param Años
     * @param tieneSidecar
     */
    public Moto(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String tipoRuedas, String FechaDeFabricacion, MarchasEnum marchas, int velocidad, String Años, boolean tieneSidecar) {
        super(marca, matricula, modelo, potencia, color, motor, tipoRuedas, FechaDeFabricacion, marchas, velocidad, Años);
        this.tieneSidecar = tieneSidecar;

    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
   



    public void acelerar() {
        if (velocidad >= 200) {
            System.out.println("El coche ya ha alcanzado su velocidad máxima de 200 km/h.");
        } else {
            velocidad = Math.min(200, velocidad + 10);
            System.out.println("ACELERADO: Velocidad actual: " + velocidad + " km/h");
        }
    }

    public void frenar() {
        if (velocidad == 0) {
            System.out.println("El coche ya está detenido.");
        } else {
            velocidad -= 10;
            if (velocidad < 0) velocidad = 0; 
            System.out.println("FRENADO: Velocidad actual: " + velocidad + " km/h");
        }
    }

    @Override
    public String toString() {
        return "Moto{" + "tieneSidecar=" + tieneSidecar + '}';
    }





    public int calcularAntiguedad(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Period p = Period.between(LocalDate.parse(FechaDeFabricacion), currentDate);
        return p.getYears();
    }   
}


