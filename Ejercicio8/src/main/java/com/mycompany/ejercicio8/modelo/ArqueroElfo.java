/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8.modelo;

/**
 *
 * @author fabib
 */
public class ArqueroElfo extends PersonajeRPG {
    
    private double precisionPorcentaje;

    public ArqueroElfo() {
    }

    public ArqueroElfo(double precisionPorcentaje, String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
        this.precisionPorcentaje = precisionPorcentaje;
    }

    public double getPrecisionPorcentaje() {
        return precisionPorcentaje;
    }

    public void setPrecisionPorcentaje(double precisionPorcentaje) {
        this.precisionPorcentaje = precisionPorcentaje;
    }

    @Override
    public String toString() {
        return "ArqueroElfo{" + "precisionPorcentaje=" + precisionPorcentaje + '}';
    }

    @Override
    public void atacar() {
        super.atacar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void ejecutarHabilidadEspecial(){
        
    }
    public void tiempoEnfriamentoTurnos(){
        
    }
    
}
