/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2.modelo;

/**
 *
 * @author fabib
 */
public class BateriaLitio {
    
    private double capacidadKWh;
    private int porcentajeCarga;

    public BateriaLitio() {
    }

    public BateriaLitio(double capacidadKWh, int porcentajeCarga) {
        this.capacidadKWh = capacidadKWh;
        this.porcentajeCarga = porcentajeCarga;
    }

    public double getCapacidadKWh() {
        return capacidadKWh;
    }

    public void setCapacidadKWh(double capacidadKWh) {
        this.capacidadKWh = capacidadKWh;
    }

    public int getPorcentajeCarga() {
        return porcentajeCarga;
    }

    public void setPorcentajeCarga(int porcentajeCarga) {
        this.porcentajeCarga = porcentajeCarga;
    }

    @Override
    public String toString() {
        return "BateriaLitio{" + "capacidadKWh=" + capacidadKWh + ", porcentajeCarga=" + porcentajeCarga + '}';
    }
}
