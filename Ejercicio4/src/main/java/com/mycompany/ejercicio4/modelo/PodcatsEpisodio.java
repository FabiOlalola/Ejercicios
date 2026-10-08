/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4.modelo;

/**
 *
 * @author fabib
 */
public class PodcatsEpisodio extends ContenidoMedia {
    
    private int numEpisodio;

    public PodcatsEpisodio() {
    }

    public PodcatsEpisodio(int numEpisodio, String idMedia, String titulo, int duracionSeg) {
        super(idMedia, titulo, duracionSeg);
        this.numEpisodio = numEpisodio;
    }

    public int getNumEpisodio() {
        return numEpisodio;
    }

    public void setNumEpisodio(int numEpisodio) {
        this.numEpisodio = numEpisodio;
    }

    @Override
    public String toString() {
        return "PodcatsEpisodio{" + "numEpisodio=" + numEpisodio + '}';
    }
    public void guardarEnCache(){
        
    }

    @Override
    public void verificarEspacioDisk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
