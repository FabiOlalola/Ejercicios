/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1.modelo;

/**
 *
 * @author fabib
 */
public class CirugiaUrgencia extends AtencionMedica {
    private double horasDuracion;
    private Quirofano quirofanoAsignado; 

    public CirugiaUrgencia() {
    }

    public CirugiaUrgencia(double horasDuracion, Quirofano quirofanoAsignado, String codigoAtencion, double costoBase) {
        super(codigoAtencion, costoBase);
        this.horasDuracion = horasDuracion;
        this.quirofanoAsignado = quirofanoAsignado;
    }

    public double getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(double horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    public Quirofano getQuirofanoAsignado() {
        return quirofanoAsignado;
    }

    public void setQuirofanoAsignado(Quirofano quirofanoAsignado) {
        this.quirofanoAsignado = quirofanoAsignado;
    }

    @Override
    public String toString() {
        return "CirugiaUrgencia{" + "horasDuracion=" + horasDuracion + ", quirofanoAsignado=" + quirofanoAsignado + '}';
    }
    @Override
     public int calcularCostoTotal(){
        return 30;
     } 
     
     public void prepararEquipo(){
         System.out.println("Equipo listo");
                 
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