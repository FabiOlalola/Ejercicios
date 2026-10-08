/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2.modelo;

/**
 *
 * @author fabib
 */
public abstract class VehiculoAutonomo implements RastreableGPS {
    
    private String vin;
    private double velocidadMax;
    private boolean enRuta;

    public VehiculoAutonomo() {
    }

    public VehiculoAutonomo(String vin, double velocidadMax, boolean enRuta) {
        this.vin = vin;
        this.velocidadMax = velocidadMax;
        this.enRuta = enRuta;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public boolean isEnRuta() {
        return enRuta;
    }

    public void setEnRuta(boolean enRuta) {
        this.enRuta = enRuta;
    }

    @Override
    public String toString() {
        return "VehiculoAutonomo{" + "vin=" + vin + ", velocidadMax=" + velocidadMax + ", enRuta=" + enRuta + '}';
    }
    public String iniciarRuta(){
        return null;
    }
    
    public void frenarEmergencia(){
        System.out.println(""); 
    }
}
