/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alejo
 */
public class FileController {
    
     JFileChooser chooser;
     public FileController() {
        chooser = new JFileChooser();
    }
    
    public File cargarArchivos(String tipo, String tipo2, String ext, String ext2) {
        JFrame obj = new JFrame();
//        obj.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icons/32.png")).getImage());

        String ruta = "";
        File files = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(tipo, tipo2, ext, ext2);

        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(obj);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            files = chooser.getSelectedFile();
            //System.out.println("nombre archivo seleccionado "+files[0].getName());
        }

        return files;//.getAbsolutePath().toString();
    }
    
    public String obtenerCarpetaUsuario() {
        String ruta = "";
        JFrame obj = new JFrame();
        //obj.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icons/32.png")).getImage());

        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Escoger Carpeta de Experiencia");

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        chooser.setAcceptAllFileFilterUsed(false);
        //    
        int returnVal = chooser.showOpenDialog(obj);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ruta = chooser.getSelectedFile().toString();
        } else {
            System.out.println("No Selection ");
        }

        return ruta;
    }
}
