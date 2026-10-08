/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10.modelo;

/**
 *
 * @author fabib
 */
public class EnvioAereoFragil extends PaqueteEnvio {
    
    private double valorDeclarado;

    public EnvioAereoFragil() {
    }

    public EnvioAereoFragil(double valorDeclarado, String numeroGuia, double pesoKg, String destino) {
        super(numeroGuia, pesoKg, destino);
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public String toString() {
        return "EnvioAereoFragil{" + "valorDeclarado=" + valorDeclarado + '}';
    }

    @Override
    public void calcularCostoEnvio() {
        super.calcularCostoEnvio(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void cotizarPolizaSeguro(){
        
    }
    public void emitirCertificadoProteccion(){
        
    }
}
