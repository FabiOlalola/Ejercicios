/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7.modelo;

/**
 *
 * @author fabib
 */
public abstract class TransaccionPago implements VerificableBlockchain {
    
    private String idTransaccion;
    private double montoUSD;
    private boolean completado;

    public TransaccionPago() {
    }

    public TransaccionPago(String idTransaccion, double montoUSD, boolean completado) {
        this.idTransaccion = idTransaccion;
        this.montoUSD = montoUSD;
        this.completado = completado;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public double getMontoUSD() {
        return montoUSD;
    }

    public void setMontoUSD(double montoUSD) {
        this.montoUSD = montoUSD;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "TransaccionPago{" + "idTransaccion=" + idTransaccion + ", montoUSD=" + montoUSD + ", completado=" + completado + '}';
    }
    public void procesarPago(){
        
    }
    public void generarComprobante(){
        
    }
    
    
    
}
