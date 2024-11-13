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
    private int[][] laberinto;// Se declara la matriz bidimensional que representa el laberinto.
   
    //llamar al personaje
    private KianPersonaje personajeKian;
    
    //llamar al enemigo
    private SeelieEnemigo enemigo;
    
    public Laberinto() {
        laberinto = new int[][] {
            
            // Este método define la matriz del laberinto, definiendo el camino (0) 
            //,obstáculos (1), el limite del laberinto(2) y la parte final(3).
            //otras partes laberinto: agua (4)
            {2,0,0,0,1,0,0,0,1,0,1,2},
            {2,1,1,0,4,0,1,0,1,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,1,1,1,0,1,0,0,1,0,2},
            {2,0,0,0,0,0,1,0,4,1,0,2},  //El limite se dejo por cuestiones de diseño
            {2,0,1,0,1,0,1,1,0,1,0,2},
            {2,0,0,0,1,0,0,0,0,4,0,2},
            {2,0,0,1,1,1,0,1,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,1,0,2},
            {2,1,4,0,1,0,0,1,0,1,3,2}   //son 12columnas (columna 0 y columna 11 son limites )
          // 10 filas 
         };        
                 //Inicializar al personaje y al enemigo
        personajeKian = new KianPersonaje(1, 0);//Esquina superior izq
        enemigo = new SeelieEnemigo( 10,9); // estara en la esquina inferior derecha 
    
    }//fin metodo 
    
    //get Laberinto
    public int[][] getLaberinto(){
        return laberinto;
    }//fin getLaberinto
    //--------------
     
    //--gets Personaje & Enemigo 
    public KianPersonaje getPersonajeKian() {
        return personajeKian;
    }//fin getKian..

    public SeelieEnemigo getSeelieEnemigo() {
        return enemigo;
    }//fin getSeelie..
     //--------------

   
    
}//fin Laberinto