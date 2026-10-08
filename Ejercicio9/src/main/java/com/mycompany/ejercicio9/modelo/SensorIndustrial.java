/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9.modelo;

/**
 *
 * @author fabib
 */
public abstract class SensorIndustrial implements NotificableAlarma {
    
    private String idSensor;
    private String ubicacionArea;
    private boolean activo;

    public SensorIndustrial() {
    }

    public SensorIndustrial(String idSensor, String ubicacionArea, boolean activo) {
        this.idSensor = idSensor;
        this.ubicacionArea = ubicacionArea;
        this.activo = activo;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public String getUbicacionArea() {
        return ubicacionArea;
    }

    public void setUbicacionArea(String ubicacionArea) {
        this.ubicacionArea = ubicacionArea;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "SensorIndustrial{" + "idSensor=" + idSensor + ", ubicacionArea=" + ubicacionArea + ", activo=" + activo + '}';
    }
    
    public void tomarLectura(){
        
    }
    public void recalibrar(){
        
    }
}
