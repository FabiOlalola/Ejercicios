/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7.modelo;

/**
 *
 * @author fabib
 */
public class EncriptadorRSA {
    
    private int longitudLLave;
    private String tokenSeguridad;

    public EncriptadorRSA() {
    }

    public EncriptadorRSA(int longitudLLave, String tokenSeguridad) {
        this.longitudLLave = longitudLLave;
        this.tokenSeguridad = tokenSeguridad;
    }

    public int getLongitudLLave() {
        return longitudLLave;
    }

    public void setLongitudLLave(int longitudLLave) {
        this.longitudLLave = longitudLLave;
    }

    public String getTokenSeguridad() {
        return tokenSeguridad;
    }

    public void setTokenSeguridad(String tokenSeguridad) {
        this.tokenSeguridad = tokenSeguridad;
    }

    @Override
    public String toString() {
        return "EncriptadorRSA{" + "longitudLLave=" + longitudLLave + ", tokenSeguridad=" + tokenSeguridad + '}';
    }
    public String encriptarDatos(){
        return "Datos Encirptados";
        
    }
    
    
}
