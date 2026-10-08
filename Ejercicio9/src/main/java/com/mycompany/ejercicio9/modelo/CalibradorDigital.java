/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9.modelo;

/**
 *
 * @author fabib
 */
public class CalibradorDigital {
    
    private String fechaUltimaCalibracion;
    private double margenError;

    public CalibradorDigital() {
    }

    public CalibradorDigital(String fechaUltimaCalibracion, double margenError) {
        this.fechaUltimaCalibracion = fechaUltimaCalibracion;
        this.margenError = margenError;
    }

    public String getFechaUltimaCalibracion() {
        return fechaUltimaCalibracion;
    }

    public void setFechaUltimaCalibracion(String fechaUltimaCalibracion) {
        this.fechaUltimaCalibracion = fechaUltimaCalibracion;
    }

    public double getMargenError() {
        return margenError;
    }

    public void setMargenError(double margenError) {
        this.margenError = margenError;
    }

    @Override
    public String toString() {
        return "CalibradorDigital{" + "fechaUltimaCalibracion=" + fechaUltimaCalibracion + ", margenError=" + margenError + '}';
    }
    public void ajustarCeroAbsoluto(){
        
    }
    
    
    
    
}
