/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2.modelo;

/**
 *
 * @author fabib
 */
public class BusExpreso extends VehiculoAutonomo {
    
    private int capacidadPasajeros;

    public BusExpreso() {
    }

    public BusExpreso(int capacidadPasajeros, String vin, double velocidadMax, boolean enRuta) {
        super(vin, velocidadMax, enRuta);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "BusExpreso{" + "capacidadPasajeros=" + capacidadPasajeros + '}';
    }
    
    public void iniciarSiguienteParada(){
        
    }

    @Override
    public void obetenerCoordenadas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void transmitirTelematria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
