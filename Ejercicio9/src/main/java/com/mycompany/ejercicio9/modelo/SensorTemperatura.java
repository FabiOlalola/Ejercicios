/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9.modelo;

/**
 *
 * @author fabib
 */
public class SensorTemperatura extends SensorIndustrial {
    
    private double gradosCelsius;

    public SensorTemperatura() {
    }

    public SensorTemperatura(double gradosCelsius, String idSensor, String ubicacionArea, boolean activo) {
        super(idSensor, ubicacionArea, activo);
        this.gradosCelsius = gradosCelsius;
    }

    public double getGradosCelsius() {
        return gradosCelsius;
    }

    public void setGradosCelsius(double gradosCelsius) {
        this.gradosCelsius = gradosCelsius;
    }

    @Override
    public String toString() {
        return "SensorTemperatura{" + "gradosCelsius=" + gradosCelsius + '}';
    }

    @Override
    public void tomarLectura() {
        super.tomarLectura(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void dispararSirenaEmergencia(){
        
    }
    public void EnviarNotificacionMQTT(){
        
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
