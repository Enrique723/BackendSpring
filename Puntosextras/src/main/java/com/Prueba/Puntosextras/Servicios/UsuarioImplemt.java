package com.Prueba.Puntosextras.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Prueba.Puntosextras.Modelos.Usuarios;
import com.Prueba.Puntosextras.Repositorios.Usuariorepositorio;


@Service
public class UsuarioImplemt implements IUsuarioservicio{
    
    @Autowired    
    Usuariorepositorio usuariorepositorio;  

    @Override
    public List<Usuarios> obtenerusuarios() {
       return usuariorepositorio.findAll();
    }

    @Override
    public Usuarios obtenerusuariosporid(long Idusuario) {
       return usuariorepositorio.findById(Idusuario).orElse(null);
    }


}
