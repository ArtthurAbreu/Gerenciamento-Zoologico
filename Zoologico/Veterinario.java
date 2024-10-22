package Zoologico;

import javax.swing.JOptionPane;

public class Veterinario extends Funcionario {
	private double comissaoAnimal;
	private int quantAnimais;
	
	public Veterinario() {
		super();
		this.comissaoAnimal = 00;
		this.quantAnimais = 00;
		// TODO Auto-generated constructor stub
	}

	public Veterinario(String nome, int matricula, double salario_base, Local sala, double comissaoAnimal, int quantAnimais) {
		super(nome, matricula, salario_base, sala);
		this.comissaoAnimal = comissaoAnimal;
		this.quantAnimais = quantAnimais;
		// TODO Auto-generated constructor stub
	}

	public double getComissaoAnimal() {
		return comissaoAnimal;
	}

	public void setComissaoAnimal(double comissaoAnimal) {
		this.comissaoAnimal = comissaoAnimal;
	}

	public int getQuantAnimais() {
		return quantAnimais;
	}

	public void setQuantAnimais(int quantAnimais) {
		this.quantAnimais = quantAnimais;
	}

	@Override
	public double calculaSalario() {
		double sv = getSalario_base()+(getComissaoAnimal()*getQuantAnimais());
		JOptionPane.showMessageDialog(null, "SALÁRIO DO VETERINÁRIO: " + sv, "SALÁRIO DO VETERINÁRIO ", JOptionPane.INFORMATION_MESSAGE);
		return sv;
	}

	@Override
	public String toString() {
		return getNome() + " - VETERINÁRIO \n INFORMAÇÕES:\n" + " MATRÍCULA:" + getMatricula() + "\n SALÁRIO BASE:" + getSalario_base() + "\n" + getSala();
	}

	
}
