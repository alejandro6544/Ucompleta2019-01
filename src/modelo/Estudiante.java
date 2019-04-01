/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dacastro
 */
public class Estudiante {
    
    private String identificacione;
    private String codigoe;
    private String nombre1e;
    private String nombre2e;
    private String apellido1e;
    private String apellido2e;
    private String direccione;
    private String correoe;
    private String jornada;
    private String Fotoestudiante;

    public Estudiante() {
    }

    public Estudiante(String identificacione, String codigoe, String nombre1e, String nombre2e, String apellido1e, String apellido2e, String direccione, String correoe, String jornada, String Fotoestudiante) {
        this.identificacione = identificacione;
        this.codigoe = codigoe;
        this.nombre1e = nombre1e;
        this.nombre2e = nombre2e;
        this.apellido1e = apellido1e;
        this.apellido2e = apellido2e;
        this.direccione = direccione;
        this.correoe = correoe;
        this.jornada = jornada;
        this.Fotoestudiante = Fotoestudiante;
    }

    public Estudiante(String identificacione, String codigoe, String nombre1e, String apellido1e, String direccione, String correoe, String jornada) {
        this.identificacione = identificacione;
        this.codigoe = codigoe;
        this.nombre1e = nombre1e;
        this.apellido1e = apellido1e;
        this.direccione = direccione;
        this.correoe = correoe;
        this.jornada = jornada;
    }

    /**
     * Get the value of Fotoestudiante
     *
     * @return the value of Fotoestudiante
     */
    public String getFotoestudiante() {
        return Fotoestudiante;
    }

    /**
     * Set the value of Fotoestudiante
     *
     * @param Fotoestudiante new value of Fotoestudiante
     */
    public void setFotoestudiante(String Fotoestudiante) {
        this.Fotoestudiante = Fotoestudiante;
    }


    /**
     * Get the value of jornada
     *
     * @return the value of jornada
     */
    public String getJornada() {
        return jornada;
    }

    /**
     * Set the value of jornada
     *
     * @param jornada new value of jornada
     */
    public void setJornada(String jornada) {
        this.jornada = jornada;
    }


    /**
     * Get the value of correoe
     *
     * @return the value of correoe
     */
    public String getCorreoe() {
        return correoe;
    }

    /**
     * Set the value of correoe
     *
     * @param correoe new value of correoe
     */
    public void setCorreoe(String correoe) {
        this.correoe = correoe;
    }


    /**
     * Get the value of direccione
     *
     * @return the value of direccione
     */
    public String getDireccione() {
        return direccione;
    }

    /**
     * Set the value of direccione
     *
     * @param direccione new value of direccione
     */
    public void setDireccione(String direccione) {
        this.direccione = direccione;
    }


    /**
     * Get the value of apellido2e
     *
     * @return the value of apellido2e
     */
    public String getApellido2e() {
        return apellido2e;
    }

    /**
     * Set the value of apellido2e
     *
     * @param apellido2e new value of apellido2e
     */
    public void setApellido2e(String apellido2e) {
        this.apellido2e = apellido2e;
    }


    /**
     * Get the value of apellido1e
     *
     * @return the value of apellido1e
     */
    public String getApellido1e() {
        return apellido1e;
    }

    /**
     * Set the value of apellido1e
     *
     * @param apellido1e new value of apellido1e
     */
    public void setApellido1e(String apellido1e) {
        this.apellido1e = apellido1e;
    }


    /**
     * Get the value of nombre2e
     *
     * @return the value of nombre2e
     */
    public String getNombre2e() {
        return nombre2e;
    }

    /**
     * Set the value of nombre2e
     *
     * @param nombre2e new value of nombre2e
     */
    public void setNombre2e(String nombre2e) {
        this.nombre2e = nombre2e;
    }


    /**
     * Get the value of nombre1e
     *
     * @return the value of nombre1e
     */
    public String getNombre1e() {
        return nombre1e;
    }

    /**
     * Set the value of nombre1e
     *
     * @param nombre1e new value of nombre1e
     */
    public void setNombre1e(String nombre1e) {
        this.nombre1e = nombre1e;
    }


    /**
     * Get the value of codigoe
     *
     * @return the value of codigoe
     */
    public String getCodigoe() {
        return codigoe;
    }

    /**
     * Set the value of codigoe
     *
     * @param codigoe new value of codigoe
     */
    public void setCodigoe(String codigoe) {
        this.codigoe = codigoe;
    }


    /**
     * Get the value of identificacione
     *
     * @return the value of identificacione
     */
    public String getIdentificacione() {
        return identificacione;
    }

    /**
     * Set the value of identificacione
     *
     * @param identificacione new value of identificacione
     */
    public void setIdentificacione(String identificacione) {
        this.identificacione = identificacione;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "identificacione=" + identificacione + ", codigoe=" + codigoe + ", nombre1e=" + nombre1e + ", nombre2e=" + nombre2e + ", apellido1e=" + apellido1e + ", apellido2e=" + apellido2e + ", direccione=" + direccione + ", correoe=" + correoe + ", jornada=" + jornada + ", Fotoestudiante=" + Fotoestudiante + '}';
    }

    public boolean insertarEstdudiante(String sql) {
          ConnectBD objCon = new ConnectBD();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    }

}
