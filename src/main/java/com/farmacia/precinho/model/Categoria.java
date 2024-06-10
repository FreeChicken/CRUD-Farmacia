package com.farmacia.precinho.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotBlank(message = "O atributo Tipo de Produto, é obrigatório! ")
	@Size(min = 1, max = 50, message = "O atributo título deve conter no mínimo 1 e no máximo 50 caracteres")
	private String tipoMedicamento;
	
	@NotNull(message = "Deve ser informado se é (true) ou não (false) medicamento controlado!")
	private Boolean remedioControlado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoMedicamento() {
		return tipoMedicamento;
	}

	public void setTipoMedicamento(String tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}

	public Boolean getRemedioControlado() {
		return remedioControlado;
	}

	public void setRemedioControlado(Boolean remedioControlado) {
		this.remedioControlado = remedioControlado;
	} 
	
}
	
	