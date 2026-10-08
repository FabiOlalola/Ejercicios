/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10.modelo;

/**
 *
 * @author fabib
 */
public class PaquetePesado extends PaqueteEnvio {
    
    private boolean esCargaPaletizada;
    private BasculaIndustrial basculaOficial;

    public PaquetePesado() {
    }

    public PaquetePesado(boolean esCargaPaletizada, BasculaIndustrial basculaOficial, String numeroGuia, double pesoKg, String destino) {
        super(numeroGuia, pesoKg, destino);
        this.esCargaPaletizada = esCargaPaletizada;
        this.basculaOficial = basculaOficial;
    }

    public boolean isEsCargaPaletizada() {
        return esCargaPaletizada;
    }

    public void setEsCargaPaletizada(boolean esCargaPaletizada) {
        this.esCargaPaletizada = esCargaPaletizada;
    }

    public BasculaIndustrial getBasculaOficial() {
        return basculaOficial;
    }

    public void setBasculaOficial(BasculaIndustrial basculaOficial) {
        this.basculaOficial = basculaOficial;
    }

    @Override
    public String toString() {
        return "PaquetePesado{" + "esCargaPaletizada=" + esCargaPaletizada + ", basculaOficial=" + basculaOficial + '}';
    }

    @Override
    public void calcularCostoEnvio() {
        super.calcularCostoEnvio(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void pesajeOficial(){
        
    }

    @Override
    public void cotizarPolizaSeguro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void emitirCertificadoProteccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
