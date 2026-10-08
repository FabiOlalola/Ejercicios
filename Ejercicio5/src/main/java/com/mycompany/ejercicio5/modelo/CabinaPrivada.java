/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5.modelo;

/**
 *
 * @author fabib
 */
public class CabinaPrivada {
    
    private int numPantallaHD;
    private boolean asientoReclinable188;

    public CabinaPrivada() {
    }

    public CabinaPrivada(int numPantallaHD, boolean asientoReclinable188) {
        this.numPantallaHD = numPantallaHD;
        this.asientoReclinable188 = asientoReclinable188;
    }

    public int getNumPantallaHD() {
        return numPantallaHD;
    }

    public void setNumPantallaHD(int numPantallaHD) {
        this.numPantallaHD = numPantallaHD;
    }

    public boolean isAsientoReclinable188() {
        return asientoReclinable188;
    }

    public void setAsientoReclinable188(boolean asientoReclinable188) {
        this.asientoReclinable188 = asientoReclinable188;
    }

    @Override
    public String toString() {
        return "CabinaPrivada{" + "numPantallaHD=" + numPantallaHD + ", asientoReclinable188=" + asientoReclinable188 + '}';
    }
    public void activarMasaje(){
        
    }
    
    
    
    
}
