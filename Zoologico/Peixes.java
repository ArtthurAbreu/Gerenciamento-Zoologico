package Zoologico;

import javax.swing.JOptionPane;

public class Peixes extends Animal {
	private String cordeescama;

	  public Peixes() {
	   super();
	   this.cordeescama = "cordeescama";
	  }

	  public Peixes(double peso, int membros, int idade, String nome, Local jaula, int idAnimal, String cordeescama) {
	   super(peso, membros, idade, nome, jaula, idAnimal);
	   this.cordeescama = cordeescama;
	  }

	  public String getCordeescama() {
	   return cordeescama;
	  }

	  public void setCordeescama(String cordeescama) {
	   this.cordeescama = cordeescama;
	  }

	  @Override
	  public String toString() {
		  return getNome() + " - PEIXE \n INFORMAÇÕES: \n" + " PESO: " + getPeso() + "\n QUANTIDADE DE MEMBROS: " + getMembros() + "\n IDADE: " + getIdade() + "\n" + getJaula() + "\n ID DO ANIMAL: " + getIdAnimal() + "\n COR DAS ESCAMAS: " + cordeescama;
	  }

	 @Override
	 public void InfoAnimais() {
	  // TODO Auto-generated method stub
		 JOptionPane.showMessageDialog(null, "PRINCIPAIS CARACTERÍSTICAS = POSSUEM ESCAMAS E NADADEIRAS \n REPRODUÇAO = SEXUADA \n LOCOMOÇÃO = POR MEIO DE NADADEIRAS \n RESPIRAÇÃO = BRANQUIAL \n HÁBITAT = AQUÁTICO", "PEIXES" , JOptionPane.INFORMATION_MESSAGE);
	 }

}
