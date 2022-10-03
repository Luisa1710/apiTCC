package com.tcc.api.repositorios;

import com.tcc.api.entidades.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mercanciarepositorio extends JpaRepository<Mercancia,Integer> {
}
