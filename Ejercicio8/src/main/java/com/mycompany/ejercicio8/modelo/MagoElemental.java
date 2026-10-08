/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8.modelo;

/**
 *
 * @author fabib
 */
public class MagoElemental extends PersonajeRPG {
    
    private int manaPool;
    private LibroHechizos grimorio;

    public MagoElemental() {
    }

    public MagoElemental(int manaPool, LibroHechizos grimorio, String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
        this.manaPool = manaPool;
        this.grimorio = grimorio;
    }

    public int getManaPool() {
        return manaPool;
    }

    public void setManaPool(int manaPool) {
        this.manaPool = manaPool;
    }

    public LibroHechizos getGrimorio() {
        return grimorio;
    }

    public void setGrimorio(LibroHechizos grimorio) {
        this.grimorio = grimorio;
    }

    @Override
    public String toString() {
        return "MagoElemental{" + "manaPool=" + manaPool + ", grimorio=" + grimorio + '}';
    }

    @Override
    public void atacar() {
        super.atacar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void invocarTormenta(){
        
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
