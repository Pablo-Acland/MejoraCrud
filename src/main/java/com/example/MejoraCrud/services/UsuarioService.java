package com.example.MejoraCrud.services;


import com.example.MejoraCrud.Models.UsuarioModel;
import com.example.MejoraCrud.repositories.UsuarioRepositoari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepositoari usuarioRepositoari;

    public ArrayList<UsuarioModel>obtenerUsuario(){
        return (ArrayList<UsuarioModel>) usuarioRepositoari.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepositoari.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(long Id){
        return usuarioRepositoari.findById(Id);
    }

    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
        return usuarioRepositoari.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(long id){
        try {
                usuarioRepositoari.deleteById(id);
                return true;
        }catch (Exception err){
            return false;
        }
    }

    public ArrayList<UsuarioModel> obtenerPorNombre(String nombre){
        return usuarioRepositoari.findByNombre(nombre);
    }

    public ArrayList<UsuarioModel> obtenerPorEdad(Integer edad){
        return usuarioRepositoari.findByEdad(edad);
    }

}
