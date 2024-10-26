/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ramir
 */
public class Laberinto {
    
    private int[][] laberinto;
    
    //llamar al personaje
    private KianPersonaje kianPersonaje;
    
    //llamar al enemigo
    private SeelieEnemigo seelieEnemigo;
    
    public Laberinto() {
        laberinto = new int[][] {
            
            // Este método define la matriz del laberinto, definiendo el camino (0) 
            //,obstáculos (1), el limite del laberinto(2) y la parte final(3)
            {2,0,0,0,1,0,0,0,1,0,1,2},
            {2,1,1,0,1,0,1,0,1,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,1,1,1,0,1,0,0,1,0,2},
            {2,0,0,0,0,0,1,0,0,1,0,2},  //El limite se dejo por cuestiones de diseño
            {2,0,1,0,1,0,1,1,0,1,0,2},
            {2,0,0,0,1,0,0,0,0,0,0,2},
            {2,0,0,1,1,1,0,1,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,1,0,2},
            {2,1,0,0,1,0,0,1,0,1,3,2}
        };
    }//fin metodo 
     //
    
    //get Laberinto
    public int[][] getLaberinto(){
        return laberinto;
    }//fin getLaberinto
    //--------------

    
    //--gets Personaje & Enemigo 
    public KianPersonaje getKianPersonaje() {
        return kianPersonaje;
    }//fin getKian..

    public SeelieEnemigo getSeelieEnemigo() {
        return seelieEnemigo;
    }//fin getSeelie..
     //--------------
    
}//fin Laberinto