/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1.modelo;

/**
 *
 * @author fabib
 */
public class ConsultaGeneral extends AtencionMedica {
    
    private boolean esRevisionRutina;

    public ConsultaGeneral() {
    }

    public ConsultaGeneral(boolean esRevisionRutina, String codigoAtencion, double costoBase) {
        super(codigoAtencion, costoBase);
        this.esRevisionRutina = esRevisionRutina;
    }

    public boolean isEsRevisionRutina() {
        return esRevisionRutina;
    }

    public void setEsRevisionRutina(boolean esRevisionRutina) {
        this.esRevisionRutina = esRevisionRutina;
    }

    @Override
    public String toString() {
        return "ConsultaGeneral{" + "esRevisionRutina=" + esRevisionRutina + '}';
    }
    
    @Override
     public int calcularCostoTotal(){
        return 30;
    }
     public void emitirRecetaMedica(){
         System.out.println("Boleta Receta Medica");
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
