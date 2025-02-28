package com.api.demo.controladores;

import com.api.demo.modelos.usuarioModelo;
import com.api.demo.servicios.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/usuarios")

public class usuarioControl {

    @Autowired
    private IUsuarioServicio UServicio;

    @GetMapping
    public ArrayList<usuarioModelo> listarUsuarios() {
        return this.UServicio.obtenerUsuarios();
    }

    @PostMapping()
    public usuarioModelo guardarUsuario(@RequestBody usuarioModelo usuario) {
        return this.UServicio.guardarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Optional<usuarioModelo> obtenerUsuarioPorId(@PathVariable int id) {
        return this.UServicio.obtenerUsuarioPorId(id);
    }

    @PutMapping("/{id}")
    public usuarioModelo actualizarUsuario(@RequestBody usuarioModelo usuario, @PathVariable Integer id) {
        return this.UServicio.actualizarUsuarioId(usuario, id);
    }

    @DeleteMapping("/{id}")
    public Boolean eliminarUsuario(@PathVariable int id) {
        return this.UServicio.eliminarUsuario(id);
    }

}
