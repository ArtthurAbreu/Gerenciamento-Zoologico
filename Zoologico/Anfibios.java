package Zoologico;

import javax.swing.JOptionPane;

public class Anfibios extends Animal {

	public Anfibios(double peso, int membros, int idade, String nome, Local jaula, int idAnimal) {
		super(peso, membros, idade, nome, jaula, idAnimal);
	}

	 @Override
	 public void InfoAnimais() {
		 JOptionPane.showMessageDialog(null,"PRINCIPAIS CARACTERÍSTICAS = A MAIORIA TEM QUATRO MENBROS. NA FASE LARVAL, SÃO AQUÁTICOS E NA ADULTA, TERRESTRE \n REPRODUÇÂO = SEXUADA  \n LOCOMOÇÃO = POR MEIO DE PATAS(TERRESTRE) OU ÓRGÃOS ESPECIALIZADOS(AQUÁTICOS) \n RESPIRAÇÃO = CUTÂNEA E PULMONAR \n HÁBITAT = AQUÁTICO E TERRESTRE", "ANFÍBIOS", JOptionPane.INFORMATION_MESSAGE);
	 }

	@Override
	public String toString() {
		return getNome() + " - ANFÍBIO \n INFORMAÇÕES: \n" + " PESO: " + getPeso() + "\n QUANTIDADE DE MEMBROS:" + getMembros() + "\n IDADE:" + getIdade() + "\n" + getJaula() + "\n ID DO ANIMAL:" + getIdAnimal();
	}
}
