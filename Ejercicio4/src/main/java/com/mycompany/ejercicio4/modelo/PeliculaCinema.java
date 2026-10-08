/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4.modelo;

/**
 *
 * @author fabib
 */
public class PeliculaCinema extends ContenidoMedia {
    
    private String director;

    public PeliculaCinema() {
    }

    public PeliculaCinema(String director, String idMedia, String titulo, int duracionSeg) {
        super(idMedia, titulo, duracionSeg);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "PeliculaCinema{" + "director=" + director + '}';
    }
    
    public void mostrarTrailer(){
        
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
