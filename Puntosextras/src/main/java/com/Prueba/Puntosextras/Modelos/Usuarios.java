package com.Prueba.Puntosextras.Modelos;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Usuarios implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Idusuario;
    private String Nombre;
    private String Apellido;
    private String Correolectronico;
    
    public Usuarios(){
        
    }

    public long getIdusuario() {
        return Idusuario;
    }

    public void setIdusuario(long idusuario) {
        Idusuario = idusuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreolectronico() {
        return Correolectronico;
    }

    public void setCorreolectronico(String correolectronico) {
        Correolectronico = correolectronico;
    }
    
    

    
}
