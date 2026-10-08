/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7.modelo;

/**
 *
 * @author fabib
 */
public class PagoCripto extends TransaccionPago {
    
    private String walletDestino;
    private String redBlockchain;

    public PagoCripto() {
    }

    public PagoCripto(String walletDestino, String redBlockchain, String idTransaccion, double montoUSD, boolean completado) {
        super(idTransaccion, montoUSD, completado);
        this.walletDestino = walletDestino;
        this.redBlockchain = redBlockchain;
    }

    public String getWalletDestino() {
        return walletDestino;
    }
    

    public void setWalletDestino(String walletDestino) {
        this.walletDestino = walletDestino;
    }

    public String getRedBlockchain() {
        return redBlockchain;
    }

    public void setRedBlockchain(String redBlockchain) {
        this.redBlockchain = redBlockchain;
    }

    @Override
    public String toString() {
        return "PagoCripto{" + "walletDestino=" + walletDestino + ", redBlockchain=" + redBlockchain + '}';
    }

    @Override
    public void procesarPago() {
        super.procesarPago(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void obtenerHashConfirmacion(){ 
    }
    public void numeroConfirmaciones(){ 
        
    }
    
    
}
