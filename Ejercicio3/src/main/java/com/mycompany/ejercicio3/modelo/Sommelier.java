/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3.modelo;

/**
 *
 * @author fabib
 */
public class Sommelier {
    
    private String nombreExperto;
    private int certificacionNivel;

    public Sommelier() {
    }

    public Sommelier(String nombreExperto, int certificacionNivel) {
        this.nombreExperto = nombreExperto;
        this.certificacionNivel = certificacionNivel;
    }

    public String getNombreExperto() {
        return nombreExperto;
    }

    @Override
    public String toString() {
        return "Sommelier{" + "nombreExperto=" + nombreExperto + ", certificacionNivel=" + certificacionNivel + '}';
    }
    

    public void setNombreExperto(String nombreExperto) {
        this.nombreExperto = nombreExperto;
    }

    public int getCertificacionNivel() {
        return certificacionNivel;
    }

    public void setCertificacionNivel(int certificacionNivel) {
        this.certificacionNivel = certificacionNivel;
    }
    public void recomendarVino(){
        
    }
    
    
}
