/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3.modelo;

/**
 *
 * @author fabib
 */
public class PedidoDelivery extends PlatilloMenu {
    
    private String direccionEntrega;

    public PedidoDelivery() {
    }

    public PedidoDelivery(String direccionEntrega, String idPlato, String nombre, double precioBse) {
        super(idPlato, nombre, precioBse);
        this.direccionEntrega = direccionEntrega;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    @Override
    public String toString() {
        return "PedidoDelivery{" + "direccionEntrega=" + direccionEntrega + '}';
    }

    @Override
    public void calcularPrecioFinal() {
        super.calcularPrecioFinal();
    }
    public void sellarEmpaque(){
        
    }
    public void tiempoConservacionMin(){
        
    }
}
