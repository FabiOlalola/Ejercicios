/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2.modelo;

/**
 *
 * @author fabib
 */
public class DronEntrega extends VehiculoAutonomo {
    
    private double pesoMaxPaquete;

    public DronEntrega() {
    }

    public DronEntrega(double pesoMaxPaquete, String vin, double velocidadMax, boolean enRuta) {
        super(vin, velocidadMax, enRuta);
        this.pesoMaxPaquete = pesoMaxPaquete;
    }

    public double getPesoMaxPaquete() {
        return pesoMaxPaquete;
    }

    public void setPesoMaxPaquete(double pesoMaxPaquete) {
        this.pesoMaxPaquete = pesoMaxPaquete;
    }

    @Override
    public String toString() {
        return "DronEntrega{" + "pesoMaxPaquete=" + pesoMaxPaquete + '}';
    }
    public void obtenerCoordenadas(){
        
    }
    public void transmitirTelemetria(){
        
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
