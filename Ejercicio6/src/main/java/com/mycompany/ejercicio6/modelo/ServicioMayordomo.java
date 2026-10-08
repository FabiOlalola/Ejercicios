/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6.modelo;

/**
 *
 * @author fabib
 */
public class ServicioMayordomo {
    
    private String nombreMayordomo;
    private int turnosDisponibles;

    public ServicioMayordomo() {
    }

    public ServicioMayordomo(String nombreMayordomo, int turnosDisponibles) {
        this.nombreMayordomo = nombreMayordomo;
        this.turnosDisponibles = turnosDisponibles;
    }

    public String getNombreMayordomo() {
        return nombreMayordomo;
    }

    public void setNombreMayordomo(String nombreMayordomo) {
        this.nombreMayordomo = nombreMayordomo;
    }

    public int getTurnosDisponibles() {
        return turnosDisponibles;
    }

    public void setTurnosDisponibles(int turnosDisponibles) {
        this.turnosDisponibles = turnosDisponibles;
    }

    @Override
    public String toString() {
        return "ServicioMayordomo{" + "nombreMayordomo=" + nombreMayordomo + ", turnosDisponibles=" + turnosDisponibles + '}';
    }
    public void atenderLLamadaVip(){
        
    }
    
    
}
