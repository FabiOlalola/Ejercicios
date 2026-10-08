/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10.modelo;

/**
 *
 * @author fabib
 */
public class SobreDocumento extends PaqueteEnvio {
    
    private boolean esDocumentoLegal;

    public SobreDocumento() {
    }

    public SobreDocumento(boolean esDocumentoLegal, String numeroGuia, double pesoKg, String destino) {
        super(numeroGuia, pesoKg, destino);
        this.esDocumentoLegal = esDocumentoLegal;
    }

    public boolean isEsDocumentoLegal() {
        return esDocumentoLegal;
    }

    public void setEsDocumentoLegal(boolean esDocumentoLegal) {
        this.esDocumentoLegal = esDocumentoLegal;
    }

    @Override
    public String toString() {
        return "SobreDocumento{" + "esDocumentoLegal=" + esDocumentoLegal + '}';
    }

    @Override
    public void calcularCostoEnvio() {
        super.calcularCostoEnvio(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void marcarComoConfidencial(){
        
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
