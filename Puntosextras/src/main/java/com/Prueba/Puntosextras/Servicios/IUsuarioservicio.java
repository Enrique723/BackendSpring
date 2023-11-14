package com.Prueba.Puntosextras.Servicios;

import java.util.List;
import com.Prueba.Puntosextras.Modelos.Usuarios;

public interface IUsuarioservicio {
    public List<Usuarios> obtenerusuarios();
    public Usuarios obtenerusuariosporid(long Idusuario);
}
