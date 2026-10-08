/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6.modelo;

/**
 *
 * @author fabib
 */
public abstract class HabitacionHotel implements SanitizableAutomatico {
    
    private int numeroHabitacion;
    private double precioNocheBase;
    private boolean ocupada;

    public HabitacionHotel() {
    }

    public HabitacionHotel(int numeroHabitacion, double precioNocheBase, boolean ocupada) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNocheBase = precioNocheBase;
        this.ocupada = ocupada;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioNocheBase() {
        return precioNocheBase;
    }

    public void setPrecioNocheBase(double precioNocheBase) {
        this.precioNocheBase = precioNocheBase;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "HabitacionHotel{" + "numeroHabitacion=" + numeroHabitacion + ", precioNocheBase=" + precioNocheBase + ", ocupada=" + ocupada + '}';
    }
    public int calcularCostoEstadia(){
        return 50;
    }
    public void realizarChekIn(){
        
    }
    
}
