/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

//...
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

//model
import model.Laberinto;
import model.SeelieEnemigo;
import model.KianPersonaje;

//timer
import javax.swing.Timer;

//--view
import view.GUILaberinto;
import view.PanelLaberinto;
import view.GUILose;
import view.GUIWin;

//Código
public class ControllerLaberinto {
    //panel & matriz
    private Laberinto laberinto;
    private PanelLaberinto panelLab;
    //---
    //--- personaje & enemigo ---
    private KianPersonaje kianPersonaje;//Personaje
    private SeelieEnemigo enemigo;
    private Timer enemyTimer;
    //---
    //Lose
    private GUILose guiLose;
    private GUIWin guiWin;
    //timer
    private GUILaberinto guiLaberinto;
    //--------------------------------------
    
    public ControllerLaberinto(KianPersonaje kianPersonaje, SeelieEnemigo enemigo, Laberinto laberinto ) {
        this.laberinto = laberinto; 
        laberinto = new Laberinto(); 
        //------------------
        //personajes
        this.enemigo = enemigo;
        this.kianPersonaje = kianPersonaje;
        //------------------
        
         iniciarMovimientoEnemigo();// Iniciar el movimiento del enemigo
    }//fin metodo con contructor
    //----------------------------------------
 
    // Métodos para actualizar el estado del model y redibujar la vista si es necesario
    public void actualizarJuego() {
        enemigo.movAleatorio(laberinto.getLaberinto());
        panelLab.repaint(); // Redibuja el panel para reflejar los cambios
    }

    public void resetJuego() {
        // Este metodo resetea las  posiciones del personaje y el enemigo, o reiniciar la matriz
        kianPersonaje.setMovX(1);
        kianPersonaje.setMovY(0);
        enemigo.setMoveX(5);
        enemigo.setMoveY(5);
        panelLab.repaint(); // Redibujar después del reset
    }
    //----------------------------------------
    
   //------ Movimiento del enemigo ------
   public void iniciarMovimientoEnemigo() {
        // Configurar el Timer para mover al enemigo cada 200 ms y así tenga algo de rapidez
        enemyTimer = new Timer(100, e -> {
            enemigo.movAleatorio(laberinto.getLaberinto()); // Mover al enemigo aleatoriamente
            panelLab.repaint(); // Redibujar el panel 
        });
        enemyTimer.start(); // Iniciar el Timer
    }
   
   // Método para detener el movimiento del enemigo (si es necesario)
    public void detenerMovimientoEnemigo() {
        if (enemyTimer != null) {
            enemyTimer.stop(); // Detener el Timer
        }
    }
    //---fin movimiento del enemigo 
    //----------------------------------------
    
     public boolean verificarColision() {
        //Este metodo compara las posiciones del personaje y el enemigo
         
        // Obtener las posiciones del personaje y del enemigo
        int kianX = kianPersonaje.getMovX();
        int kianY = kianPersonaje.getMovY();
        int enemigoX = enemigo.getMoveX();
        int enemigoY = enemigo.getMoveY();

        // Verificar si están en la misma posición
        return (kianX == enemigoX && kianY == enemigoY);
    }//fin verificarColision
    //------------------------------------------

}//fin ControllerLaberinto
  

