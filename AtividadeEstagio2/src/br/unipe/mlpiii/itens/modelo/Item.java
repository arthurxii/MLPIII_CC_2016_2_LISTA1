package br.unipe.mlpiii.itens.modelo;

public class Item implements Comparable<Item>{
	protected int codigo;
	protected String descricao;
	protected int outra;
	
public Item(int codigo, String descricao){
	this.codigo = codigo;
	this.descricao = descricao;
}

public Item(String string) {
	// TODO Auto-generated constructor stub
}

public int compareTo(Item item){
if (this.outra > item.outra){ 
return	-1; 
} 
if(this.outra < item.outra){ 
return	1; 
} 
return 0;
}


public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public String toString() {
	  return codigo + "codigo" + descricao + "descricao";  
	  }
}
