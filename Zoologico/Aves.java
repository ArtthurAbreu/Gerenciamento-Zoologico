package Zoologico;

import javax.swing.JOptionPane;

public class Aves extends Animal {
	private String cordapena;

	//  public Aves() {
	//   super();
	//   this.cordapena = "cordapena";
	//  }

	 public Aves(double peso, int membros, int idade, String nome, Local2 jaula, int idAnimal, String cordapena) {
	  super(peso, membros, idade, nome, jaula, idAnimal);
	  this.cordapena = cordapena;
	 }

	 public String getCordapena() {
	  return cordapena;
	 }

	 public void setCordapena(String cordapena) {
	  this.cordapena = cordapena;
	 }

	 @Override
	 public String toString() {
		 return getNome() + " - AVE \n INFORMAÇÕES: \n" + " PESO: " + getPeso() + "\n QUANTIDADE DE MEMBROS:" + getMembros() + "\n IDADE:" + getIdade() + "\n" + getJaula() + "\n ID DO ANIMAL:" + getIdAnimal() + "\n COR DAS PENAS:" + cordapena;
	 }

	 
	 @Override
	 public void InfoAnimais() {
	  // TODO Auto-generated method stub
		 JOptionPane.showMessageDialog(null, "PRINCIPAIS CARACTERÍSTICAS = PERNAS E BICOS, A MAIORIA VOA \n REPRODUÇÃO= SEXUADA \n LOCOMOÇÃO = POR MEIO DE ASAS OU PATAS \n  RESPIRAÇÃO = PULMONAR \n HÁBITAT = TERRESTRE", "AVES", JOptionPane.INFORMATION_MESSAGE);
	 }
}
