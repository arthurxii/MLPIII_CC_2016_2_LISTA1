package br.unipe.mlpiii.itens.modelo;

public class Inventário {
	protected String colecao;
	
	public Inventário(String colecao){
		this.colecao = colecao;
	}

	public String getColecao() {
		return colecao;
	}

	public void setColecao(String colecao) {
		this.colecao = colecao;
	}
	
}
