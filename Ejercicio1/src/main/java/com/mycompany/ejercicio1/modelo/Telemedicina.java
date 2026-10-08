/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1.modelo;

/**
 *
 * @author fabib
 */
public class Telemedicina extends AtencionMedica {
    
    private String plataformaVideo;

    public Telemedicina() {
    }

    public Telemedicina(String plataformaVideo, String codigoAtencion, double costoBase) {
        super(codigoAtencion, costoBase);
        this.plataformaVideo = plataformaVideo;
    }

    public String getPlataformaVideo() {
        return plataformaVideo;
    }

    public void setPlataformaVideo(String plataformaVideo) {
        this.plataformaVideo = plataformaVideo;
    }

    @Override
    public String toString() {
        return "Telemedicina{" + "plataformaVideo=" + plataformaVideo + '}';
    }
    @Override
     public int calcularCostoTotal(){
        return 30; 
    }
    public void prepararFacturaXML(){
}
    public String enviarPorCorreo(){     
        return null;
    }

    @Override
    public void generarFacturaXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enviarPorCorreo(String modo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
