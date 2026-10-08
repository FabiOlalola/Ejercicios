/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2.modelo;

/**
 *
 * @author fabib
 */
public class TaxiAutonomo extends VehiculoAutonomo {
    
    private double tarifaPorKm;
    private BateriaLitio packBaterias;

    public TaxiAutonomo() {
    }

    public TaxiAutonomo(double tarifaPorKm, BateriaLitio packBaterias, String vin, double velocidadMax, boolean enRuta) {
        super(vin, velocidadMax, enRuta);
        this.tarifaPorKm = tarifaPorKm;
        this.packBaterias = packBaterias;
    }

    public double getTarifaPorKm() {
        return tarifaPorKm;
    }

    public void setTarifaPorKm(double tarifaPorKm) {
        this.tarifaPorKm = tarifaPorKm;
    }

    public BateriaLitio getPackBaterias() {
        return packBaterias;
    }

    public void setPackBaterias(BateriaLitio packBaterias) {
        this.packBaterias = packBaterias;
    }

    @Override
    public String toString() {
        return "TaxiAutonomo{" + "tarifaPorKm=" + tarifaPorKm + ", packBaterias=" + packBaterias + '}';
    }
    public void solicitarRecargaRapida(){
        
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
