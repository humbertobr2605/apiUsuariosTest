package com.api.demo.servicios;

import com.api.demo.modelos.usuarioModelo;

import java.util.ArrayList;
import java.util.Optional;

public interface IUsuarioServicio {

    public ArrayList<usuarioModelo> obtenerUsuarios();

    public usuarioModelo guardarUsuario(usuarioModelo usuario);

    public Optional<usuarioModelo> obtenerUsuarioPorId(int id);

    public usuarioModelo actualizarUsuarioId(usuarioModelo usuariorequerido, int id);

    public Boolean eliminarUsuario(Integer id);

}
