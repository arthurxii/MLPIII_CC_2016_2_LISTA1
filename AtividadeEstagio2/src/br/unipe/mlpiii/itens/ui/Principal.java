package br.unipe.mlpiii.itens.ui;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList itens = new ArrayList();
		itens.add("Espada");
		itens.add("Cajado");
		itens.add("Escudo");
		itens.add("Arco");
		itens.add("Flechas");
		itens.add("Adaga");
	
		Collections.sort(itens);
		
		if(itens.isEmpty()){ 
		System.out.println("N�o tem nenhum item no seu invent�rio!"); 
		}else{
		System.out.println("Invent�rio cont�m itens -> "+itens); 
		
		System.out.println("Cont�m o item Espada ? "+itens.contains("Espada")); 
		System.out.println("Lista dos itens: "+itens);
		
		System.out.println("Cont�m o item po��o ? "+itens.contains("po��o")); 
		System.out.println("Lista dos itens: "+itens);
		
		} 
     }
}


	


