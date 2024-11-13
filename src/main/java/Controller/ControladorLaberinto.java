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

//modelo
import modelo.Laberinto;
import modelo.SeelieEnemigo;
import modelo.KianPersonaje;

//--view
import view.GUILaberinto;
import view.PanelLaberinto;


//Codigo
public class ControladorLaberinto implements KeyListener{
    
    private Laberinto laberinto;
    private PanelLaberinto panelLab;
    private SeelieEnemigo enemigo;
    private KianPersonaje kianPersonaje;

    public ControladorLaberinto(Laberinto laberinto, PanelLaberinto panelLab, SeelieEnemigo enemigo, KianPersonaje kianPersonaje) {
        this.panelLab = panelLab;
        this.enemigo = enemigo;
        this.kianPersonaje = kianPersonaje;
    }//metodo constructor con parametros
    
    
    @Override
    public void keyPressed(KeyEvent e) {
        int Tecla = e.getKeyCode();
       
       switch (Tecla){
          case KeyEvent.VK_UP:
            kianPersonaje.mover("ARRIBA", laberinto.getLaberinto());
              System.out.println("Funciona");
            break;
        case KeyEvent.VK_DOWN:
            kianPersonaje.mover("ABAJO", laberinto.getLaberinto());
            System.out.println("Funciona");
            break;
        case KeyEvent.VK_LEFT:
            kianPersonaje.mover("IZQUIERDA", laberinto.getLaberinto());
            System.out.println("Funciona");           
            break;
        case KeyEvent.VK_RIGHT:
            kianPersonaje.mover("DERECHA", laberinto.getLaberinto());
            System.out.println("Funciona");
            break;  
       }
        enemigo.movAleatorio(laberinto.getLaberinto());
        panelLab.repaint();
        panelLab.requestFocusInWindow();

    }
    
    @Override
    public void keyTyped(KeyEvent e){
    }


    @Override
    public void keyReleased(KeyEvent e) {
        
         }
     
}//fin ControladorLaberinto
