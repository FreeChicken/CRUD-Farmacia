package com.farmacia.precinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.precinho.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
