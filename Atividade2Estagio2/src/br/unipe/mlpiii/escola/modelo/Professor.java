package br.unipe.mlpiii.escola.modelo;

public class Professor {
	protected String nome;
	protected int matricula;
	protected String capacitacao;
	protected String especialidade;
	
	
	
	

  public Professor (String nome,String capacitacao,String especialidade,int matricula){
	  
	  this.nome = nome;
	  this.matricula = matricula;
	  this.capacitacao = capacitacao;
	  this.especialidade = especialidade;
	  
	  
  
  
  }





protected String getNome() {
	return nome;
}





protected void setNome(String nome) {
	this.nome = nome;
}





protected int getMatricula() {
	return matricula;
}





protected void setMatricula(int matricula) {
	this.matricula = matricula;
}





protected String getCapacitacao() {
	return capacitacao;
}





protected void setCapacitacao(String capacitacao) {
	this.capacitacao = capacitacao;
}





protected String getEspecialidade() {
	return especialidade;
}





protected void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}





}


