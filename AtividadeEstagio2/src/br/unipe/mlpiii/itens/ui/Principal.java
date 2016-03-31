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
		System.out.println("Não tem nenhum item no seu inventário!"); 
		}else{
		System.out.println("Inventário contém itens -> "+itens); 
		
		System.out.println("Contém o item Espada ? "+itens.contains("Espada")); 
		System.out.println("Lista dos itens: "+itens);
		
		System.out.println("Contém o item poção ? "+itens.contains("poção")); 
		System.out.println("Lista dos itens: "+itens);
		
		} 
     }
}


	


