/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7.modelo;

/**
 *
 * @author fabib
 */
public class PagoTransferencia extends TransaccionPago {
    
    private String bancoOrigen;

    public PagoTransferencia() {
    }

    public PagoTransferencia(String bancoOrigen, String idTransaccion, double montoUSD, boolean completado) {
        super(idTransaccion, montoUSD, completado);
        this.bancoOrigen = bancoOrigen;
    }

    public String getBancoOrigen() {
        return bancoOrigen;
    }

    public void setBancoOrigen(String bancoOrigen) {
        this.bancoOrigen = bancoOrigen;
    }

    @Override
    public String toString() {
        return "PagoTransferencia{" + "bancoOrigen=" + bancoOrigen + '}';
    }

    @Override
    public void procesarPago() {
        super.procesarPago(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void adjuntarComprobante() {
        
        
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
