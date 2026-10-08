/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10.modelo;

/**
 *
 * @author fabib
 */
public class BasculaIndustrial {
    
    private double presicionGramos;
    private String fechaCertificado;

    public BasculaIndustrial() {
    }

    public BasculaIndustrial(double presicionGramos, String fechaCertificado) {
        this.presicionGramos = presicionGramos;
        this.fechaCertificado = fechaCertificado;
    }

    public double getPresicionGramos() {
        return presicionGramos;
    }

    public void setPresicionGramos(double presicionGramos) {
        this.presicionGramos = presicionGramos;
    }

    public String getFechaCertificado() {
        return fechaCertificado;
    }

    public void setFechaCertificado(String fechaCertificado) {
        this.fechaCertificado = fechaCertificado;
    }

    @Override
    public String toString() {
        return "BasculaIndustrial{" + "presicionGramos=" + presicionGramos + ", fechaCertificado=" + fechaCertificado + '}';
    }
    public void obtenerPesajePrecision(){
        
    }
    
    
    
}
