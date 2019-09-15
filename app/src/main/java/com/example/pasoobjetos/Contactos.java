package com.example.pasoobjetos;

import java.io.Serializable;
import java.util.List;

public class Contactos implements Serializable {

    private String usuario;
    private String email;
    private String twitter;
    private String telefono;
    private String fnacimiento;
    public static List<Contactos> Listcontactos;

    public Contactos(String usuario, String email, String twitter, String telefono, String fnacimiento) {
        this.usuario = usuario;
        this.email = email;
        this.twitter = twitter;
        this.telefono = telefono;
        this.fnacimiento = fnacimiento;
    }

    public static List<Contactos> getListcontactos() {
        return Listcontactos;
    }

    public void agregar(Contactos c){
        getListcontactos().add(c);
    }

    public static void setListcontactos(List<Contactos> listcontactos) {
        Listcontactos = listcontactos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
}
