package br.unipe.mlpiii.escola.ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

			public static void main(String[] args) {
				
				
				Scanner scan = new Scanner(System.in );
				 int op;
				
				
				
				
				ArrayList<String> aluno = new ArrayList();
				  aluno.add("Cremilda");
				  aluno.add("Marcksonbergai");
				  aluno.add("Adeilton");
				  aluno.add("Kleysiani");
				  aluno.add("Waldislay");
				  aluno.add("Janio");
				
				
				  System.out.println("1 :Incluir aluno");
				  System.out.println("2 :Remover aluno");
				  System.out.println("3 :Verificar se um aluno está matriculado ");
				  System.out.println("4 :Listar todos os alunos aprovados ");
				  System.out.println("5 :Listar todos os alunos reprovados por falta");
				  System.out.println("6 :Listar por ordem alfabética");
				  System.out.println("Informe a opcão");
				  op=scan.nextInt();
				  
				  
				  
				  
			switch (op) {
			case 1: 
				aluno.add("Kleberson");
				aluno.add("Rasputia");
				System.out.println("Alunos adicionados com sucesso:"+aluno);
				
		    case 2:
		    	aluno.remove("Janio");
		    	System.out.println("Aluno removido com sucesso:"+aluno);
		    	
		    case 3:
		    	if(aluno.isEmpty()){ 
		    		System.out.println("Janio está matriculado?");
		    		}else{ 
		    		System.out.println("Sim, Matriculados-> "+aluno); 
		    		}
		    	
			case 4:
				aluno.addAll();
				System.out.println("Lista de aprovados: "+aluno);
				
			case 5:
			case 6:	
			}	
				
				
			}
	

	}


