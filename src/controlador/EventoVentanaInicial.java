/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import menu.vista.VentanaInicial;
import menu.vista.VentanaPersona;

/**
 *
 * @author Universidad
 */
public class EventoVentanaInicial implements ActionListener{

    private VentanaInicial ventanaInicial;

    public EventoVentanaInicial(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }
    
    public void actionPerformed(ActionEvent ae) {
               
        if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(0)))
        {
            this.ventanaInicial.setVentanaPersona(new VentanaPersona("Registrar Persona",true,true,true,true));
            this.ventanaInicial.getEscritorio().add(ventanaInicial.getVentanaPersona());
        }
    }
    
}
