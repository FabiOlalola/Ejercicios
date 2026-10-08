/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7.modelo;

/**
 *
 * @author fabib
 */
public class PagoTarjeta extends TransaccionPago {
    
    private String ultimos4Digitos;
    private EncriptadorRSA moduloRSA;

    public PagoTarjeta() {
    }

    public PagoTarjeta(String ultimos4Digitos, EncriptadorRSA moduloRSA, String idTransaccion, double montoUSD, boolean completado) {
        super(idTransaccion, montoUSD, completado);
        this.ultimos4Digitos = ultimos4Digitos;
        this.moduloRSA = moduloRSA;
    }

    public String getUltimos4Digitos() {
        return ultimos4Digitos;
    }

    public void setUltimos4Digitos(String ultimos4Digitos) {
        this.ultimos4Digitos = ultimos4Digitos;
    }

    public EncriptadorRSA getModuloRSA() {
        return moduloRSA;
    }

    public void setModuloRSA(EncriptadorRSA moduloRSA) {
        this.moduloRSA = moduloRSA;
    }

    @Override
    public String toString() {
        return "PagoTarjeta{" + "ultimos4Digitos=" + ultimos4Digitos + ", moduloRSA=" + moduloRSA + '}';
    }

    @Override
    public void procesarPago() {
        super.procesarPago(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void tokenizarTarjeta() {
        
    }

    @Override
    public void obtenerHashConfirmacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void numeroConfirmaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
