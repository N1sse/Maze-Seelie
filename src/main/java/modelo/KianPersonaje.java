/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Graphics;
import Controller.ControladorLaberinto;

/**
 *
 * @author ramir
 */
public class KianPersonaje {

    private int movX;
    private int movY;
     

       public KianPersonaje (int movX, int movY) {
        this.movX = movX;
        this.movY = movY;
    }
    public void mover ( String direccion, int [] [] laberinto){
        
        int nuevaX = movX;
        int nuevaY = movY;
        
        
        switch (direccion) {
            
            case "ARRIBA":
                nuevaY--;
                break;
             case "ABAJO":
                nuevaY++;
                break;
             case "IZQUIERDA":
                nuevaX--;
                break;
             case "DERECHA":
                nuevaX++;
                break;   
        }
        //VERIFICAR 
        if (nuevaY >= 0&&  nuevaY < laberinto.length &&
            nuevaX >= 0 && nuevaX < laberinto[0].length){
            
            int valorCelda = laberinto [nuevaY][nuevaX]; 
             
            switch (valorCelda){
                //Aquí se representan las acciones que haran en la matriz
                case 0://camino libre
                System.out.println("Esta caminando y se encuentra en x:" + movX + " y en posicion Y:" + movY);
                movX = nuevaX;
                movY = nuevaY;
                break;
                
                case 1://Obstaculo - Pared
                System.out.println("Se encontro una pared");
                break;
                
                case 2: //Limite
                System.out.println("Estos son lo límites de los lados del laberinto"); 
                break;
                
                case 3://parte final
                System.out.println("¡Has llegado a la meta! "); 
                movX = nuevaX;
                movY = nuevaY;
                break;
                
                case 4: //Agua
                System.out.println("Aquí hay un obstaculo de agua"); 
                break;
                
                default: //Obstaculo y cualquier otro valor
            }
            
        }else{
            System.out.println("Este movimiento esta fuera de los límites"); 
        }//fin if-else
    }//fin mover

    public int getMovX() {
        return movX;
    }

    public int getMovY() {
        return movY;
    }
  
    
}

