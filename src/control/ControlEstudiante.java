/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Estudiante;

/**
 *
 * @author dacastro
 */
public class ControlEstudiante {

    public boolean insertarEstudiante(Estudiante obje) {
        String sql="Insert into estudiantes(identificacione, codigoe, nombre1e, apellido1e, direccione, correoe, jornada)"+
                "value('"+obje.getIdentificacione()+"', '"+obje.getCodigoe()+"', '"+obje.getNombre1e()+"', '"+
                obje.getApellido1e()+"', '"+obje.getDireccione()+"', '"+obje.getCorreoe()+"', '"+obje.getJornada()+"')";
        
        boolean f=false;
        f=obje.insertarEstdudiante(sql);
        
        return f;
    }
    
}
