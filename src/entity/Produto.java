package entity;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String nmProduto;
	private int quantidade;
	
	public Produto() {

	}

	public Produto(String nmProduto, int quantidade) {
		this.nmProduto = nmProduto;
		this.quantidade = quantidade;
	}
	
	public Produto(long id, String nmProduto, int quantidade) {
		this.id = id;
		this.nmProduto = nmProduto;
		this.quantidade = quantidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
