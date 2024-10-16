package Zoologico;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario{
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, int matricula, double salario_base, Local2 sala) {
		super(nome, matricula, salario_base, sala);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		double sg = getSalario_base()*2;
		JOptionPane.showMessageDialog(null, "SALÁRIO DO GERENTE: " + sg, "SALÁRIO DO GERENTE ", JOptionPane.INFORMATION_MESSAGE);
		return sg;
	}

	@Override
	public String toString() {
		return getNome() + " - GERENTE \n INFORMAÇÕES:\n" + " MATRÍCULA:" + getMatricula() + "\n SALÁRIO BASE:" + getSalario_base() + "\n" + getSala();
	}

}
