/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.reproductorwav;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.util.logging.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

/**
 *
 * @author pablo
 */
public class ReproductorWAV {

    public static void main(String[] args) {

        Interfaz reproductor = new Interfaz();

        reproductor.comenzar();

    }

    public static class Interfaz {

        private FramePer marco;
        private JPanel principal, central, inferior;
        private JTextField campoTexto;
        private JButton selector, play, stop;
        private File archivo;
        private Clip miClip;
        private AudioInputStream puente;

        public Interfaz() {
            marco = new FramePer(400, 120, "Reproductor WAV", true);
            principal = new JPanel(new BorderLayout());
            central = new JPanel();
            inferior = new JPanel();
            campoTexto = new JTextField(20);

            selector = new JButton("Abrir");
            play = new JButton("Play");
            stop = new JButton("Stop");

            archivo = null;

        }

        public void comenzar() {

            montarEscena();
            abrir();

        }

        private void abrir() {

            marco.setVisible(true);

        }

        private void montarEscena() {

            //Panel central.
            campoTexto.setEditable(false);
            selector.addActionListener(e -> abrirSelector()); //expresion lamda

            central.add(campoTexto);
            central.add(selector);

            //Panel inferior.
            play.addActionListener(e -> reproducir());
            stop.addActionListener(e -> detener());

            inferior.add(play);
            inferior.add(stop);

            //Panel principal.
            principal.add(central, BorderLayout.CENTER);
            principal.add(inferior, BorderLayout.SOUTH);

            marco.add(principal);

        }

        //Generar ventana para seleccionar archivos
        private void abrirSelector() {

            JFileChooser ventanaSeleccion = new JFileChooser();
            ventanaSeleccion.showOpenDialog(ventanaSeleccion);

            archivo = ventanaSeleccion.getSelectedFile();

            String nombreArchivo = archivo.getName();

            if (comprobarFormato(nombreArchivo)) {
                campoTexto.setText(nombreArchivo);
            } else {

                campoTexto.setText("Archivo no válido");
                archivo = null;

            }

        }

        private boolean comprobarFormato(String nombre) {

            String formato = nombre.substring(nombre.length() - 4);

            if (formato.equalsIgnoreCase(".wav")) {
                return true;
            } else {
                return false;
            }
        }

        private void reproducir() {

            if (archivo != null) {

                try {
                    puente = AudioSystem.getAudioInputStream(archivo);
                    miClip = AudioSystem.getClip();

                    miClip.open(puente);
                    miClip.start();

                } catch (UnsupportedAudioFileException e) {
                    e.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();

                } catch (LineUnavailableException ex) {
                    ex.printStackTrace();
                }

            } else {
                campoTexto.setText("Ningún archivo seleccionado");
            }
        }

        private void detener() {

            if (miClip != null) {

                if (miClip.isRunning()) {
                    try {
                        miClip.stop();
                        miClip.close();
                        puente.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

    }

}
