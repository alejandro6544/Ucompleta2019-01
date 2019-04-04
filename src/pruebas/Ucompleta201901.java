/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import control.ControlEstudiante;
import modelo.Estudiante;



/**
 *
 * @author dacastro
 */
public class Ucompleta201901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlEstudiante objce=new ControlEstudiante();
        Estudiante obje=new Estudiante("3696", "963", "Maria", "Camila", "Salazar", "Aguirre", "calle45", "sd@uao.edu.co", "Nocurna", "D:/Users/admin-sala3/Documents/1.jpg");
        
        boolean f=objce.insertarEstudianteImagen(obje);
        
        if(f){
            
            System.out.println("Se inserto el estudiante");
        }else{
            System.out.println("No se inserto el estudiante");
        }
        
    }
    
}
