/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6.modelo;

/**
 *
 * @author fabib
 */
public class SuitePenthouse extends HabitacionHotel {
    
    private boolean jacuzziPrivado;
    private ServicioMayordomo mayordomoPrivado;

    public SuitePenthouse() {
    }

    public SuitePenthouse(boolean jacuzziPrivado, ServicioMayordomo mayordomoPrivado, int numeroHabitacion, double precioNocheBase, boolean ocupada) {
        super(numeroHabitacion, precioNocheBase, ocupada);
        this.jacuzziPrivado = jacuzziPrivado;
        this.mayordomoPrivado = mayordomoPrivado;
    }

    public boolean isJacuzziPrivado() {
        return jacuzziPrivado;
    }

    public void setJacuzziPrivado(boolean jacuzziPrivado) {
        this.jacuzziPrivado = jacuzziPrivado;
    }

    public ServicioMayordomo getMayordomoPrivado() {
        return mayordomoPrivado;
    }

    public void setMayordomoPrivado(ServicioMayordomo mayordomoPrivado) {
        this.mayordomoPrivado = mayordomoPrivado;
    }

    @Override
    public String toString() {
        return "SuitePenthouse{" + "jacuzziPrivado=" + jacuzziPrivado + ", mayordomoPrivado=" + mayordomoPrivado + '}';
    }

    @Override
    public int calcularCostoEstadia() {
        return super.calcularCostoEstadia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void solicitarCenaGourmet(){
        
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
