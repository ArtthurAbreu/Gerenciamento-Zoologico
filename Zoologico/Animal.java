package Zoologico;

import javax.swing.JOptionPane;

public abstract class Animal {
	 private double peso;
	 private int membros;
	 private int idade;
	 private String nome;
	 private Local jaula;
	 private int idAnimal;
	 
	 public Animal() {
	  this.peso = 0;
	  this.membros = 0;
	  this.idade = 0;
	  this.nome = "nome";
	  this.jaula = new Local();
	  this.idAnimal = 00;
	 }
	 public Animal(double peso, int membros, int idade, String nome, Local jaula, int idAnimal) {
	  this.peso = peso;
	  this.membros = membros;
	  this.idade = idade;
	  this.nome = nome;
	  this.jaula = jaula;
	  this.idAnimal = idAnimal;
	 }
	 
	 public double getPeso() {
	  return peso;
	 }
	 public void setPeso(double peso) {
	  this.peso = peso;
	 }
	 public int getMembros() {
	  return membros;
	 }
	 public void setMembros(int membros) {
	  this.membros = membros;
	 }
	 public int getIdade() {
	  return idade;
	 }
	 public void setIdade(int idade) {
	  this.idade = idade;
	 }
	 public String getNome() {
	  return nome;
	 }
	 public void setNome(String nome) {
	  this.nome = nome;
	 }

	 public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	 public Local getJaula() {
		return jaula;
	}
	public void setJaula(Local jaula) {
		this.jaula = jaula;
	}
	@Override
	public String toString() {
		return nome + " - INFORMAÇÕES: \n" + " PESO: " + peso + "\n QUANTIDADE DE MEMBROS:" + membros + "\n IDADE:" + idade + "\n" + jaula + "\n ID DO ANIMAL:" + idAnimal;
	}
	
	 public abstract void InfoAnimais();
	 public void VisitaAoVeterinario(Veterinario P, int V, int idAnimal) {
		  // TODO Auto-generated method stub
			 do {
				 try {
			 V = Integer.parseInt(JOptionPane.showInputDialog(null,"O ANIMAL "+ idAnimal + " ESTÁ DOENTE?\n 1 - SIM \n 2 - NÃO", "VISITA AO VETERINÁRIO", JOptionPane.INFORMATION_MESSAGE));
		  if (V == 1) {
			  JOptionPane.showMessageDialog(null,P.getNome() +" DEVE REALIZAR CONSULTA PARA O ANIMAL: " + idAnimal, "VISITA AO VETERINÁRIO", JOptionPane.INFORMATION_MESSAGE);
		  } else { 
		  if (V == 2){
			  JOptionPane.showMessageDialog(null, idAnimal + " COM SAÚDE!", "VISITA AO VETERINÁRIO", JOptionPane.INFORMATION_MESSAGE);
		  } } } catch(Exception E) {
			  JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!", "VISITA AO VETERINÁRIO", JOptionPane.INFORMATION_MESSAGE);
		  }} while(V != 1 && V != 2);
		 }
	 
}
