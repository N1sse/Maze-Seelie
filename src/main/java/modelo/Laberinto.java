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
    
    public Laberinto() {
        laberinto = new int[][] {
            
            // Este método define qué partes del laberinto son caminos (0) 
            //y cuáles son obstáculos (1).
            {1,0,0,0,1,0,0,0,1,0,1,1},
            {1,1,1,0,1,0,1,0,1,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,1,1,0,1,0,0,1,0,1},
            {1,0,0,0,0,0,1,0,0,1,0,1},
            {1,0,1,0,1,0,1,1,0,1,0,1},
            {1,0,0,0,1,0,0,0,0,0,0,1},
            {1,0,0,1,1,1,0,1,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,1,0,1},
            {1,1,0,0,1,0,0,1,0,1,0,1}
        };
    }
    
    public int getCelda(int fila, int columna) {
        //Este metodo devuelve el valor de una celda
        return laberinto[fila][columna]; 
    }
}