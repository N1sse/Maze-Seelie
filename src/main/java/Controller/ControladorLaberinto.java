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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//--view
import view.GUILaberinto;
import view.PanelLaberinto;

//Codigo
public class ControladorLaberinto implements MouseListener{
    private GUILaberinto guiLaberinto;
    private PanelLaberinto panelLaberinto;
    private ControladorPrincipal controladorPrincipal;

    public ControladorLaberinto(ControladorPrincipal controlador) {
       this.controladorPrincipal = controlador; 
        guiLaberinto = new GUILaberinto(controlador); // Pasa el controlador
        panelLaberinto = guiLaberinto.getPanelLaberinto();
        
    }//Fin metodo sin parametros

    //MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
           
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }
    //Fin MouseListener
    
}//fin ControladorLaberinto
