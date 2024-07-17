package com.casb.enchentesBrasil.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class OrdemPedido implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
    private LocalDate data;
    private Abrigo abrigo;
    private List<ItemPedido> itensPedido;
    private String status; // "atendido", "recusado"
    private String motivoRecusa;
    
    public OrdemPedido() {
    }

	public OrdemPedido(Long id, LocalDate data, Abrigo abrigo, List<ItemPedido> itensPedido, String status,
			String motivoRecusa) {
		super();
		this.id = id;
		this.data = data;
		this.abrigo = abrigo;
		this.itensPedido = itensPedido;
		this.status = status;
		this.motivoRecusa = motivoRecusa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Abrigo getAbrigo() {
		return abrigo;
	}

	public void setAbrigo(Abrigo abrigo) {
		this.abrigo = abrigo;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMotivoRecusa() {
		return motivoRecusa;
	}

	public void setMotivoRecusa(String motivoRecusa) {
		this.motivoRecusa = motivoRecusa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		OrdemPedido other = (OrdemPedido) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "OrdemPedido [id=" + id + ", data=" + data + ", abrigo=" + abrigo + ", status=" + status
				+ ", motivoRecusa=" + motivoRecusa + "]";
	}
}
