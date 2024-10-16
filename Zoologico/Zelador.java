package Zoologico;

import javax.swing.JOptionPane;

public class Zelador extends Funcionario {
	public Zelador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zelador(String nome, int matricula, double salario_base, Local2 sala) {
		super(nome, matricula, salario_base, sala);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		double sz = getSalario_base();
		JOptionPane.showMessageDialog(null, "SALÁRIO DO ZELADOR: " + sz, "SALÁRIO DO ZELADOR ", JOptionPane.INFORMATION_MESSAGE);
		return sz;
	}

	@Override
	public String toString() {
		return getNome() + " - ZELADOR \n INFORMAÇÕES:\n" + " MATRÍCULA:" + getMatricula() + "\n SALÁRIO BASE:" + getSalario_base() + "\n" + getSala();
	}
	
}
