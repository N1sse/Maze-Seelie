/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;
import view.GUILaberinto;

/**
 *
 * @author ramir
 */
public class SeelieEnemigo {
     private int moveX; // Posición X del enemigo
     private int moveY; // Posición Y del enemigo
     private Random random = new Random(); // Para generar movimientos aleatorios
     private GUILaberinto guiLaberinto;
     //----------------
     
     // Constructor de SeelieEnemigo 
     public SeelieEnemigo(int moveX, int moveY) {
         this.moveX = moveX;
         this.moveY = moveY;
     }
     //----------------
     
     // Método para mover al enemigo aleatoriamente dentro del laberinto
     public void movAleatorio(int[][] laberinto) {
       int mover = random.nextInt(4); // Generar un número aleatorio entre 0 y 3
       switch (mover) {
         case 0: // Mover hacia arriba
             if (moveY > 0 && laberinto[moveY - 1][moveX] == 0) { // Verificar si la celda estálibre
                 moveY--;
         }
         break;
         case 1: // Mover hacia abajo
             if (moveY < laberinto.length - 1 && laberinto[moveY + 1][moveX] == 0) { // Verificar si la celda está libre
                 moveY++;
         }
         break;
         case 2: // Mover hacia la izquierda
             if (moveX > 0 && laberinto[moveY][moveX - 1] == 0) { // Verificar si la celda está libre
                 moveX--;
         }
         break;
         case 3: // Mover hacia la derecha
             if (moveX < laberinto[0].length - 1 && laberinto[moveY][moveX + 1] == 0) { // Verificar si la celda está libre
                 moveX++;
             }
         break;
         }
 
     }//fin movAleatorio
     //------------------------------------

    //-- Get & Set MovX
    public void setMoveX(int movX) {
        this.moveX = movX;
    }

    public int getMoveX() {
        return moveX;
    }

    //----------------
    //-- Get & Set MovY
    public void setMoveY(int movY) {
        this.moveY = movY;
    }

    public int getMoveY() {
        return moveY;
    }

    //---------------------------
    //-- Get & Set Random
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

}//fin SeelieEnemigo
