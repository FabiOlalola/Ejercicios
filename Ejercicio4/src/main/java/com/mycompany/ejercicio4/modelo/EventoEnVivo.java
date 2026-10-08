/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4.modelo;

/**
 *
 * @author fabib
 */
public class EventoEnVivo extends ContenidoMedia {
    
    private int latenciaMs;
    private ServidorCDN nodoCDN;

    public EventoEnVivo() {
    }

    public EventoEnVivo(int latenciaMs, ServidorCDN nodoCDN, String idMedia, String titulo, int duracionSeg) {
        super(idMedia, titulo, duracionSeg);
        this.latenciaMs = latenciaMs;
        this.nodoCDN = nodoCDN;
    }

    public int getLatenciaMs() {
        return latenciaMs;
    }

    public void setLatenciaMs(int latenciaMs) {
        this.latenciaMs = latenciaMs;
    }

    public ServidorCDN getNodoCDN() {
        return nodoCDN;
    }

    public void setNodoCDN(ServidorCDN nodoCDN) {
        this.nodoCDN = nodoCDN;
    }

    @Override
    public String toString() {
        return "EventoEnVivo{" + "latenciaMs=" + latenciaMs + ", nodoCDN=" + nodoCDN + '}';
    }
    public void ajustarCalidadDynamic(){
        
    }

    @Override
    public void guardarEnCache() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verificarEspacioDisk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
