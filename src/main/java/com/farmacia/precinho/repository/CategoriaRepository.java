package com.farmacia.precinho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmacia.precinho.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByTipoMedicamentoContainingIgnoreCase(@Param("tipoMedicamento") String tipoMedicamento);
	public List<Categoria> findAllByRemedioControlado(@Param("remedioControlado") Boolean remedioControlado);
}
