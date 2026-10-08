/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6.modelo;

/**
 *
 * @author fabib
 */
public class HabitacioneEstandar extends HabitacionHotel {
    
    private int camasSupletorias;

    public HabitacioneEstandar() {
    }

    public HabitacioneEstandar(int camasSupletorias, int numeroHabitacion, double precioNocheBase, boolean ocupada) {
        super(numeroHabitacion, precioNocheBase, ocupada);
        this.camasSupletorias = camasSupletorias;
    }

    public int getCamasSupletorias() {
        return camasSupletorias;
    }

    public void setCamasSupletorias(int camasSupletorias) {
        this.camasSupletorias = camasSupletorias;
    }

    @Override
    public String toString() {
        return "HabitacioneEstandar{" + "camasSupletorias=" + camasSupletorias + '}';
    }

    @Override
    public int calcularCostoEstadia() {
        return super.calcularCostoEstadia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void solicitarToallasExtra(){
        
    }

    @Override
    public void iniciarCicloDesinfeccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void obtenerReporteSeguridad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
