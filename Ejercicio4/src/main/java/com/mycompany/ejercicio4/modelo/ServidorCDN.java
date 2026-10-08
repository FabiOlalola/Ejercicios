/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4.modelo;

/**
 *
 * @author fabib
 */
public class ServidorCDN {
    
    private String ipNodo;
    private double anchoBandaGbps;

    public ServidorCDN() {
    }

    public ServidorCDN(String ipNodo, double anchoBandaGbps) {
        this.ipNodo = ipNodo;
        this.anchoBandaGbps = anchoBandaGbps;
    }

    public String getIpNodo() {
        return ipNodo;
    }

    public void setIpNodo(String ipNodo) {
        this.ipNodo = ipNodo;
    }

    public double getAnchoBandaGbps() {
        return anchoBandaGbps;
    }

    public void setAnchoBandaGbps(double anchoBandaGbps) {
        this.anchoBandaGbps = anchoBandaGbps;
    }

    @Override
    public String toString() {
        return "ServidorCDN{" + "ipNodo=" + ipNodo + ", anchoBandaGbps=" + anchoBandaGbps + '}';
    }
    public void balancearCarga(){
        
    }
    
}
