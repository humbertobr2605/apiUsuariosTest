package com.api.demo.repositorios;

import com.api.demo.modelos.usuarioModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<usuarioModelo, Integer> {

    List<usuarioModelo> id(Integer id);
}
