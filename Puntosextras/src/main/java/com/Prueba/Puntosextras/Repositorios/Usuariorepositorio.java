package com.Prueba.Puntosextras.Repositorios;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Prueba.Puntosextras.Modelos.Usuarios;



@Repository
public interface Usuariorepositorio  extends JpaRepository<Usuarios, Long> {
    
}
