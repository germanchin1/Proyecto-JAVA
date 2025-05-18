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
public class Vehiculo {
    protected String marca;
    protected String matricula;
    protected String modelo;
    protected double potencia;
    protected ColorEnum color;
    protected String motor;
    protected String tipoRuedas;
    protected String FechaDeFabricacion;
    protected MarchasEnum marchas;
    protected int velocidad;
    protected String Años;

    // Constructor de Vehiculo que acepta todos los parámetros
    public Vehiculo(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String tipoRuedas, String FechaDeFabricacion, MarchasEnum marchas, int velocidad, String Años) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        this.color = color;
        this.motor = motor;
        this.tipoRuedas = tipoRuedas;
        this.FechaDeFabricacion = FechaDeFabricacion;
        this.marchas = marchas;
        this.velocidad = velocidad;
        this.Años = Años;
    }

    // Constructor vacío si lo necesitas
    public Vehiculo() {
    }



    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTipoRuedas() {
        return tipoRuedas;
    }

    public void setTipoRuedas(String tipoRuedas) {
        this.tipoRuedas = tipoRuedas;
    }

    public String getFechaDeFabricacion() {
        return FechaDeFabricacion;
    }

    public void setFechaDeFabricacion(String FechaDeFabricacion) {
        this.FechaDeFabricacion = FechaDeFabricacion;
    }

    public MarchasEnum getMarchas() {
        return marchas;
    }

    public void setMarchas(MarchasEnum marchas) {
        this.marchas = marchas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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
        return "Coche{" + "marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + ", potencia=" + potencia + ", color=" + color + ", motor=" + motor + ", tipoRuedas=" + tipoRuedas + ", FechaDeFabricacion=" + FechaDeFabricacion + ", marchas=" + marchas + ", velocidad=" + velocidad + '}';
    }




    public int calcularAntiguedad(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Period p = Period.between(LocalDate.parse(FechaDeFabricacion), currentDate);
        return p.getYears();
    }  
    
    public abstract double calcularPrecio();
    

    
    
}


