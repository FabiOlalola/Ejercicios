/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8.modelo;

/**
 *
 * @author fabib
 */
public class LibroHechizos {
    
    private int totalGrimorios;
    private String elementoDominante;

    public LibroHechizos() {
    }

    public LibroHechizos(int totalGrimorios, String elementoDominante) {
        this.totalGrimorios = totalGrimorios;
        this.elementoDominante = elementoDominante;
    }

    public int getTotalGrimorios() {
        return totalGrimorios;
    }

    public void setTotalGrimorios(int totalGrimorios) {
        this.totalGrimorios = totalGrimorios;
    }

    public String getElementoDominante() {
        return elementoDominante;
    }

    public void setElementoDominante(String elementoDominante) {
        this.elementoDominante = elementoDominante;
    }

    @Override
    public String toString() {
        return "LibroHechizos{" + "totalGrimorios=" + totalGrimorios + ", elementoDominante=" + elementoDominante + '}';
    }
    public void buscarRunaPoderosa(){
        
    }
    
    
}
