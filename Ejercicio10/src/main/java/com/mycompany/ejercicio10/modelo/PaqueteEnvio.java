/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10.modelo;

/**
 *
 * @author fabib
 */
public abstract class PaqueteEnvio implements AsegurableRiesgo {
    
    private String numeroGuia;
    private double pesoKg;
    private String destino;

    public PaqueteEnvio() {
    }

    public PaqueteEnvio(String numeroGuia, double pesoKg, String destino) {
        this.numeroGuia = numeroGuia;
        this.pesoKg = pesoKg;
        this.destino = destino;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void calcularCostoEnvio(){
        
    }
    public void rastrearEstado(){
        
    }
    
    
    
}
