/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5.modelo;

/**
 *
 * @author fabib
 */
public class BoardingDigital extends AsientoVuelo {
    
    private String codigoQR;

    public BoardingDigital() {
    }

    public BoardingDigital(String codigoQR, String codigoAsiento, double precioTarifa, boolean reservado) {
        super(codigoAsiento, precioTarifa, reservado);
        this.codigoQR = codigoQR;
    }

    public String getCodigoQR() {
        return codigoQR;
    }

    public void setCodigoQR(String codigoQR) {
        this.codigoQR = codigoQR;
    }

    @Override
    public String toString() {
        return "BoardingDigital{" + "codigoQR=" + codigoQR + '}';
    }

    @Override
    public void calcularEuipajePermitido() {
        super.calcularEuipajePermitido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void emitiraBoardingPass(){
        
    }

    @Override
    public void emitirBoardingPass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String validarPasaporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
