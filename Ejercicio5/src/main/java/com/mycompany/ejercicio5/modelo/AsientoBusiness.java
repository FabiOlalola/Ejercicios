/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5.modelo;

/**
 *
 * @author fabib
 */
public class AsientoBusiness extends AsientoVuelo {
    
    private boolean accesoLounge;
    private CabinaPrivada suiteCabina;

    public AsientoBusiness() {
    }

    public AsientoBusiness(boolean accesoLounge, CabinaPrivada suiteCabina, String codigoAsiento, double precioTarifa, boolean reservado) {
        super(codigoAsiento, precioTarifa, reservado);
        this.accesoLounge = accesoLounge;
        this.suiteCabina = suiteCabina;
    }

    public boolean isAccesoLounge() {
        return accesoLounge;
    }

    public void setAccesoLounge(boolean accesoLounge) {
        this.accesoLounge = accesoLounge;
    }

    public CabinaPrivada getSuiteCabina() {
        return suiteCabina;
    }

    public void setSuiteCabina(CabinaPrivada suiteCabina) {
        this.suiteCabina = suiteCabina;
    }

    @Override
    public String toString() {
        return "AsientoBusiness{" + "accesoLounge=" + accesoLounge + ", suiteCabina=" + suiteCabina + '}';
    }

    @Override
    public void calcularEuipajePermitido() {
        super.calcularEuipajePermitido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void solicitarChanpange(){
        
    }

    @Override
    public void emitirBoardingPass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String validarPasaporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
