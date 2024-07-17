package com.casb.enchentesBrasil.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Abrigo implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String nome;
    private String endereco;
    private String responsavel;
    private String telefone;
    private String email;
    private Integer capacidadePessoas;
    private List<Doacao> doacoesRecebidas;
    private List<OrdemPedido> ordensPedido;
    
    public Abrigo() {
    }

	public Abrigo(Long id, String nome, String endereco, String responsavel, String telefone, String email,
			Integer capacidadePessoas, List<Doacao> doacoesRecebidas, List<OrdemPedido> ordensPedido) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.responsavel = responsavel;
		this.telefone = telefone;
		this.email = email;
		this.capacidadePessoas = capacidadePessoas;
		this.doacoesRecebidas = doacoesRecebidas;
		this.ordensPedido = ordensPedido;
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

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(Integer capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public List<Doacao> getDoacoesRecebidas() {
		return doacoesRecebidas;
	}

	public void setDoacoesRecebidas(List<Doacao> doacoesRecebidas) {
		this.doacoesRecebidas = doacoesRecebidas;
	}

	public List<OrdemPedido> getOrdensPedido() {
		return ordensPedido;
	}

	public void setOrdensPedido(List<OrdemPedido> ordensPedido) {
		this.ordensPedido = ordensPedido;
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
		Abrigo other = (Abrigo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Abrigo [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", responsavel=" + responsavel
				+ ", telefone=" + telefone + ", email=" + email + ", capacidadePessoas=" + capacidadePessoas + "]";
	}
}
