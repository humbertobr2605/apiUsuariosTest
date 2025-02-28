package com.api.demo.servicios;

import com.api.demo.modelos.usuarioModelo;
import com.api.demo.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class usuarioServicio implements IUsuarioServicio{

    @Autowired
    IUsuarioRepositorio usuarioRepositorio;

    public ArrayList<usuarioModelo> obtenerUsuarios() {
        return (ArrayList<usuarioModelo>) usuarioRepositorio.findAll();
    }

    public usuarioModelo guardarUsuario(usuarioModelo usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public Optional<usuarioModelo> obtenerUsuarioPorId(int id) {
        return usuarioRepositorio.findById(id);
    }

    public usuarioModelo actualizarUsuarioId(usuarioModelo usuariorequerido, int id) {
        if(usuarioRepositorio.existsById(id)){
            usuarioModelo usuario = usuarioRepositorio.findById(id).get();
            usuario.setNombre(usuariorequerido.getNombre());
            usuario.setApellido(usuariorequerido.getApellido());
            usuario.setCorreo(usuariorequerido.getCorreo());
            return usuario;
        }else{
            usuarioModelo usuario = new usuarioModelo();
            return usuario;
        }

    }

    public Boolean eliminarUsuario(Integer id) {
        Optional<usuarioModelo> usuario = obtenerUsuarioPorId(id);
        if (usuario.isPresent()) {
            usuarioRepositorio.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
