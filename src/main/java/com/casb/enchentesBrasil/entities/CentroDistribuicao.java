package com.casb.enchentesBrasil.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class CentroDistribuicao implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
    private String nome;
    private String endereco;
    private List<Doacao> doacoes;
    
    public CentroDistribuicao() {
    }

	public CentroDistribuicao(Long id, String nome, String endereco, List<Doacao> doacoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.doacoes = doacoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
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
		CentroDistribuicao other = (CentroDistribuicao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "CentroDistribuicao [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", doacoes=" + doacoes
				+ "]";
	}
}
