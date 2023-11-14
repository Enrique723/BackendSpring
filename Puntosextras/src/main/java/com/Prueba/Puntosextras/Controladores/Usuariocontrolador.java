package com.Prueba.Puntosextras.Controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Prueba.Puntosextras.Modelos.Usuarios;
import com.Prueba.Puntosextras.Servicios.UsuarioImplemt;

@RestController
@RequestMapping("/api")
public class Usuariocontrolador {
    @Autowired
    UsuarioImplemt usuarioImplemt;


    @GetMapping("/usuarios")
    public List<Usuarios> obtenerusuarios (){
        return usuarioImplemt.obtenerusuarios();
    }
    @GetMapping("/usuarios/{Idusuario}")
    public ResponseEntity<Usuarios> obtenerusuarios_id(@PathVariable long Idusuario){
        Usuarios usuarioporaid= usuarioImplemt.obtenerusuariosporid(Idusuario);
        return ResponseEntity.ok(usuarioporaid);
    }
}
