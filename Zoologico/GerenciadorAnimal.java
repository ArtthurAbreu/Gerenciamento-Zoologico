package Zoologico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerenciadorAnimal implements Gerenciador {
	private ArrayList<Animal> listaAnimal;

	public GerenciadorAnimal() {
		setListaAnimal(new ArrayList<Animal>());
	}

	public ArrayList<Animal> getListaAnimal() {
		return listaAnimal;
	}

	public void setListaAnimal(ArrayList<Animal> listaAnimal) {
		this.listaAnimal = listaAnimal;
	}

	public void AddAnimal(Animal A) {
		
		if(listaAnimal.size()== 0 && 15 > A.getJaula()){
		JOptionPane.showMessageDialog(null, "ANIMAL NÃO PODE SER ADICIONADO!", "ERRO", JOptionPane.ERROR_MESSAGE);
		return;
		}
		for (Animal Z : listaAnimal) {
			if (A.getIdAnimal() == Z.getIdAnimal() || A.getJaula() == Z.getJaula()
					|| 15 > A.getJaula()) {
				JOptionPane.showMessageDialog(null, "ANIMAL NÃO PODE SER ADICIONADO!", "ERRO", JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "ANIMAL ADICIONADO COM SUCESSO!", "", JOptionPane.INFORMATION_MESSAGE);
		listaAnimal.add(A);
	}

	public void remover(int idAnimal) {
		for (Animal A1 : listaAnimal) {
			if (A1.getIdAnimal() == idAnimal) {
				JOptionPane.showMessageDialog(null, "ANIMAL REMOVIDO COM SUCESSO!", "", JOptionPane.INFORMATION_MESSAGE);
				listaAnimal.remove(A1);
				return;
			}

		}
		JOptionPane.showMessageDialog(null, "ANIMAL INEXISTENTE!", "ERRO", JOptionPane.ERROR_MESSAGE);
	}

	public void imprimir(int idAnimal) {
		for (Animal A1 : listaAnimal) {
			if (A1.getIdAnimal() == idAnimal) {
				JOptionPane.showMessageDialog(null, A1);
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "ANIMAL INEXISTENTE!", "ERRO", JOptionPane.ERROR_MESSAGE);
	}

	Animal buscarAnimal(int idAnimal) {
		for (Animal z : listaAnimal) {
			if (idAnimal == z.getIdAnimal()) {
				// z.imprimir();
				return z;
			}
		}
		JOptionPane.showMessageDialog(null, "ANIMAL INEXISTENTE!", "ERRO", JOptionPane.ERROR_MESSAGE);
		return null;
	}

	public void imprimirTodos() {
		if (listaAnimal.isEmpty()) {
			JOptionPane.showMessageDialog(null, "LISTA VAZIA!", "", JOptionPane.WARNING_MESSAGE);
		} else {
			for (Animal z : listaAnimal) {
				JOptionPane.showMessageDialog(null, z);
			}
		}
	}
}
