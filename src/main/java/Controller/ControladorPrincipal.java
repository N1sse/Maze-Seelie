/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ramir
 */

//-------imports-------

//--actions
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//--modelo
import modelo.KianPersonaje;
import modelo.SeelieEnemigo;
//---view
import view.GUIHistoria;
import view.GUIIntrucciones;
import view.GUILaberinto;
import view.GUIPrincipal;

//codigo
public class ControladorPrincipal implements ActionListener{
    //view
    private GUIPrincipal guiPrincipal;
    private GUIIntrucciones guiIntrucciones;
    private GUIHistoria guiHistoria;
    private GUILaberinto guiLaberinto;
    
    //modelo
    private KianPersonaje kianPersonaje;
    private SeelieEnemigo seelieEnemie;

    public ControladorPrincipal() {
        /*Este metodo inicializa las interfaces gráficas para el menú principal, 
        instrucciones, historia y laberinto.*/
        
        //menu-pagina inicio
        guiPrincipal = new GUIPrincipal(this);
   
        //instrucciones - historia
        guiIntrucciones = new GUIIntrucciones(this);
        guiHistoria = new GUIHistoria(this);
        
        //Laberinto
        guiLaberinto = new GUILaberinto(this);
        
        guiPrincipal.setVisible(true);
    }//metodo constructor sin parametros
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
           
            //botones del menu
            case "btnJugar":
                 guiLaberinto.setVisible(true);
                 guiPrincipal.setVisible(false);

                break;
            
            case "btnHistoria":
                guiHistoria.setVisible(true);
                guiPrincipal.setVisible(false);
                break; 
                
            case "btnInstruciones":
                guiIntrucciones.setVisible(true);
                guiPrincipal.setVisible(false);
                break;
                
            case "btnSalir":
                 System.exit(0);
                break;   
            //fin botones menu
                
            //Botones para regresar al main
                
           //Boton en Instrucciones     
            case "btnXCerrar":  
                guiIntrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
            
            //Boton en Historia    
            case "btnClose":  
                guiHistoria.setVisible(false);
                guiPrincipal.setVisible(true);
                break;   
            
        //boton en guiLaberinto
            case "btnVolver":  
                guiLaberinto.setVisible(false);
                guiPrincipal.setVisible(true);
                break;       
        }//fin switch
        
    }//fin actionPerformed
    
}//fin ControladorPrincipal
