/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9.modelo;

/**
 *
 * @author fabib
 */
public class SensorPresion extends SensorIndustrial {
    
    private double presionPSI;
    private CalibradorDigital dispositivoCalibrador;

    public SensorPresion() {
    }

    public SensorPresion(double presionPSI, CalibradorDigital dispositivoCalibrador, String idSensor, String ubicacionArea, boolean activo) {
        super(idSensor, ubicacionArea, activo);
        this.presionPSI = presionPSI;
        this.dispositivoCalibrador = dispositivoCalibrador;
    }

    public double getPresionPSI() {
        return presionPSI;
    }

    public void setPresionPSI(double presionPSI) {
        this.presionPSI = presionPSI;
    }

    public CalibradorDigital getDispositivoCalibrador() {
        return dispositivoCalibrador;
    }

    public void setDispositivoCalibrador(CalibradorDigital dispositivoCalibrador) {
        this.dispositivoCalibrador = dispositivoCalibrador;
    }

    @Override
    public String toString() {
        return "SensorPresion{" + "presionPSI=" + presionPSI + ", dispositivoCalibrador=" + dispositivoCalibrador + '}';
    }

    @Override
    public void tomarLectura() {
        super.tomarLectura(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void medirDeltaPresion(){
        
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
