/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1.modelo;

/**
 *
 * @author fabib
 */
public class Quirofano  {
    
    private String codigoSala;
    private boolean esterilizado;

    public Quirofano() {
    }

    public Quirofano(String codigoSala, boolean esterilizado) {
        this.codigoSala = codigoSala;
        this.esterilizado = esterilizado;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    @Override
    public String toString() {
        return "Quirofano{" + "codigoSala=" + codigoSala + ", esterilizado=" + esterilizado + '}';
    }
    
    
}
