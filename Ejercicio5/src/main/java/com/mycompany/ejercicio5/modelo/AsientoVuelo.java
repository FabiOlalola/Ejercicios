/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5.modelo;

/**
 *
 * @author fabib
 */
public abstract class AsientoVuelo implements CheckInOnLine {
    
    private String codigoAsiento;
    private double precioTarifa;
    private boolean reservado;

    public AsientoVuelo() {
    }

    public AsientoVuelo(String codigoAsiento, double precioTarifa, boolean reservado) {
        this.codigoAsiento = codigoAsiento;
        this.precioTarifa = precioTarifa;
        this.reservado = reservado;
    }

    public String getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    public double getPrecioTarifa() {
        return precioTarifa;
    }

    public void setPrecioTarifa(double precioTarifa) {
        this.precioTarifa = precioTarifa;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        return "AsientoVuelo{" + "codigoAsiento=" + codigoAsiento + ", precioTarifa=" + precioTarifa + ", reservado=" + reservado + '}';
    }
    public void calcularEuipajePermitido(){
        
    }

    public void reservarAsiento() {
       
    }
    
   
}
