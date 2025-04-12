package co.edu.uniquindio.poo.PreParcial2;
import javax.swing.*;
import java.awt.*;

public class Punto6 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Imágenes");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 1000); // Puedes ajustar el tamaño inicial

        // Panel donde estarán las imágenes, con diseño vertical
        JPanel panelImagenes = new JPanel();
        panelImagenes.setLayout(new BoxLayout(panelImagenes, BoxLayout.Y_AXIS));

        // Cargar imágenes
        ImageIcon imagen1 = new ImageIcon("imagenes/A.jpeg");
        ImageIcon imagen2 = new ImageIcon("imagenes/B.jpeg");
        ImageIcon imagen3 = new ImageIcon("imagenes/C.jpeg");

        // Etiquetas con imágenes
        JLabel label1 = new JLabel(imagen1);
        JLabel label2 = new JLabel(imagen2);
        JLabel label3 = new JLabel(imagen3);

        // Agregar etiquetas al panel
        panelImagenes.add(label1);
        panelImagenes.add(Box.createVerticalStrut(10)); // Espacio entre imágenes
        panelImagenes.add(label2);
        panelImagenes.add(Box.createVerticalStrut(10));
        panelImagenes.add(label3);

        // Scroll para el panel de imágenes
        JScrollPane scroll = new JScrollPane(panelImagenes);

        // Añadir scroll a la ventana
        ventana.add(scroll);

        ventana.setVisible(true);
    }
}
//JAJAJAJAJAJJAJAJAJAJJAJAJJAJAJ
//Le anexo las imagenes fuera en otra carpeta dentro del repositorio
