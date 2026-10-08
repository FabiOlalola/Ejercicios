/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6.modelo;

/**
 *
 * @author fabib
 */
public class SuiteTematica extends HabitacionHotel {
    
    private String tematicaDecoracion;

    public SuiteTematica() {
    }

    public SuiteTematica(String tematicaDecoracion, int numeroHabitacion, double precioNocheBase, boolean ocupada) {
        super(numeroHabitacion, precioNocheBase, ocupada);
        this.tematicaDecoracion = tematicaDecoracion;
    }

    public String getTematicaDecoracion() {
        return tematicaDecoracion;
    }

    public void setTematicaDecoracion(String tematicaDecoracion) {
        this.tematicaDecoracion = tematicaDecoracion;
    }

    @Override
    public String toString() {
        return "SuiteTematica{" + "tematicaDecoracion=" + tematicaDecoracion + '}';
    }

    @Override
    public int calcularCostoEstadia() {
        return super.calcularCostoEstadia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void iniciarCicloDesinfeccion(){
        
    }
    public void obtenerReporteSeguridad(){
        
    }
    
    
}
