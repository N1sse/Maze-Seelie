/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ramir
 */

//-----Imports-----
import java.awt.Graphics;
import javax.swing.ImageIcon;

//--Codigo
public class Movimiento {
    private int fila;
    private int columna;
    private int x;
    private int y;
    private ImageIcon imagen;

    public Movimiento(int fila, int columna, int x, int y, ImageIcon imagen) {
        this.fila = fila;
        this.columna = columna;
        this.x = x;
        this.y = y;
        this.imagen = imagen;
    }//metodo con para metros


    //--Set & Get Fila
    public void setFila(int fila) {
        this.fila = fila;
    }
    
    public int getFila() {
        return fila;
    }
    //--------------
    
    //--Set & Get Columna
    public void setColumna(int columna) {
        this.columna = columna;
    }//fin setColumna
   
    public int getColumna() {
        return columna;
    }//fin getColumna
     //--------------
    
    
    //--Set & Get X
    public int getX() {
        return x;
    }//fin getX

    public void setX(int x) {
        this.x = x;
    }//fin setX
    //--------------
    
    
    //--Set & Get Y
    public void setY(int y) {
        this.y = y;
    }//fin set Y
    
    public int getY() {
        return y;
    }//fin get Y
    //--------------

    
    //--Set & Get Imagen
     public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }//fin setImagen
     
    public ImageIcon getImagen() {
        return imagen;
    }//fin getImagen
    //--------------
    
    
    //--show
    public void show(Graphics g){
        imagen.paintIcon(null, g, x, y);
    }
    
}//fin Movimiento
