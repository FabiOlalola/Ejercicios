/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3.modelo;

/**
 *
 * @author fabib
 */
public class PlatoPrincipal extends PlatilloMenu {
    
    private String tipoProteina;
    private Sommelier sommelierAsignado;

    public PlatoPrincipal() {
    }

    public PlatoPrincipal(String tipoProteina, Sommelier sommelierAsignado, String idPlato, String nombre, double precioBse) {
        super(idPlato, nombre, precioBse);
        this.tipoProteina = tipoProteina;
        this.sommelierAsignado = sommelierAsignado;
    }

    public String getTipoProteina() {
        return tipoProteina;
    }

    public void setTipoProteina(String tipoProteina) {
        this.tipoProteina = tipoProteina;
    }

    public Sommelier getSommelierAsignado() {
        return sommelierAsignado;
    }

    public void setSommelierAsignado(Sommelier sommelierAsignado) {
        this.sommelierAsignado = sommelierAsignado;
    }

    @Override
    public String toString() {
        return "PlatoPrincipal{" + "tipoProteina=" + tipoProteina + ", sommelierAsignado=" + sommelierAsignado + '}';
    }

    @Override
    public void calcularPrecioFinal() {
        super.calcularPrecioFinal();
    }
    public void sugerirMaridaje(){
        
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
