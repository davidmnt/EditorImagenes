package Controlador;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Interfaz {
    private JPanel PanelPrinc;
    private JMenuBar Menu;
    private JMenu Archivo;
    private JMenu Efecto;
    private JMenuItem Abrir;
    private JMenuItem Guardar;
    private JMenuItem Cerrar;
    private JMenuItem BN;
    private JMenuItem Sepia;
    private JMenuItem Grises;
    private JMenuItem Alto_contraste;
    private JMenuItem Pixelada;
    private JMenuItem Baja_resolución;
    private JLabel ImagenSeleccionada;
    private JButton btn_guardar;
    private JLabel ImagenConvertira;
    private JLabel Imagen1;
    private JSlider progressBarNivel;
    private JLabel imagen2;
    private JLabel Nivel;
    private JLabel Color;
    private JSlider progressBarColor;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new Interfaz().PanelPrinc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,600,550);
        frame.setVisible(true);
    }

    Interfaz(){

        Abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();

                // Filtrar solo archivos de imagen
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif");
                fileChooser.setFileFilter(filter);

                // Mostrar el diálogo para seleccionar el archivo
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {

                    ImagenSeleccionada.setText("");

                    // Obtener el archivo seleccionado
                    File selectedFile = fileChooser.getSelectedFile();

                    // Crear un ImageIcon desde el archivo seleccionado
                    ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

                    Image image = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(image);

                    // Crear un JLabel para mostrar la imagen

                    ImagenSeleccionada.setIcon(scaledIcon);
                }
            }
        });

        BN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ImageIcon icon = new ImageIcon("src/Imagenes/Costa-BN.png");

                Image image = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(image);

                // Crear un JLabel para mostrar la imagen

                ImagenConvertira.setIcon(scaledIcon);

            }
        });

        Sepia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ImageIcon icon = new ImageIcon("src/Imagenes/Costa-sepia.jpg");

                Image image = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(image);

                // Crear un JLabel para mostrar la imagen

                ImagenConvertira.setIcon(scaledIcon);

            }
        });

        Grises.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ImageIcon icon = new ImageIcon("src/Imagenes/Costa-grises.jpg");

                Image image = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(image);

                // Crear un JLabel para mostrar la imagen

                ImagenConvertira.setIcon(scaledIcon);

            }
        });

        Alto_contraste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ImageIcon icon = new ImageIcon("src/Imagenes/Costa-AltoContraste.jpg");

                Image image = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(image);

                // Crear un JLabel para mostrar la imagen

                ImagenConvertira.setIcon(scaledIcon);

            }
        });

        Pixelada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ImageIcon icon = new ImageIcon("src/Imagenes/Costa-pixelada.jpg");

                Image image = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(image);

                // Crear un JLabel para mostrar la imagen

                ImagenConvertira.setIcon(scaledIcon);

            }
        });

        Baja_resolución.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ImageIcon icon = new ImageIcon("src/Imagenes/Costa-BajaCalidad.jpeg");

                Image image = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(image);

                // Crear un JLabel para mostrar la imagen

                ImagenConvertira.setIcon(scaledIcon);

            }
        });




    }


}
