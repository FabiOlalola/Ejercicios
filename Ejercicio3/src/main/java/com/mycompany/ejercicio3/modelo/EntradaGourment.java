/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3.modelo;

/**
 *
 * @author fabib
 */
public class EntradaGourment extends PlatilloMenu {
    
    private boolean esFrio;

    public EntradaGourment() {
    }

    public EntradaGourment(boolean esFrio, String idPlato, String nombre, double precioBse) {
        super(idPlato, nombre, precioBse);
        this.esFrio = esFrio;
    }

    public boolean isEsFrio() {
        return esFrio;
    }

    public void setEsFrio(boolean esFrio) {
        this.esFrio = esFrio;
    }

    @Override
    public String toString() {
        return "EntradaGourment{" + "esFrio=" + esFrio + '}';
    }

    @Override
    public void calcularPrecioFinal() {
        super.calcularPrecioFinal();
    }
    public void verificarAlergenos(){
        
    }

    @Override
    public void sellarEmpaque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tiempoConservacionMin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
