package Zoologico;

import javax.swing.JOptionPane;

public class Mamifero extends Animal{
	 private String cordepelo;
	 private int tempodegestacao;

	//  public Mamifero() {
	//   super();
	//   this.cordepelo = "cordepelo";
	//   this.tempodegestacao = 0;
	//  }
	
	 
	 
	 public Mamifero(double peso, int membros, int idade, String nome, Local jaula, int idAnimal, String cordepelo, int tempodegestacao) {
		super(peso, membros, idade, nome, jaula, idAnimal);
		this.cordepelo = cordepelo;
		this.tempodegestacao = tempodegestacao;
	}



	public String getCordepelo() {
	  return cordepelo;
	 }
	 public void setCordepelo(String cordepelo) {
	  this.cordepelo = cordepelo;
	 }
	 public int getTempodegestacao() {
	  return tempodegestacao;
	 }
	 public void setTempodegestacao(int tempodegestacao) {
	  this.tempodegestacao = tempodegestacao;
	 }
	 @Override
	 public String toString() {
		 return getNome() + " - MAMÍFERO \n INFORMAÇÕES: \n " + "PESO: " + getPeso() + "\n QUANTIDADE DE MEMBROS: " + getMembros() + "\n IDADE: " + getIdade() + "\n" + getJaula() + "\n ID DO ANIMAL: " + getIdAnimal() + "\n COR DO PELO: " + cordepelo + "\n TEMPO DE GESTAÇÃO: " + tempodegestacao;		 
	 }

	 //funçoes herdadas da classe animal

	 @Override
	 public void InfoAnimais() {
	  // TODO Auto-generated method stub
		 JOptionPane.showMessageDialog(null,"PRINCIPAIS CARACTERÍSTICAS = PELOS E GLÂNDULAS MAMÁRIAS \n REPRODUÇÃO= SEXUADA \n LOCOMOÇÃO = POR MEIO DE PATAS/PÉS OU NADADEIRAS \n  RESPIRAÇÃO = PULMONAR \n HÁBITAT = AQUÁTICO E TERRESTRE", "MAMÍFEROS", JOptionPane.INFORMATION_MESSAGE);
	 }

	 public void Analisedagestacao(int tempGravida){
		 if(tempGravida == getTempodegestacao()) {
			 JOptionPane.showMessageDialog(null,"O PARTO ESTÁ PRÓXIMO!","", JOptionPane.WARNING_MESSAGE);
		 } if (tempGravida >= (getTempodegestacao()/2) && tempGravida < getTempodegestacao()) {
			 JOptionPane.showMessageDialog(null,"REALIZAR ULTRASSOM!","", JOptionPane.WARNING_MESSAGE);
		 }else {
			 JOptionPane.showMessageDialog(null,"\n" + getNome() + " ESTÁ GRÁVIDA!","", JOptionPane.WARNING_MESSAGE); 
		 }
	 }
}
