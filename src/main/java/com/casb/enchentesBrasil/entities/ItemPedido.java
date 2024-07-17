package com.casb.enchentesBrasil.entities;

import java.util.Objects;

public class ItemPedido {

	private Long id;
    private OrdemPedido ordemPedido;
    private Doacao produto;
    private Integer quantidade;
    
    public ItemPedido() {
    }

	public ItemPedido(Long id, OrdemPedido ordemPedido, Doacao produto, Integer quantidade) {
		super();
		this.id = id;
		this.ordemPedido = ordemPedido;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrdemPedido getOrdemPedido() {
		return ordemPedido;
	}

	public void setOrdemPedido(OrdemPedido ordemPedido) {
		this.ordemPedido = ordemPedido;
	}

	public Doacao getProduto() {
		return produto;
	}

	public void setProduto(Doacao produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
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
		ItemPedido other = (ItemPedido) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", ordemPedido=" + ordemPedido + ", produto=" + produto + ", quantidade="
				+ quantidade + "]";
	}
}
