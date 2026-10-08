/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9.modelo;

/**
 *
 * @author fabib
 */
public class SensorHumedad extends SensorIndustrial {
    
    private double nivelPuntualPorcentaje;

    public SensorHumedad() {
    }

    public SensorHumedad(double nivelPuntualPorcentaje, String idSensor, String ubicacionArea, boolean activo) {
        super(idSensor, ubicacionArea, activo);
        this.nivelPuntualPorcentaje = nivelPuntualPorcentaje;
    }

    public double getNivelPuntualPorcentaje() {
        return nivelPuntualPorcentaje;
    }

    public void setNivelPuntualPorcentaje(double nivelPuntualPorcentaje) {
        this.nivelPuntualPorcentaje = nivelPuntualPorcentaje;
    }

    @Override
    public String toString() {
        return "SensorHumedad{" + "nivelPuntualPorcentaje=" + nivelPuntualPorcentaje + '}';
    }

    @Override
    public void tomarLectura() {
        super.tomarLectura(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void calcularPuntoRocio(){
        
    }

    @Override
    public void dispararAlarmaEmergencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enviarNoticacionMQTT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
