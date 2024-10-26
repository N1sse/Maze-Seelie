/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ramir
 */

//-----Imports-----
//--mouse
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//--view
import view.GUILaberinto;
import view.PanelLaberinto;

//Codigo
public class ControladorLaberinto implements KeyListener{
    private GUILaberinto guiLaberinto;
    private PanelLaberinto panelLaberinto;
    private ControladorPrincipal controladorPrincipal;

    public ControladorLaberinto(ControladorPrincipal controlador) {
       this.controladorPrincipal = controlador; 
        guiLaberinto = new GUILaberinto(controlador); // Pasa el controlador
        panelLaberinto = guiLaberinto.getPanelLaberinto();
        
    }//Fin metodo sin parametros

    //KeyListener
   
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     //Fin KListener
    
}//fin ControladorLaberinto
