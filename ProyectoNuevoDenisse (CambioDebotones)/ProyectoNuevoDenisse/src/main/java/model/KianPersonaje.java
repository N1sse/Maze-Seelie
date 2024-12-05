/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author ramir
 */
public class KianPersonaje {
    //atributos
    private int movX;
    private int movY;
    private int vidas=2;
   //--------------------------------------
    
    public KianPersonaje(int movX, int movY) {
        this.movX = movX;
        this.movY = movY;
    }
    //--------------------------------------
    
    public void mover(String direccion, int[][] laberinto) {
        //Este metodo se encarga del movimiento de Kian(El personaje)
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
        //-------
 
        // Verificar el movimiento y si el personaje está dentro de los límites, si hay una pared o si hay agua
        if (nuevaY >= 0 && nuevaY < laberinto.length
                && nuevaX >= 0 && nuevaX < laberinto[0].length
                && laberinto[nuevaY][nuevaX] != 1 //1=Pared
                && laberinto[nuevaY][nuevaX] != 2 //2=Limites
                && laberinto[nuevaY][nuevaX] != 4 //4=agua
                ) { // 1 es una pared
            movX = nuevaX;
            movY = nuevaY;
        }
    }//fin mover
    //--------------------------------------
    
    //---set & get MovX
    public void setMovX(int movX) {
        this.movX = movX;
    }
    public int getMovX() {
        return movX;
    }
    //--------------------------------------
    
    //---set & get MovY
    public void setMovY(int movY) {
        this.movY = movY;
    }
     public int getMovY() {
        return movY;
    }
    //--------------------------------------
    public int getVidas() {
     return vidas;
     }
     
      public void perderVidas(){
         vidas--;
     }
    

}//fin kian

