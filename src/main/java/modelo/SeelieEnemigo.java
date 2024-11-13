/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;

/**
 *
 * @author ramir
 */
public class SeelieEnemigo {

   private int moveX;
   private int moveY;
   private Random random = new Random();

    public SeelieEnemigo(int moveX, int moveY) {
        this.moveX = moveX;
        this.moveY = moveY;
    }//metodo constructor con parametros
    //---------------------------
    
    public void movAleatorio ( int [] [] laberinto){
        //Este método mueve al enemigo en el laberinto 
       int mover = random.nextInt(4);
       switch (mover ){
           
           case 0: // mover para arriba 
               if (moveY >0 && laberinto [ moveY - 1] [moveX]==0) moveY--;
               break;
               
           case 1: // mover para abajo 
               if (moveY < laberinto.length -1 && laberinto [ moveY +1] [moveX]==0) moveY++;
               break;
               
           case 2: // mover izquierda 
               if (moveY >0 && laberinto [ moveY -1] [moveY]==0) moveX--;
               break;
               
           case 3: // mover derecha
               if (moveX < laberinto[0].length-1 && laberinto [ moveY ] [moveX +1 ]==0) moveX++;
               break;
               
               
       }
       
    }
   //---------------------------
  
    //-- Get & Set MovX
    public void setMoveX(int movX) {
        this.moveX = movX;
    }
    public int getMoveX(){
     return moveX;
    }

    //---------------------------
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
   
   
}//fin seelie
    
