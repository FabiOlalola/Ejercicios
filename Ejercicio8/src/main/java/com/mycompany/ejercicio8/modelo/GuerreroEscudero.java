/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8.modelo;

/**
 *
 * @author fabib
 */
public class GuerreroEscudero extends PersonajeRPG {
    
    private int armaduraPesada;

    public GuerreroEscudero() {
    }

    public GuerreroEscudero(int armaduraPesada, String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
        this.armaduraPesada = armaduraPesada;
    }

    public int getArmaduraPesada() {
        return armaduraPesada;
    }

    public void setArmaduraPesada(int armaduraPesada) {
        this.armaduraPesada = armaduraPesada;
    }

    @Override
    public String toString() {
        return "GuerreroEscudero{" + "armaduraPesada=" + armaduraPesada + '}';
    }

    @Override
    public void atacar() {
        super.atacar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void bloquearConEscudo(){
        
    }

    @Override
    public void ejecutarHabilidadEspecial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tiempoEnfriamentoTurnos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
