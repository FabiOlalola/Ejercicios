/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1.modelo;

/**
 *
 * @author fabib
 */
public  abstract class AtencionMedica  {
    
    private String codigoAtencion;
    private double costoBase;

    public AtencionMedica() {
    }

    public AtencionMedica(String codigoAtencion, double costoBase) {
        this.codigoAtencion = codigoAtencion;
        this.costoBase = costoBase;
    }

    public String getCodigoAtencion() {
        return codigoAtencion;
    }

    public void setCodigoAtencion(String codigoAtencion) {
        this.codigoAtencion = codigoAtencion;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    @Override
    public String toString() {
        return "AtencionMedica{" + "codigoAtencion=" + codigoAtencion + ", costoBase=" + costoBase + '}';
    }
    
    public int calcularCostoTotal(){
        return 30;
    }
    
    /**
     *
     * @return
     */
    public String resgistrarDiagnostico(){
        return "Diagnostico Registrado";
    }
}
   
    
    
    

