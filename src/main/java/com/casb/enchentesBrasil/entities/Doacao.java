package com.casb.enchentesBrasil.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Doacao implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String tipo; // "roupa", "higiene", "alimento"
    private String descricao;
    private String genero; // (para roupa)
    private String tamanho; // (para roupa)
    private String unidadeMedida; // (para alimento)
    private Integer quantidade;
    private LocalDate validade; // (para alimento)
    private CentroDistribuicao centroDistribuicao;
    
    public Doacao() {
    }

	public Doacao(Long id, String tipo, String descricao, String genero, String tamanho, String unidadeMedida,
			Integer quantidade, LocalDate validade, CentroDistribuicao centroDistribuicao) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descricao = descricao;
		this.genero = genero;
		this.tamanho = tamanho;
		this.unidadeMedida = unidadeMedida;
		this.quantidade = quantidade;
		this.validade = validade;
		this.centroDistribuicao = centroDistribuicao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public CentroDistribuicao getCentroDistribuicao() {
		return centroDistribuicao;
	}

	public void setCentroDistribuicao(CentroDistribuicao centroDistribuicao) {
		this.centroDistribuicao = centroDistribuicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doacao other = (Doacao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Doacao [id=" + id + ", tipo=" + tipo + ", descricao=" + descricao + ", genero=" + genero + ", tamanho="
				+ tamanho + ", unidadeMedida=" + unidadeMedida + ", quantidade=" + quantidade + ", validade=" + validade
				+ "]";
	}
}
