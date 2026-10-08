/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5.modelo;

/**
 *
 * @author fabib
 */
public class AsientoTurista extends AsientoVuelo {
    
    private boolean incluyeSnack;

    public AsientoTurista() {
    }

    public AsientoTurista(boolean incluyeSnack, String codigoAsiento, double precioTarifa, boolean reservado) {
        super(codigoAsiento, precioTarifa, reservado);
        this.incluyeSnack = incluyeSnack;
    }

    public boolean isIncluyeSnack() {
        return incluyeSnack;
    }

    public void setIncluyeSnack(boolean incluyeSnack) {
        this.incluyeSnack = incluyeSnack;
    }

    @Override
    public String toString() {
        return "AsientoTurista{" + "incluyeSnack=" + incluyeSnack + '}';
    }

    @Override
    public void calcularEuipajePermitido() {
        super.calcularEuipajePermitido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void elegirMenuEstandar(){
        
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
