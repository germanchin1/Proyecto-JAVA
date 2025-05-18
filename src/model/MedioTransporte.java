/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import tipoEnum.MedioTransEnum;

/**
 *
 * @author germanromort
 */
public abstract class MedioTransporte {
    private MedioTransEnum tipo;
    private boolean esPublico;
    
    public abstract double calcularPrecio();
}
