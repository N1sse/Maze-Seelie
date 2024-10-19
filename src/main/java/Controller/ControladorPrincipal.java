/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ramir
 */

//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//---view
import view.GUIHistoria;
import view.GUIIntrucciones;
import view.GUILaberinto;
import view.GUIPrincipal;

//codigo
public class ControladorPrincipal implements ActionListener{
    private GUIPrincipal guiPrincipal;
    private GUIIntrucciones guiIntrucciones;
    private GUIHistoria guiHistoria;
    private GUILaberinto guiLaberinto;

    public ControladorPrincipal() {
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
                
            case "btnXCerrar":  
                guiIntrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
                
            case "btnClose":  
                guiHistoria.setVisible(false);
                guiPrincipal.setVisible(true);
                break;   
                
            case "btnVolver":  
                guiLaberinto.setVisible(false);
                guiPrincipal.setVisible(true);
                break;       
        }
    }
    
}
