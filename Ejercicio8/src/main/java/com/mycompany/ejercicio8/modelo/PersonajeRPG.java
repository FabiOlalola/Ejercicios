/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8.modelo;

/**
 *
 * @author fabib
 */
public abstract class PersonajeRPG implements LanzadorHabilidades {
    
    private String nombre;
    private int puntosVida;
    private int nivel;

    public PersonajeRPG() {
    }

    public PersonajeRPG(String nombre, int puntosVida, int nivel) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "PersonajeRPG{" + "nombre=" + nombre + ", puntosVida=" + puntosVida + ", nivel=" + nivel + '}';
    }
    public void atacar(){ 
        
    }
    public int recibirdanio(){
        return 0;
    }
    
    
    
}
