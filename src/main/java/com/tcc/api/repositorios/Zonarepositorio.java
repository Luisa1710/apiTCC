package com.tcc.api.repositorios;

import com.tcc.api.entidades.Zona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Zonarepositorio extends JpaRepository<Zona,Integer> {
    void deleteAllById(Integer id);
}
