/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4.modelo;

/**
 *
 * @author fabib
 */
public abstract class ContenidoMedia implements DescargableOffline {
    
    private String idMedia;
    private String titulo;
    private int duracionSeg;

    public ContenidoMedia() {
    }

    public ContenidoMedia(String idMedia, String titulo, int duracionSeg) {
        this.idMedia = idMedia;
        this.titulo = titulo;
        this.duracionSeg = duracionSeg;
    }

    public String getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(String idMedia) {
        this.idMedia = idMedia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }

    @Override
    public String toString() {
        return "ContenidoMedia{" + "idMedia=" + idMedia + ", titulo=" + titulo + ", duracionSeg=" + duracionSeg + '}';
    }
    public void reproducir(){
}
    public void pausar(){
        
    }

    
}
