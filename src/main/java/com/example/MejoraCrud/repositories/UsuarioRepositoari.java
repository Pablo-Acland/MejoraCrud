package com.example.MejoraCrud.repositories;


import com.example.MejoraCrud.Models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import java.util.ArrayList;

@Repository
public interface UsuarioRepositoari extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
