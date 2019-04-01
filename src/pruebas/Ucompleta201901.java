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
        Estudiante obje=new Estudiante("1478", "20112", "Mariano", "Gutierrez", "car56", "mgutierrez@uao.edu.co", "Diurna");
        boolean f=objce.insertarEstudiante(obje);
        
        if(f){
            
            System.out.println("Se inserto el estudiante");
        }else{
            System.out.println("No se inserto el estudiante");
        }
        
    }
    
}
