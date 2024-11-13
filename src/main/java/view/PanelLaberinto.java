/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author ramir
 */

//-----imports-----
//--controlador
import Controller.ControladorLaberinto;
import java.awt.Dimension;

//--graphics
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

//--border
import javax.swing.BorderFactory;

//--imageIcon
import javax.swing.ImageIcon;
import javax.swing.JPanel;

//modelo
import modelo.KianPersonaje;
import modelo.Laberinto; //matriz
import modelo.SeelieEnemigo;

//codigo
//codigo
public class PanelLaberinto extends JPanel {
    //controller
    private ControladorLaberinto controladorLaberinto;
   
    //personaje & enemigo
    private KianPersonaje kianPersonaje;
    private SeelieEnemigo enemigo;
    
    // Imágenes
    private Image camino,  pared, limite, agua, pista;
    private Image imagenKian;
    private Image imagenEnemigo;
    
    // Llamar matriz
    private Laberinto matrizL;
    
    

    public PanelLaberinto() {
        initComponents();
        
        // Declarar Matriz
        this.matrizL = new Laberinto(); 
 
        //llamar al personaje & el enemigo
        this.kianPersonaje = matrizL.getPersonajeKian();
        this.enemigo=matrizL.getSeelieEnemigo();
        
        cargarImagenes();
        
        // Inicializar controlador y asignarlo como KeyListener
        this.controladorLaberinto = new ControladorLaberinto(matrizL, this, enemigo, kianPersonaje);
        this.addKeyListener(controladorLaberinto);
        
        // Tamaño y enfocarlo en el medio
        this.setPreferredSize(new Dimension(554, 459)); // tamaño de preferencia
        this.setFocusable(true); // mantener el panel en el foco      
        this.requestFocusInWindow();
      
        this.setVisible(true);//hacer visible el panel
    }
    
    //----------------------------
     public void addNotify() {
        super.addNotify();
        this.requestFocusInWindow();
    }
     
    //---------------------------- 
    private void cargarImagenes() {
        // Este método es para cargar las imágenes en los números en la matriz
        camino = new ImageIcon(getClass().getResource("/img/camino.png")).getImage();
        pared = new ImageIcon(getClass().getResource("/img/pared.png")).getImage();
        limite = new ImageIcon(getClass().getResource("/img/limite.png")).getImage();
        pista = new ImageIcon(getClass().getResource("/img/pista.png")).getImage();
        agua = new ImageIcon(getClass().getResource("/img/agua.png")).getImage();
        imagenKian = new ImageIcon(getClass().getResource("/img/kianPersonaje.gif")).getImage();
        imagenEnemigo = new ImageIcon(getClass().getResource("/img/enemigo.gif")).getImage();
    }

    private Image cargarImagen(String ruta) {
        // Este método está para el manejo de error, así si hay algún error se gestionara de manera más fácil
        try (InputStream is = getClass().getResourceAsStream(ruta)) {
            if (is == null) {
                System.err.println("Error: No se encontró la imagen " + ruta);
                return null;
            }
            return ImageIO.read(is);
        } catch (IOException e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
            return null;
        }
    }

    // Dibujar matriz en el panel
    @Override
    protected void paintComponent(Graphics g) {
        //este metodo dibuja los personajes y el laberinto
        super.paintComponent(g);
        int[][] laberinto = matrizL.getLaberinto(); // Invoca la matriz en la clase Laberinto
        int size = 45; // Tamaño para las imágenes

        // Dibujar la matriz
        for (int y = 0; y < laberinto.length; y++) {
            for (int x = 0; x < laberinto[y].length; x++) {
                switch (laberinto[y][x]) {
                    case 0:
                        g.drawImage(camino, x * size, y * size, size, size, this);
                        break;
                    case 1:
                        g.drawImage(pared, x * size, y * size, size, size, this);
                        break;
                    case 2:
                        g.drawImage(limite, x * size, y * size, size, size, this);
                        break;
                    case 3:
                        g.drawImage(pista, x * size, y * size, size, size, this);
                        break;
                    case 4:
                        g.drawImage(agua, x * size, y * size, size, size, this);
                        break;
                }
            }
        }

       // Dibuja al personaje y al enemigo en sus posiciones
        int movX = kianPersonaje.getMovX();
        int movY = kianPersonaje.getMovY();
        g.drawImage( imagenKian, movX * size, movY * size, size, size, this);

        int moveX = enemigo.getMoveX();
        int moveY = enemigo.getMoveY();
        g.drawImage(imagenEnemigo, moveX * size, moveY * size, size, size, this);

    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
