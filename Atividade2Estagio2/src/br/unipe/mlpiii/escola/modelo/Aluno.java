package br.unipe.mlpiii.escola.modelo;

public class Aluno {
	protected   String nome;
    protected   int matricula;
    protected   int nota;
    protected   int nota2;   
    protected   float med;  
	protected   int matr;
	
	
	
	public Aluno (String nome,int matricula,int nota,int nota2,float med,int matr){
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
		this.nota2 = nota2;
		this.med = med;
		this.matr = matr;
		
	}
	
	
	public void Check (int matr){
		
		if(matr>15){
			
			System.out.println("Aluno reprovado por faltas");
		}
		else{
			
			System.out.println("Aluno sem pendencias");
		}
		
	}
	
	public void Calculo(int nota,int nota2,float med){
		
		med = (nota + nota2)/2;
		if(med>=7){
			System.out.println("Aluno Aprovado");
			
		}
		else{
			System.out.println("Reprovado por media insuficiente");
		}
		
	}
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public float getMed() {
		return med;
	}
	public void setMed(float med) {
		this.med = med;
	}
	public int getMatr() {
		return matr;
	}
	public void setMatr(int matr) {
		this.matr = matr;
	}


}



