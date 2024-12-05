/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import view.GUIPrincipal;

public class ControllerPrincipal {
    public ControllerPrincipal() {
        //Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido a Seelie Adventure..", "Greetings", JOptionPane.INFORMATION_MESSAGE);
        
        //Codigo para el juego
        GUIPrincipal guiPrincipal = new GUIPrincipal();//Se hcia una instancia y se inicializa el juego 
        guiPrincipal.setVisible(true);//Para dear visible el guiPrincipal apenas se acciona el juego
    }
}
