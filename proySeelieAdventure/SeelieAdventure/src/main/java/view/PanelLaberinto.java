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
import Controller.ControllerLaberinto;
import java.awt.Color;
import java.awt.Dimension;

//--graphics
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

//--model
import model.Laberinto;
import model.SeelieEnemigo;
import model.KianPersonaje;

//codigo
public class PanelLaberinto extends JPanel {

    // Llamar matriz
    private Laberinto matrizL;

    // Personaje & enemigo
    KianPersonaje kianPersonaje;
    private SeelieEnemigo enemigo;

    // Controlador
    private ControllerLaberinto controladorLab;

    // Imágenes
    private Image camino, pared, limite, agua, pista;
    private Image imagenKian;
    private Image imagenEnemigo;

    //view-gui
    private GUILose guiLose;
    private GUILaberinto guiLaberinto;
    private GUIWin guiWin;
    //------------

    public PanelLaberinto() {
    initComponents(); // Inicializar los componentes generados por NetBeans

    // Verificar si estamos en tiempo de ejecución
    if (!java.beans.Beans.isDesignTime()) {
        // Declarar matriz y configurar personajes
        this.matrizL = new Laberinto();
        this.kianPersonaje = matrizL.getPersonajeKian(); // Protagonista
        this.enemigo = matrizL.getSeelieEnemigo(); // Enemigo

        // Verificación de colisión
        this.controladorLab = new ControllerLaberinto(kianPersonaje, enemigo, matrizL);

        cargarImagenes(); // Cargar imágenes necesarias

        // Configurar KeyListener
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Tecla presionada: " + KeyEvent.getKeyText(e.getKeyCode()));
                manejarTeclaPresionada(e);
            }
        });

        // Configurar el tamaño y el foco
        this.setPreferredSize(new Dimension(554, 459));
        this.setFocusable(true);
        this.requestFocusInWindow();

        // Detectar foco
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                System.out.println("El PanelLaberinto tiene el foco");
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                System.out.println("El PanelLaberinto perdió el foco");
            }
        });

        // Inicializar las vistas relacionadas
        this.guiWin = new GUIWin();
        this.guiLose = new GUILose();
    }
}//fin metodo PanelLaberinto sin parametros
//------------------------------------------------

    private void manejarTeclaPresionada(KeyEvent e) {
       //Este metodo indica cual tecla se selecciona y muestra ventanas según la posicion del personaje
        System.out.println("Tecla detectada: " + KeyEvent.getKeyText(e.getKeyCode()));

        int prevX = kianPersonaje.getMovX();
        int prevY = kianPersonaje.getMovY();

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                kianPersonaje.mover("ARRIBA", matrizL.getLaberinto());
                break;
            case KeyEvent.VK_DOWN:
                kianPersonaje.mover("ABAJO", matrizL.getLaberinto());
                break;
            case KeyEvent.VK_LEFT:
                kianPersonaje.mover("IZQUIERDA", matrizL.getLaberinto());
                break;
            case KeyEvent.VK_RIGHT:
                kianPersonaje.mover("DERECHA", matrizL.getLaberinto());
                break;
        }//fin del switch

        // Solo redibujar si hubo un cambio de posición
        if (prevX != kianPersonaje.getMovX() || prevY != kianPersonaje.getMovY()) {
            System.out.println("Posición de Kian actualizada: X=" + kianPersonaje.getMovX() + ", Y=" + kianPersonaje.getMovY());
            enemigo.movAleatorio(matrizL.getLaberinto());

            // Verificar colisión
            if (controladorLab.verificarColision()) {
                System.out.println("*********\n \n. \n. \n   *Advertencia* \n--------------------\nKian y Seelie en la misma posición\n \n. \n. \n*********");
                JOptionPane.showMessageDialog(this, "¡No!, Te atrapó el Seelie", "Game Over", JOptionPane.WARNING_MESSAGE);
                abrirLose(kianPersonaje.getMovX(), kianPersonaje.getMovY(), enemigo.getMoveX(), enemigo.getMoveY());
                setFocusable(false);
            }

            // Verificar posición de Kian
            verificarWin(kianPersonaje.getMovX(), kianPersonaje.getMovY());
        }

        repaint(); // Redibujar solo una vez
    }
    //------------------------------------------------
    
    private void abrirLose(int kX, int kY, int sX, int sY) {
        // Verificar si Kian está en la posición del enemigo
        if (kX == sX && kY == sY) {
            System.out.println("*********\n \n. \n*Noficación* \n--------------------\nSirve el método abrir Lose.\n. \n*********"); // Mensaje para chequear que sirva el método
            setFocusable(false);
            SwingUtilities.invokeLater(() -> {
                guiLose.setVisible(true);
                controladorLab.resetJuego();
                guiLaberinto.dispose(); // Cerrar el panel principal
            });
        }
    }

    // Método para verificar posición específica
    private void verificarWin(int kX, int kY) {
        // Verificar si Kian está en la posición (10, 7)
        if (kX == 10 && kY == 7) {
            System.out.println("*********\n \n. \n. \n   *Noficación* \n--------------------\nLlegaste a la meta. \n¡Ganaste! \n \n. \n. \n*********"); // Mensaje para chequear que sirva el método
            JOptionPane.showMessageDialog(this, "¡Has llegado a la meta!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            setFocusable(false);
            SwingUtilities.invokeLater(() -> {
                guiWin.setVisible(true);
                guiLaberinto.dispose(); // Cerrar el panel principal
            });
        }
    }

    //---------------------------- 
    private void cargarImagenes() {
        // Este método carga las imágenes en el panel
        camino = new ImageIcon(getClass().getResource("/img/camino.png")).getImage();
        pared = new ImageIcon(getClass().getResource("/img/pared.png")).getImage();
        limite = new ImageIcon(getClass().getResource("/img/limite.png")).getImage();
        pista = new ImageIcon(getClass().getResource("/img/pista.png")).getImage();
        agua = new ImageIcon(getClass().getResource("/img/agua.png")).getImage();
        imagenKian = new ImageIcon(getClass().getResource("/img/kianPersonaje.gif")).getImage();
        imagenEnemigo = new ImageIcon(getClass().getResource("/img/enemigo.gif")).getImage();
    } // fin cargar imagenes

    // Dibujar matriz en el panel
    @Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Verificar si estamos en tiempo de diseño
    if (java.beans.Beans.isDesignTime()) {
        // Dibujar un marcador en tiempo de diseño
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawString("Aquí esta el panel, no vemos el laberinto desde el editor de diseño", 10, 20);
    } else {
        // Dibujar el contenido real en tiempo de ejecución
        if (matrizL != null && kianPersonaje != null && enemigo != null) {
            int[][] laberinto = matrizL.getLaberinto();
            int size = 45; // Tamaño de cada celda

            // Dibujar la matriz
            for (int y = 0; y < laberinto.length; y++) {
                for (int x = 0; x < laberinto[y].length; x++) {
                    switch (laberinto[y][x]) {
                        case 0 -> g.drawImage(camino, x * size, y * size, size, size, this);
                        case 1 -> g.drawImage(pared, x * size, y * size, size, size, this);
                        case 2 -> g.drawImage(limite, x * size, y * size, size, size, this);
                        case 3 -> g.drawImage(pista, x * size, y * size, size, size, this);
                        case 4 -> g.drawImage(agua, x * size, y * size, size, size, this);
                    }
                }
            }

            // Dibujar el personaje y el enemigo
            g.drawImage(imagenKian, kianPersonaje.getMovX() * size, kianPersonaje.getMovY() * size, size, size, this);
            g.drawImage(imagenEnemigo, enemigo.getMoveX() * size, enemigo.getMoveY() * size, size, size, this);
        } else {
            // Si no hay datos cargados, mostrar un mensaje
            g.setColor(Color.RED);
            g.drawString("Cargando datos del laberinto...", 10, 20);
        }
    }
}
 // fin paintComponent

// fin paintComponent
    //--------------------------------
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
