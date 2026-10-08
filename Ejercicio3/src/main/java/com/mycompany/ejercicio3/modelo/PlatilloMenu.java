/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3.modelo;

/**
 *
 * @author fabib
 */
public abstract class PlatilloMenu implements EmpacableTermico {
    
    private String idPlato;
    private String nombre;
    private double precioBse;

    public PlatilloMenu() {
    }

    public PlatilloMenu(String idPlato, String nombre, double precioBse) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precioBse = precioBse;
    }

    public String getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(String idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBse() {
        return precioBse;
    }

    public void setPrecioBse(double precioBse) {
        this.precioBse = precioBse;
    }

    @Override
    public String toString() {
        return "PlatilloMenu{" + "idPlato=" + idPlato + ", nombre=" + nombre + ", precioBse=" + precioBse + '}';
    }
    public void calcularPrecioFinal(){
        
    }
    public void prepararPlato(){
        
    }
    
    
    
}
